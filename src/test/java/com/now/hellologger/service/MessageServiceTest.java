package com.now.hellologger.service;

import org.junit.Test;

/**
 * Created by andrew.larsen on 8/23/2016.
 */
public class MessageServiceTest {

    @Test
    public void testGetHelloMessage() throws Exception {
        MessageService service = new MessageService();
        assert(service.getHelloMessage().equals("Hello World"));
    }
}