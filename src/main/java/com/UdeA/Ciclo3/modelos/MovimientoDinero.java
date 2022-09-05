package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table(name="movimientos")
public class MovimientoDinero
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "usuario_rol_id")
    private Empleado usuarioRol;


    public MovimientoDinero() {
    }

    public MovimientoDinero(long monto, String concepto, Empleado usuarioRol) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuarioRol = usuarioRol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getUsuarioRol() {
        return usuarioRol;
    }

    public void setUsuarioRol(Empleado usuarioRol) {
        this.usuarioRol = usuarioRol;
    }


}
