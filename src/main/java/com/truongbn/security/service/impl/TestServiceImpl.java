package com.truongbn.security.service.impl;

import com.truongbn.security.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    @Override
    public String getData() {
        return "data";
    }
}
