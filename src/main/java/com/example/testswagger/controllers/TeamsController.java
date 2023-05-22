package com.example.testswagger.controllers;

import com.example.testswagger.dtos.TeamResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/teams")
public class TeamsController {
    @GetMapping("/get-all")
    public List<TeamResponseDto> getAll() {
        return List.of(
                new TeamResponseDto(1, "aaa", 2.5),
                new TeamResponseDto(2, "bbb", 4.3)
        );
    }
}
