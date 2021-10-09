package com.example.boot.config;

import com.example.boot.profile.DevProfile;
import com.example.boot.profile.ProductionProfile;
import com.example.boot.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfoConfig {
    @Bean
    @ConditionalOnProperty(value = "boot.profile.dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "boot.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}