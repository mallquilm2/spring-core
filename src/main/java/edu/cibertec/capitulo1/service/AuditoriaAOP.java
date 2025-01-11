
package edu.cibertec.capitulo1.service;

import org.springframework.stereotype.Service;

@Service
public class AuditoriaAOP {
    
    public void alertarAntes(){
        System.out.println("Auditoria ANTES del metodo");
    }
    
    public void alertarDespues(){
        System.out.println("Auditoria DESPUES del metodo");
    }
    
    public void alertarExcepcion(){
        System.out.println("Auditoria EXCEPCION del metodo");
    }
    
}
