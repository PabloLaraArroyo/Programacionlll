/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author Laboratorios
 */
public class ListaSolicitudes  {
    ArrayList<Solicitud> lista;
    public ListaSolicitudes () {
        lista=new ArrayList<>();
    }
    public ArrayList<Solicitud> getLista() {
        return lista;
    }

    public void agregar(String cliente, String detalle,String fecha) {
        Solicitud e=new Solicitud();
        e.setCliente(cliente);
        e.setDetalleCaso(detalle);
        e.setFecha(fecha);
        lista.add(e);
    }
    
}
