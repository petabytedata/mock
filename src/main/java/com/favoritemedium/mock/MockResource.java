package com.favoritemedium.mock;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class MockResource {

    @GetMapping("/mock/stt")
    public Map<String,String> getMockerSTT(){
        return Collections.singletonMap("response","Hi Siri");
    }
}
