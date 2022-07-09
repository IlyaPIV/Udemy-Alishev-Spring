package my.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = appContext.getBean("computer", Computer.class);
        System.out.println(computer);

        appContext.close();
    }
}
