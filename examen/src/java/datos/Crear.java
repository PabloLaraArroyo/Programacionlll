/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Laboratorios
 */
@ManagedBean
@RequestScoped
public class Crear {
    @ManagedProperty(value="#{AdministradorSolicitudes}")
    AdministradorSolicitudes administradorSolicitudes;

    public AdministradorSolicitudes getAdministradorSolicitudes() {
        return administradorSolicitudes;
    }

    public void setAdministradorSolicitudes(AdministradorSolicitudes administradorSolicitudes) {
        this.administradorSolicitudes = administradorSolicitudes;
    }

   
    
    String cliente;
    String detalleCaso;
    String fecha;
    public Crear() {
    }
    public String Guardar(){
        /* guardamos */
        administradorSolicitudes.laLista.agregar(cliente, detalleCaso, fecha);
        administradorSolicitudes.laLista.agregar(cliente, detalleCaso, fecha);
        /* regresamos al index */
        return "index";
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDetalleCaso() {
        return detalleCaso;
    }

    public void setDetalleCaso(String detalleCaso) {
        this.detalleCaso = detalleCaso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
}
