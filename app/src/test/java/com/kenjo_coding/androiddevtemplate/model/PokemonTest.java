package com.kenjo_coding.androiddevtemplate.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PokemonTest {

    @Test
    public void test_execute_1(){
        String result = Pokemon.execute(1);
        assertEquals("1", result);
    }

    @Test
    public void test_execute_2(){
        String result = Pokemon.execute(2);
        assertEquals("1", result);
    }

    @Test
    public void test_execute_3(){
        String result = Pokemon.execute(3);
        assertEquals("Fizz", result);
    }

}