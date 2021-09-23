package org.acme.Car;

import java.util.ArrayList;
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

import org.acme.User.ModelCar;
import org.acme.User.ServiceCar;

@Path("/v1/cars")
public class APICar {

    @Inject
    ServiceCar serviceCar;

    /*
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{carID}")
    public ModelCar getUser(@PathParam("carID") long carID) {

        return serviceCar.getCar(carID);
    }
    */


    /*
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{carID}")
    public ModelCar deleteUser(@PathParam("carID") long carID) {

        ModelCar modelCar = serviceCar.deleteCar(carID);

        return modelCar;
    }
    */

    /*
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public ModelCar postUser(ModelCar modelCar) {

        serviceCar.saveCar(modelCar);

        return modelCar;
    }
*/


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public List<ModelCar> list() {

        return serviceCar.list();
    }


}