package com.springinaction.knights.config;

import com.springinaction.knights.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by iancu_000 on 03-Oct-15.
 */

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel(){
        return new Minstrel(System.out);
    }
}
