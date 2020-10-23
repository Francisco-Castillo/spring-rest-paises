/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.springpaises.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "pais")
public class Pais {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "nombrelargo")
  private String nombreLargo;

  @Column(name = "nombrecorto")
  private String nombreCorto;

  @Column(name = "abreviatura")
  private String abreviatura;

  @Column(name = "capital")
  private String capital;

  public Pais() {
  }

  public Pais(int id, String nombreLargo, String nombreCorto, String abreviatura, String capital) {
    this.id = id;
    this.nombreLargo = nombreLargo;
    this.nombreCorto = nombreCorto;
    this.abreviatura = abreviatura;
    this.capital = capital;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombreLargo() {
    return nombreLargo;
  }

  public void setNombreLargo(String nombreLargo) {
    this.nombreLargo = nombreLargo;
  }

  public String getNombreCorto() {
    return nombreCorto;
  }

  public void setNombreCorto(String nombreCorto) {
    this.nombreCorto = nombreCorto;
  }

  public String getAbreviatura() {
    return abreviatura;
  }

  public void setAbreviatura(String abreviatura) {
    this.abreviatura = abreviatura;
  }

  public String getCapital() {
    return capital;
  }

  public void setCapital(String capital) {
    this.capital = capital;
  }

}
