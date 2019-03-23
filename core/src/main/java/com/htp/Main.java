package com.htp;

import com.htp.config.AppConfig;
import com.htp.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
      //  ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //("C:\\Users\\andrey.zinovich\\IdeaProjects\\JD2\\core\\src\\main\\resources\\application-context.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println(myCar.getModel());

        System.out.println(myCar.getEngine().getVolume());
// https://bitbucket.org/EagleGlance/springhtp.git
    }
}
