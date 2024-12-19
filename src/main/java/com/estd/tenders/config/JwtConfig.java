package com.estd.tenders.config;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;


@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "jwt")
@Validated
public class JwtConfig {

    // Getters and Setters
    @NotEmpty
    private String secret;

    @Positive
    private int expiration;

    @NotEmpty
    private String issuer;

}
