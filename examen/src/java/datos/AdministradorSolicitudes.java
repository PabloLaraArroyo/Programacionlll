/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author Pablo
 */
@Named(value = "administradorSolicitudes")
@SessionScoped
public class AdministradorSolicitudes implements Serializable {
@ManagedProperty(value="#{detallesBean}")
    DetallesBean detalles;

    public DetallesBean getDetalles() {
        return detalles;
    }

    public void setDetalles(DetallesBean detalles) {
        this.detalles = detalles;
    }
    ListaSolicitudes laLista;
    /**
     * Creates a new instance of PaginaListado
     */
    public AdministradorSolicitudes() {
        laLista=new ListaSolicitudes();
        laLista.agregar("Pablo","revision","lunes 4");
        laLista.agregar("Jose","mantenimiento","domingo 30");
        
    }

    public ListaSolicitudes getLaLista() {
        return laLista;
    }

    public void setLaLista(ListaSolicitudes laLista) {
        this.laLista = laLista;
    }
    /* metodos que son llamados desde la pagina */
    public String cargarNuevo(){
        return "datos";
    }
    /*public String detalles(String cli) {
        for (Solicitud  e : laLista.getLista()) {
            if(e.getCliente().equals(cli)){
                detalles.solicitud=e;
                return "detalles";
            }
        }
        return "index";
    }*/
   
}
