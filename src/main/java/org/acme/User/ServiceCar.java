package org.acme.User;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ServiceCar {

    public ServiceCar()
    {

    }


    @Transactional
    public List<ModelCar> list() {

        return ModelCar.listAll();
    }

    
    
}
