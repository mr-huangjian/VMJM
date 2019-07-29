package mr.huangjian;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Filter f1 = new Filter();
        f1.setId(10); // 查询 id=10 的用户

        Filter f2 = new Filter();
        f2.setUserName("lucy"); // 模糊查询 userName=lucy 的用户

        Filter f3 = new Filter();
        f3.setEmail("1776549643@qq.com,mr.huangjian@foxmail.com"); // 查询 email 为其中之一的用户

        Filter f4 = new Filter();
        f4.setEmail("2722260796@qq.com");
        f4.setAge(18);

        String sql1 = query(f1);
        String sql2 = query(f2);
        String sql3 = query(f3);
        String sql4 = query(f4);

        System.out.println(sql1);
        System.out.println(sql2);
        System.out.println(sql3);
        System.out.println(sql4);

    }

    public static String query(Object filter) {
        StringBuilder sql = new StringBuilder();

        // 1. 获取类名
        /*
            try {
                Class cls = Class.forName("mr.huangjian.Filter");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        */

        Class cls = filter.getClass();

        // 2. 判断注解是否存在
        boolean ann_exist = cls.isAnnotationPresent(Table.class);
        if (!ann_exist) {
            return null;
        }

        // 3. 获取注解相关信息
        Table table = (Table)cls.getAnnotation(Table.class);
        String tableName = table.value();

        // 4. 初始化 SQL 语句
        sql.append("select * from ").append(tableName).append(" where 1=1");

        // 5. 遍历所有字段
        /**
         * 遍历所有字段
         *  Field[] fields = cls.getDeclaredFields();
         *
         * 遍历所有方法
         *  Method[] methods = cls.getMethods();
         */

        for (Field field: cls.getDeclaredFields()) {
            /*
                Annotation[] anns = field.getAnnotations();
                for (Annotation ann: anns) {
                    if (ann instanceof Column) {
                        Column column = (Column)field.getAnnotation(Column.class);
                        // ....
                    }
                }
            */

            boolean exist = field.isAnnotationPresent(Column.class);
            if (!exist) {
                continue;
            }

            Column column = (Column)field.getAnnotation(Column.class);
            String columnName = column.value();

            String fieldName = field.getName();
            String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

            Object value = null;

            try {
                Method method = cls.getMethod(methodName);
                value = method.invoke(filter);
            } catch (Exception e) {
                e.printStackTrace();
            }

            boolean unusual = (value == null) || (value instanceof Integer && (Integer)value == 0);
            if (unusual) {
                continue;
            }

            sql.append(" and ").append(fieldName);

            if (value instanceof String) {
                if (((String) value).contains(",")) {
                    String[] values = ((String) value).split(",");
                    sql.append(" in (");
                    for (String string: values) {
                        sql.append("'").append(string).append("'").append(",");
                    }
                    sql.deleteCharAt(sql.length() - 1);
                    sql.append(")");
                } else {
                    sql.append("=").append("'").append(value).append("'");
                }
            } else {
                sql.append("=").append(value);
            }
        }

        return sql.toString();
    }
}
