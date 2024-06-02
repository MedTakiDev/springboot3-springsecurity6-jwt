package com.truongbn.security.controller;


import com.truongbn.security.dao.request.DataRequest;
import com.truongbn.security.dao.request.SignUpRequest;
import com.truongbn.security.dao.response.JwtAuthenticationResponse;
import com.truongbn.security.service.AuthenticationService;
import com.truongbn.security.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @GetMapping("/data")
    public ResponseEntity<String> signup() {
        return ResponseEntity.ok(testService.getData());
    }
}
