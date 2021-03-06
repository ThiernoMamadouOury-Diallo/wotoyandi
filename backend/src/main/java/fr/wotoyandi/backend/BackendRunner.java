package fr.wotoyandi.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"fr.wotoyandi.backend"})
@SuppressWarnings({"", ""})
public class BackendRunner {

    private static final Logger LOG
            = LoggerFactory.getLogger(BackendRunner.class);
    private static final String APP_NAME = "wy";

    static {
        System.setProperty("app.name", APP_NAME);
    }

    public static void main(String[] args) {
        LOG.info("Starting server...");
        SpringApplication.run(BackendRunner.class, args);
    }

}
