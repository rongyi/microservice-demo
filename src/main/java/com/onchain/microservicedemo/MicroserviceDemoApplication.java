package com.onchain.microservicedemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroserviceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDemoApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/hello")
    public String home2(@RequestParam(value = "name", defaultValue = "zhaoyue") String name) {
        return "hello " + name + " ,i am from the lucking port:" + port;
    }
}
