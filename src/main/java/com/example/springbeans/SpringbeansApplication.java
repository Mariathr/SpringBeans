package com.example.springbeans;

import com.example.springbeans.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringbeansApplication {

    public static void main(String[] args) {

       // SpringApplication.run(SpringbeansApplication.class, args);
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beans.xml");

       // House house = (House) cxt.getBean("houseBean1");
       // System.out.println(house);

        //Company company = (Company) cxt.getBean("companyBean");
       // System.out.println(company);

   //ini services singleton
      //  Service service1 = (Service) cxt.getBean("serviceBean");
      //  Service service2 = (Service) cxt.getBean("serviceBean");
      //  Service service3 = (Service) cxt.getBean("serviceBean");
       // System.out.println(service1);

       // service1.setMessage("Bonjour");
     //   service2.setMessage("Salut");
     //   service3.setMessage("Service 3");

      //  System.out.println(service1);
       // System.out.println(service2);
      //  System.out.println(service3);
// fin service singleton


        //d’une injection par setting:
       // Customer customer = (Customer) cxt.getBean("customerBean");
       // System.out.println(customer.getName());
       // System.out.println(customer.getFirstAddress().getFullAddress());

        //d’une injection par constructor:
      //  Panda panda = (Panda) cxt.getBean("pandaBean");
      //  System.out.println(panda.getObjKungfu().getName());

        Customer1 customer1 = (Customer1) cxt.getBean("customerAnotation");
        System.out.println(customer1.toString());


    }

}
