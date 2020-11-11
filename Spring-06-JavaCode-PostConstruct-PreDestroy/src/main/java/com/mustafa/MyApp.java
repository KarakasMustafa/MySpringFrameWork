package com.mustafa;

import com.mustafa.configs.MyAppConfig;
import com.mustafa.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(MyAppConfig.class);

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();

        ((AnnotationConfigApplicationContext) container).close();

    }
}
