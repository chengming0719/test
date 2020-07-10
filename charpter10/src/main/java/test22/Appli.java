package test22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.course")
@SpringBootApplication
public class Appli {
    public static void main(String[] args) {
        SpringApplication.run(Appli.class, args);
    }
}
