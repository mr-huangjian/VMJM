package mr.huangjian.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MoocResource implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() {
        // 记得导入：import org.springframework.core.io.Resource;
        String path = "classpath:resource.txt";
        path = "file:/Users/Calorie/IdeaProjects/spring-demo2/src/main/resources/resource.txt";
        path = "url:https://www.baidu.com/";

        Resource resource = applicationContext.getResource(path);
        System.out.println(resource.getFilename());

        try {
            System.out.println(resource.contentLength());
            System.out.println(resource.getURI());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
