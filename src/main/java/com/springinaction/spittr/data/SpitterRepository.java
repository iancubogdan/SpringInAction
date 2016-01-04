package com.springinaction.spittr.data;

import com.springinaction.spittr.Spitter;

/**
 * Created by iancu_000 on 31-Dec-15.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);
    Spitter findByUsername(String username);
}
