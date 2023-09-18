package com.example.jdbctemplatedemo;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String index() {

        int count = jdbcTemplate.queryForObject("select count(*) from hotels_booking_history", Integer.class);



        return "Hi! " + count;
    }
}
