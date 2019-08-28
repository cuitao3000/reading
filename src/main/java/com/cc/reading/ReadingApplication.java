package com.cc.reading;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
public class ReadingApplication {

    private static final Logger logger = LoggerFactory.getLogger(ReadingApplication.class);

    private static String env;

	public static void main(String[] args) {
        logger.info("Current Environment: {}.", env);

        env = getEnv();

        SpringApplication application = new SpringApplication(ReadingApplication.class);
//		SpringApplication.run(ReadingApplication.class, args);

        ConfigurableEnvironment environment = new StandardEnvironment();
        environment.setActiveProfiles(env);
        application.setEnvironment(environment);
        application.run(args);

        logger.info("Application started...");
	}

    private static String getEnv() {
        if (env != null) return env;
        String key = "DADA_ENV";
        env = System.getProperty(key);
        if (env == null) {
            env = System.getenv(key);
        }
        return env = (env == null ? "dev" : env);
    }

}
