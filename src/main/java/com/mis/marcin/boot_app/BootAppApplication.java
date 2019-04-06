package com.mis.marcin.boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@EnableJpaAuditing
@SpringBootApplication
public class BootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootAppApplication.class, args);
	}
}
