package org.acme.User;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1/users")
public class APIUser {

    @Inject
    ServiceUser serviceUser;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userID}")
    public ModelUser getUser(@PathParam("userID") long userID) {

        ModelUser modelUser = serviceUser.getUser(userID);

        return modelUser;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{userID}")
    public ModelUser deleteUser(@PathParam("userID") long userID) {

        ModelUser modelUser = serviceUser.deleteUser(userID);

        return modelUser;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ModelUser postUser(ModelUser modelUser) {

        serviceUser.saveUser(modelUser);

        return modelUser;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public List<ModelUser> list() {

        return serviceUser.list();
    }


}