package com.wgcisotto.justgifit.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;

/* Removing classes that are not going to be used in this project */
@SpringBootApplication(exclude = {JacksonAutoConfiguration.class, JmsAutoConfiguration.class})
public class JustGifItApplication {

    public static void main(String[] args) {
        SpringApplication.run(JustGifItApplication.class, args);
    }

}
