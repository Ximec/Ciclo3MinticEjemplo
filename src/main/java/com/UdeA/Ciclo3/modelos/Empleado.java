package com.UdeA.Ciclo3.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    //Atributos de la clase Empleado
    private int id;
    private String nombre;
    private String correo;
    private String empresaPertenece;
    private String rolEmpleado;


    public Empleado() {
    }

    public Empleado(String nombre, String correo, String empresaPertenece, String rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
