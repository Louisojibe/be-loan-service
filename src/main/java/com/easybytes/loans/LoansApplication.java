package com.easybytes.loans;

import com.easybytes.loans.dto.LoansContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.eazybytes.accounts.controller") })
@EnableJpaRepositories("com.eazybytes.accounts.repository")
@EntityScan("com.eazybytes.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loan microservice REST API Documentation",
                description = "LouisBank Loan microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Louis Ojibe",
                        email = "louisojibe@gmail.com",
                        url = "https://ng.linkedin.com/in/louis-ojibe-717940100"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://ng.linkedin.com/in/louis-ojibe-717940100"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "LouisBank Loans microservice REST API Documentation",
                url = "https://ng.linkedin.com/in/louis-ojibe-717940100"
        )
)
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}
