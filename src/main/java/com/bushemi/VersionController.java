package com.bushemi;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VersionController {

    @Secured("USER")
    @GetMapping("/version")
    public ResponseEntity<?> getVersion() {
        return ResponseEntity.ok().body("There is no versions!");
    }
}
