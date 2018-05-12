package com.github.m0uj.starter.commons.web.controller;

import com.github.m0uj.starter.commons.domain.service.SalarieCrudService;
import com.github.m0uj.starter.commons.domain.service.SalarieSelectionService;
import com.github.m0uj.starter.commons.storage.pojo.Salarie;
import com.github.m0uj.starter.commons.web.dto.EmployeesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by Jihed-pc on 22/03/2018.
 */
@RestController
@RequestMapping("api/v1")
public class SalarieController {

    @Autowired
    SalarieSelectionService salarieSelectionService;
    @Autowired
    SalarieCrudService salarieCrudService;


    @RequestMapping(value = "/employees", method = RequestMethod.POST)
    public ResponseEntity<Void> create(@RequestBody Salarie salarie, UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User Number " + salarie.getImmatriculation());

        if (salarieCrudService.isUserExist(salarie)) {
            System.out.println("A User with name " + salarie.getFirstName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }

        salarieCrudService.saveSalarie(salarie);

        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(salarie.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }






}
