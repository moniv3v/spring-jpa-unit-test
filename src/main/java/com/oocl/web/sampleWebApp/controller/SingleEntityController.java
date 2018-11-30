package com.oocl.web.sampleWebApp.controller;

import com.oocl.web.sampleWebApp.entity.SingleEntity;
import com.oocl.web.sampleWebApp.repository.SingleEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/singleEntity")
public class SingleEntityController {

    @Autowired
    private SingleEntityRepository singleEntityRepository;

    @GetMapping
    public ResponseEntity<SingleEntity> get(){
        SingleEntity singleEntity = new SingleEntity();
        singleEntity.name = "ABC";
        return ResponseEntity.ok(singleEntity);
    }

}
