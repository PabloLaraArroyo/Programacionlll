/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Laboratorios
 */
@ManagedBean
@SessionScoped
public class DetallesBean {

    Solicitud solicitud;

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    
    public DetallesBean() {
    }
    public  String regresar(){
        return "index";
    }
}
