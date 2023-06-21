package org.rbernalop.springbootswagger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class SampleController {
    @GetMapping("/")
    public String get() {
        log.info("User requested get");
        return "Get!";
    }

    @PostMapping("/")
    public String post() {
        log.info("User requested post");
        return "Post!";
    }

    @DeleteMapping("/")
    public String delete() {
        log.info("User requested delete");
        return "Delete!";
    }

    @PatchMapping("/")
    public String patch() {
        log.info("User requested patch");
        return "Patch!";
    }
}
