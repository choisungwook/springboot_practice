package com.demo.practice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@Slf4j
public class Controller {

    @PostMapping("/add")
    public String list(demoDTO dto){
        log.info("이름" + dto.getName());
        log.info("나이" + dto.getAge());

        // 회원가입 로직

        return "done";
    }
}
