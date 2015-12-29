package com.springinaction.spittr.data;

import com.springinaction.spittr.Spittle;

import java.util.List;

/**
 * Created by Bogdan on 12/28/2015.
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(Long id);
}
