package com.retocarvajal.rest;

import com.retocarvajal.model.Camiseta;

import com.retocarvajal.service.CamisetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/camiseta")
public class CamisetaRest {

    @Autowired
    private CamisetaService camisetaService;

    @GetMapping
    private ResponseEntity<List<Camiseta>> getAllCamisetas (){
    	return ResponseEntity.ok(camisetaService.findAll());
   
    }
}
