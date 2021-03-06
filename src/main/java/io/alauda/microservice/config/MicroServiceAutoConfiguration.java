package io.alauda.microservice.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@EnableEurekaClient
@Import({
        TokenConfig.class,
        JwtFilterConfig.class,
        SwaggerConfig.class,
        ResourceServerConfig.class,
        FeignClientConfig.class
})
@ConditionalOnMissingBean(MicroServiceAutoConfiguration.class)
@Configuration
public class MicroServiceAutoConfiguration {
}
