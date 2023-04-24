package onboard.raquel.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration
//@ComponentScan
//@Configuration
@SpringBootApplication
public class ApplicationStart {
    public static void main (String[] args){
        SpringApplication.run(ApplicationStart.class, args);
    }
}
