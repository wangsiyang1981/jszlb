package com.service.jszlb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJszlb {

        JszlbDelegate jszlbDelegate = new JszlbDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = jszlbDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}