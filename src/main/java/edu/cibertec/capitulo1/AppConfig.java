
package edu.cibertec.capitulo1;

import edu.cibertec.capitulo1.beans.HolaMundo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 
    @Bean
    public HolaMundo holaMundoBean(){
        return new HolaMundo();
    }
    
}
