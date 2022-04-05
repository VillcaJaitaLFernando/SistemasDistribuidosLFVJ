/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.villcajaitalfernando.ordenaralumnos;

/**
 *
 * @author Centro Virtual
 */
public class Alumno {
    String nombres;
    String apellidos;
    String CU;
    Carrera carrera;
    public Alumno()
    {
      
    }
    public Alumno(String nombres, String apellidos, String CU, Carrera carrera) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.CU = CU;
        this.carrera = carrera;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCU() {
        return CU;
    }

    public void setCU(String CU) {
        this.CU = CU;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", CU=" + CU + ", carrera=" + carrera + '}';
    }
}
