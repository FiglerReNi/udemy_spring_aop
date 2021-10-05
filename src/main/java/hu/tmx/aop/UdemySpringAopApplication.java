package hu.tmx.aop;

import hu.tmx.aop.exampleOne.service.Business1;
import hu.tmx.aop.exampleOne.service.Business2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemySpringAopApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Business1 business1;
    private Business2 business2;

    @Autowired
    public void setBusiness1(Business1 business1) {
        this.business1 = business1;
    }

    @Autowired
    public void setBusiness2(Business2 business2) {
        this.business2 = business2;
    }

    public static void main(String[] args) {
        SpringApplication.run(UdemySpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info(business1.calculateSomething());
        logger.info(business2.calculateSomething());

    }
}
