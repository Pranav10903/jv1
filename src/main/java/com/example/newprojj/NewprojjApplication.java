package com.example.newprojj;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NewprojjApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(NewprojjApplication.class, args);
//        //System.out.println("Hello World");
        Alien a = context.getBean(Alien.class);
        a.show();
    }

}
