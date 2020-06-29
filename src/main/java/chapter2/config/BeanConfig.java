package chapter2.config;

import chapter2.MyAnnotationTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public MyAnnotationTestBean myAnnotationTestBean() {
        return new MyAnnotationTestBean();
    }
}
