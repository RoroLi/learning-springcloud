package com.roro.mscfgserverclientdemo7200;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CfgServerClientDemo7200Application {

    public static void main(String[] args) {
        SpringApplication.run(CfgServerClientDemo7200Application.class, args);
        System.err.println("http://localhost:7200/getConfig4Remote");
    }

}
