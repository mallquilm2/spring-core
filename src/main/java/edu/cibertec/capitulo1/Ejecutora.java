
package edu.cibertec.capitulo1;

import edu.cibertec.capitulo1.beans.HolaMundo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Ejecutora {
    
    public static void main(String[] args) {
        ApplicationContext contexto = new ClassPathXmlApplicationContext("beans.xml");
        HolaMundo hm = (HolaMundo) contexto.getBean("holaMundoBean");
        hm.saludar();
        
        ((ConfigurableApplicationContext)contexto).close();
    }
    
}
