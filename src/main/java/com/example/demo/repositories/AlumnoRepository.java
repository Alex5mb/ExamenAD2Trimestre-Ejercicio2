/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.repositories;

import java.util.Optional;
import com.example.demo.modelos.Alumnado;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author AlejandroMarínBermúd
 */
public interface AlumnoRepository extends JpaRepository<Alumnado, Long>{
    
    
}
