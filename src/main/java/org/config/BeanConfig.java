package org.config;

import org.core.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "org.core")
public class BeanConfig {

    @Bean
    public ShoppingCart shoppingCart(){
        return new ShoppingCart();
    }
}
