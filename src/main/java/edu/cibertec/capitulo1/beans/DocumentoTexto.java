
package edu.cibertec.capitulo1.beans;

import org.springframework.stereotype.Controller;

@Controller
public class DocumentoTexto implements Imprimible{

    /*
    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo de texto";
    }
*/
    
    public void iniciar(){
        System.out.println("Iniciando la construcción del bean TEXTO");
    }
    
    public void destruir(){
        System.out.println("Destruyendo la instancia creada TEXTO");
    }
    
    @Override
    public String imprimir(){
        String abc = null;
        abc.getBytes();
        return "Imprimiendo desde un archivo de texto";
    }
    
}
