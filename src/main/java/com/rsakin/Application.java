package com.rsakin;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = "Sample Micronaut Swagger",
                version = "1.0.0",
                description = "Sample PoC Micronaut App to integrate Swagger and Customize the API Docs",
                license = @License(name = "Test", url = ""),
                contact = @Contact(url = "https://github.com/ramazansakin/sample-micronaut-swagger",
                        name = "Ramazan Sakin", email = "ramazansakin63@gmail.com")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}