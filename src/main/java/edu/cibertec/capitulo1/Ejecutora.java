
package edu.cibertec.capitulo1;

import edu.cibertec.capitulo1.beans.HolaMundo;
import edu.cibertec.capitulo1.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Ejecutora {
    
    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext contexto = new AnnotationConfigApplicationContext(AppConfig.class);
        HolaMundo hm = (HolaMundo) contexto.getBean("holaMundoBean");
        hm.saludar();
        
        HolaMundo hm2 = (HolaMundo) contexto.getBean("holaMundoBean");
        System.out.println("Compara posición de memoria ="+hm+ "-" +hm2);
        hm2.setNombre("Segundo nombre");
        System.out.println("Valor del nombre de primer bean "+hm.getNombre());
        
        ImpresoraService is = (ImpresoraService) contexto.getBean("impresoraService");
        is.imprimirDocumento();
        
        ((ConfigurableApplicationContext)contexto).close();
    }
    
}
