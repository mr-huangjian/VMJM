

1. 数据类型 Field field
```java
import java.lang.reflect.Field;
```
https://blog.csdn.net/u014102846/article/details/81481126
https://blog.csdn.net/z69183787/article/details/39343259
https://blog.csdn.net/Goodbye_Youth/article/details/83960962

2. 编译器提示 Unhandled exception
Mac使用快捷键："Command + option + T" 快速生成对应代码
https://blog.csdn.net/De_Moivre/article/details/79473681

3. 类型转换错误 java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
```java
String value = (String)method.invoke(filter, null);
```
解决方法如下：
```java
String value = String.valueOf(method.invoke(filter, null));
```
或者
```java
Object value = method.invoke(filter, null);
```