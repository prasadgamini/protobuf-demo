package edu.boot.protobuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "edu.boot")
public class ProtobufDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtobufDemoApplication.class, args);
    }
}
