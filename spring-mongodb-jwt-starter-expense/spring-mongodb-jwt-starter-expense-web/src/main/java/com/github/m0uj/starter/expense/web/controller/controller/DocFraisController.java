package com.github.m0uj.starter.expense.web.controller.controller;

import com.github.m0uj.starter.expense.domain.service.FraisCrudService;
import com.github.m0uj.starter.expense.storage.pojo.DOC_FRAIS;
import com.github.m0uj.starter.expense.web.controller.dto.DOC_FRAISDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by Jihed-pc on 14/05/2018.
 */
@RestController
@RequestMapping("api/v2")
public class DocFraisController {

    @Autowired
    private FraisCrudService fraisCrudService;

    private final ModelMapper modelMapper;

    public DocFraisController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @CrossOrigin("**")
    @RequestMapping(value = "/CreateFrais", method = RequestMethod.POST)
    public DOC_FRAISDTO CreateUser(@RequestBody @Valid DOC_FRAISDTO doc_fraisdto)
    {

        DOC_FRAIS doc_frais = modelMapper.map(doc_fraisdto, DOC_FRAIS.class);
        //doc_frais.setTOTAL_FROUTE(doc_frais.getTOTAL_FROUTE());
        doc_frais.setTOTAL_FROUTE(doc_frais.getTOTAL_FROUTE());
        doc_frais.setTOTAL_FDEPENSE (doc_frais.getTOTAL_FDEPENSE());
        doc_frais.setTOTAL_FRAIS(doc_frais.getT_DOC_FRAIS());
       // user.setEnable(true);
        return modelMapper.map(fraisCrudService.create(doc_frais), DOC_FRAISDTO.class);
    }
}
