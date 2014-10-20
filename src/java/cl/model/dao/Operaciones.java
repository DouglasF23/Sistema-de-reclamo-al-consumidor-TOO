/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.model.dao;
import cl.model.pojos.Reclamo;
import cl.model.pojos.Usuario;
import org.hibernate.SessionFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author Douglas
 */
public class Operaciones {
  
  public void hacerReclamo(Reclamo us){
   
  Session sesion = HibernateUtil.getSessionFactory().openSession();  
  sesion.beginTransaction();  
  sesion.persist(us);  
  sesion.persist(us);  
  sesion.getTransaction().commit();  
  sesion.close();
  
  
   
  }
    
    
}
