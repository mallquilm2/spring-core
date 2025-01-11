
package edu.cibertec.capitulo1.beans;

public class DocumentoExcel implements Imprimible{

    @Override
    public String imprimir() {
        return "Imprimiendo desde un archivo Excel";
    }
    
    public void iniciar(){
        System.out.println("Iniciando la construcción del bean");
    }
    
    public void destruir(){
        System.out.println("Destruyendo la instancia creada");
    }
    
}
