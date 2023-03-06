/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.example.demo.controllers;

import java.util.List;
import com.example.demo.modelos.Alumnado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repositories.AlumnoRepository;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author AlejandroMarínBermúd
 */
@RestController
@RequestMapping("/alumnado/")
public class AlumnoController {

    @Autowired
    AlumnoRepository alumn;

    @GetMapping()
    public List<Alumnado> List() {
        System.out.println("aqui");
        return alumn.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Alumnado> get(@PathVariable Long id) {

        if (alumn.existsById(id)) {
            return new ResponseEntity<Alumnado>(alumn.findById(id).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
