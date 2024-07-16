
package com.sugarDreams.service;
import com.sugarDreams.domain.Personalizar;
import java.util.List;

public interface PersonalizarService {
    
    public List<Personalizar> getPersonalizars(Personalizar personalizar);    

public Personalizar getIdQueque(Personalizar personalizar); 

public void save (Personalizar personalizar);

public void delete (Personalizar personalizar);
    
}
