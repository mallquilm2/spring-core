
package edu.cibertec.capitulo1.service;

import edu.cibertec.capitulo1.beans.Imprimible;

public class ImpresoraService {
    
    private Imprimible documento;
    
    public ImpresoraService(){}
    
    public ImpresoraService(Imprimible documento){
        this.documento = documento;
    }
    
    public void imprimirDocumento(){
        System.out.println(documento.imprimir());
    }

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
    
    
    
}
