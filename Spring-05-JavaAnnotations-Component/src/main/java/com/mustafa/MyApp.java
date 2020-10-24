package com.mustafa;

import com.mustafa.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java",Course.class);
        course.getTeachingHours();

        Course course2 = container.getBean("selenium",Course.class); // if only first letter of Class name is Capital,
                                                                        // you should make first letter camel and pass as id.
        course2.getTeachingHours();

        Course course3 = container.getBean("API",Course.class); // if class name is all capital letters,
                                                            // you should pass id all capital letters too
        course3.getTeachingHours();


    }
}
