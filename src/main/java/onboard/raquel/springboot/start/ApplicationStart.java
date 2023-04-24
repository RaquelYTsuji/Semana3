package onboard.raquel.springboot.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "onboard.raquel.springboot")
public class ApplicationStart {
    public static void main (String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}