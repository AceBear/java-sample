package com.acebear.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

public class App implements CommandLineRunner {
    private final static Logger s_logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... args) {
        logBasicInfo();

        int a = 3, b = 5;
        s_logger.info("{} + {} = {}", a, b, sum(a, b));
    }

    public int sum(int a, int b){
        return a+b;
    }

    private void logBasicInfo(){
        s_logger.info("appver: {}", GitVer.getVersion());

        final LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        final Configuration config = ctx.getConfiguration();
        s_logger.info("Active log4j config file: {}", config.getName());
    }
}
