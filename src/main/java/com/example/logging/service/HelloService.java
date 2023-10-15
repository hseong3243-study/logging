package com.example.logging.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public void hello() {
        throw new RuntimeException("로깅 테스트");
    }
}
