package com.springinaction.spittr.data;

import com.springinaction.spittr.Spitter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by iancu_000 on 02-Jan-16.
 */
@Component
public class SpitterRepositoryImpl implements SpitterRepository {
    Map<String, Spitter> map;

    public SpitterRepositoryImpl() {
        this.map = new HashMap<>();
    }

    @Override
    public Spitter save(Spitter spitter) {
        map.put(spitter.getUsername(), spitter);
        Random random = new Random();
        Spitter newSpitter = new Spitter(random.nextLong(), spitter.getFirstName(), spitter.getLastName(), spitter.getUsername(), spitter.getPassword());
        return newSpitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return map.get(username);
    }
}
