
package edu.cibertec.capitulo1;

import edu.cibertec.capitulo1.beans.DocumentoExcel;
import edu.cibertec.capitulo1.beans.DocumentoTexto;
import edu.cibertec.capitulo1.beans.HolaMundo;
import edu.cibertec.capitulo1.service.ImpresoraService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 
    @Bean
    public HolaMundo holaMundoBean(){
        return new HolaMundo();
    }
    
    @Bean
    public DocumentoExcel documentoExcel(){
        return new DocumentoExcel();
    }
    
    @Bean
    public ImpresoraService impresoraService(){
        return new ImpresoraService();
    }
    
    @Bean
    public DocumentoTexto documentoTexto(){
        return new DocumentoTexto();
    }
    
}
