package com.ericbouchut.springboot;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return List.of(
            new SoftwareEngineer(
              1,
              "Alej",
            "Java, Spring Boot, SQL"
            ),
            new SoftwareEngineer(
            2,
            "Vince",
            "PHP, React, JS"
            )
        );
    }
}
