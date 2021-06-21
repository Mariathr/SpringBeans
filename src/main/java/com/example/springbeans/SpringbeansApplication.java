package com.example.springbeans;

import com.example.springbeans.model.House;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbeansApplication {

    public static void main(String[] args) {

       // SpringApplication.run(SpringbeansApplication.class, args);
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beans.xml");

        House house = (House) cxt.getBean("houseBean1");
        System.out.println(house);
    }

}
