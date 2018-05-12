package com.github.m0uj.starter.commons.web.controller;
import com.github.m0uj.starter.commons.domain.service.UserCrudService;
import com.github.m0uj.starter.commons.storage.pojo.User;
import com.github.m0uj.starter.commons.web.dto.UserDTO;
import com.github.m0uj.starter.commons.web.validator.UserValidator;
import com.github.m0uj.starter.commons.web.validator.UsernameValidator;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Jihed-pc on 09/02/2018.
 */

@RestController
@RequestMapping("api/v1")
public class RegisterController {
    private final UserCrudService userCrudService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    private final ModelMapper modelMapper;

    @Autowired
    private UserValidator userValidator;
    @Autowired
    private UsernameValidator usernameValidator;

    public RegisterController(UserCrudService userCrudService, BCryptPasswordEncoder bCryptPasswordEncoder, ModelMapper modelMapper) {
        this.userCrudService = userCrudService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.modelMapper = modelMapper;
    }
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.addValidators(userValidator, usernameValidator);
    }
    @CrossOrigin("**")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public UserDTO CreateUser(@RequestBody @Valid UserDTO userDTO)
    {
        User user = modelMapper.map(userDTO, User.class);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setEnable(true);
        return modelMapper.map(userCrudService.create(user), UserDTO.class);
    }
}
