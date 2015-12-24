package com.springinaction.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by iancu_000 on 30-Nov-15.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {
    
    @Bean
    public Audience audience(){
        return new Audience();
    }
}
