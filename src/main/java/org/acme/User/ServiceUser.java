package org.acme.User;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ServiceUser {

    public ServiceUser()
    {

    }

    @Transactional
    public void saveUser(ModelUser modelUser)
    {
        modelUser.persist(); 
    }

    @Transactional
    public ModelUser deleteUser(long userID) {
        ModelUser modelUser = ModelUser.findById(userID);

        modelUser.delete();

        return modelUser;
    }

    @Transactional
    public ModelUser getUser(long userID) {
        ModelUser modelUser = ModelUser.findById(userID);

        return modelUser;
    }

    @Transactional
    public List<ModelUser> list() {

        List<ModelUser> modelUsers = ModelUser.listAll();

        return modelUsers;
    }

    
    
}
