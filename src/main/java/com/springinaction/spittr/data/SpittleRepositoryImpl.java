package com.springinaction.spittr.data;

import com.springinaction.spittr.Spittle;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by iancu_000 on 02-Jan-16.
 */
@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }

    @Override
    public Spittle findOne(Long id) {
        return null;
    }
}
