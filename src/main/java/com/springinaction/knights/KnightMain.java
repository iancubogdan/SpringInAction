package com.springinaction.knights;

import com.springinaction.knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by iancu_000 on 04-Oct-15.
 */
public class KnightMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
