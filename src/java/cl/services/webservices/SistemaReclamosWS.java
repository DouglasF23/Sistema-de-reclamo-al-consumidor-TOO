/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.services.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import cl.model.dao.Operaciones;
import cl.model.pojos.Reclamo;
import cl.model.pojos.Usuario;

/**
 *
 * @author Douglas
 */
@WebService(serviceName = "SistemaReclamosWS")
public class SistemaReclamosWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "RealizarReclamos")
    public String RealizarReclamos( @WebParam(name = "fecha") String fecha,  @WebParam(name = "titulo") String titulo, @WebParam(name = "cuerpo") String cuerpo, @WebParam(name = "sector") String sector){
       
        Reclamo rec = new Reclamo();
        Operaciones ope = new Operaciones();
        rec.setFecha(fecha);
        rec.setTitulo(titulo);
        rec.setCuerpo(cuerpo);
        rec.setSector(sector);
        
        return "Producto ingresado";
       
        
//TODO write your implementation code here:
        
    }
}
