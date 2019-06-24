package top.nanli.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateApplication {

    private static Logger logger = LoggerFactory.getLogger(TemplateApplication.class);

    public static void main(String[] args) {
        logger.info("SpringBoot启动中...");
        for (int i = 0; i < 10; i++) {
            System.out.println(" "+i);
        }
        SpringApplication.run(TemplateApplication.class, args);
    }

}
