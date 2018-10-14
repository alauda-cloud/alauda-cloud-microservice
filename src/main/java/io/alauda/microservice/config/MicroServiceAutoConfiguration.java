package io.alauda.microservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({
        TokenConfig.class,
        JwtFilterConfig.class,
        SwaggerConfig.class,
        ResourceServerConfig.class})
@ConditionalOnMissingBean(MicroServiceAutoConfiguration.class)
@Configuration
public class MicroServiceAutoConfiguration {
}
