package com.htp;

import com.htp.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        //("C:\\Users\\andrey.zinovich\\IdeaProjects\\JD2\\core\\src\\main\\resources\\application-context.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println(myCar.getModel());

        System.out.println(myCar.getEngine().getVolume());

    }
}
