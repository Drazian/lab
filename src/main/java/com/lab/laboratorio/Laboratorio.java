/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lab.laboratorio;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author pipo
 */
public class Laboratorio {

    public static void main(String[] args) {
               
        //test
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conn");
        
        EntityManager em = emf.createEntityManager();
        
        clase_test aux = new clase_test(1, "texto1");
        
        em.getTransaction().begin();
        em.persist(aux);
        em.getTransaction().commit();
    }
}
