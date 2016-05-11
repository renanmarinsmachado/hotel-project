package br.com.logatti.project.hotel.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"br.com.logatti.project.hotel"})
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "br.com.logatti.project.hotel.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "br.com.logatti.project.hotel.entity")
public class Application{

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
