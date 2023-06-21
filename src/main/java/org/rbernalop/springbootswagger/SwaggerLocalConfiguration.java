package org.rbernalop.springbootswagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Spring Boot Swagger API",
        version = "v1",
        contact = @Contact(name = "Rafael Bernabeu", email = "rafabernabeu3@gmail.com")
    ),
    servers = @Server(url = "http://localhost:8080", description = "Local server")
)
@Profile("!prod") // Disable swagger local configuration in production
public class SwaggerLocalConfiguration {

    /**
     * This configuration works for JWT authentication.
     */
    @Bean
    public OpenAPI customizeOpenAPI() {
        final String securitySchemeName = "bearerAuth";
        return new OpenAPI()
            .addSecurityItem(new SecurityRequirement()
                .addList(securitySchemeName))
            .components(new Components()
                .addSecuritySchemes(securitySchemeName, new SecurityScheme()
                    .name(securitySchemeName)
                    .type(SecurityScheme.Type.HTTP)
                    .scheme("bearer")
                    .bearerFormat("JWT")));
    }

}