package com.github.m0uj.starter.commons.web.controller;

import com.github.m0uj.starter.commons.domain.service.UserSelectionService;
import com.github.m0uj.starter.commons.web.dto.UserDTO;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MeController {

    private final UserSelectionService userSelectionService;

    public MeController(UserSelectionService userSelectionService) {
        this.userSelectionService = userSelectionService;
    }

    @RequestMapping("/me")
    public UserDTO getPrincipal(Authentication authentication){


        return null;//userSelectionService.selectByUsername(authentication.getCredentials());
    }
}