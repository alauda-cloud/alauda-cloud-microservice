package io.alauda.microservice.config;

import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors().and().authorizeRequests()

                .antMatchers(
                        "/health",
                        "/swagger-ui.html",
                        "/v2/api-docs",
                        "/swagger-resources",
                        "/swagger-resources/configuration/ui",
                        "/swagger-resources/configuration/security"
                ).permitAll()
                .anyRequest().authenticated();
    }
}
