/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.springpaises.repositorios;

import com.fcastillo.springpaises.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author fcastillo
 */
@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Integer> {

}
