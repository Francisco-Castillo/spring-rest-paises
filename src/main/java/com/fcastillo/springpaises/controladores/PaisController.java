/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.springpaises.controladores;

import com.fcastillo.springpaises.entidades.Pais;
import com.fcastillo.springpaises.repositorios.PaisRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcastillo
 */
@RestController
@RequestMapping(value = "/paises")
public class PaisController {

  @Autowired
  PaisRepositorio paisRepositorio;

  @ResponseBody
  @GetMapping("")
  public List<Pais> findAll() {
    return paisRepositorio.findAll();
  }

  @GetMapping(value = "/{id}")
  public Pais findById(@PathVariable("id") Integer id) {
    return paisRepositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("NO"));
  }
}
