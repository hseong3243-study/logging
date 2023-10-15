package com.example.logging.service;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloServiceTest {

    @Autowired
    HelloService helloService;

    @Test
    void logAop() {
        assertThatThrownBy(() -> helloService.hello())
            .isInstanceOf(RuntimeException.class);
    }
}