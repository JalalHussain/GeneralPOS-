package com.general;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages ="com.general.*")
@EnableJpaRepositories("com.general.*.data.repo")
@EnableAutoConfiguration
public class GeneralPOSApp extends SpringBootServletInitializer {

		public static void main(String[] args) {
			SpringApplication.run(GeneralPOSApp.class, args);
		}


		@Override
		protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
			return application.sources(applicationClass);
		}

		private static Class<GeneralPOSApp> applicationClass = GeneralPOSApp.class;
}
