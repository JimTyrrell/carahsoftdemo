package org.acme.User;

import io.quarkus.test.junit.QuarkusTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

@QuarkusTest
public class ServiceUserTest {
    @Inject
    ServiceUser serviceUser;

    @Test
    public void testServiceUser() {

        /*We are basically testing this input and it is not working.  user is null
This is a postman input 
        {
    "firstName": "Jim",
    "lastName": "Tyrrell",
    "middleName": "Patrick",
    "cars": [
        {"manufacturer": "ford", "make": "Escort", "color": "silver"}, 
        {"manufacturer": "GM", "make": "Corvette", "color": "Red"}]
}

and this is our output.
{
    "userID": 2,
    "firstName": "Jim",
    "lastName": "Tyrrell",
    "middleName": "Patrick",
    "cars": [
        {
            "carID": 3,
            "manufacturer": "ford",
            "make": "Escort",
            "color": "silver",
            "user": null
        },
        {
            "carID": 4,
            "manufacturer": "GM",
            "make": "Corvette",
            "color": "Red",
            "user": null
        }
    ]
}

        */


        ModelUser modelUser = new ModelUser();

        modelUser.firstName = "Jim";
        modelUser.middleName = "Patrick";
        modelUser.lastName = "Tyrrell";

        modelUser.cars.add(new ModelCar("ford", "Escort", "silver"));
        modelUser.cars.get(0).user = modelUser;

        modelUser.cars.add(new ModelCar("GM", "Corvette", "Red"));
        modelUser.cars.get(1).user = modelUser;

        serviceUser.saveUser(modelUser);

        assertEquals(1, ModelUser.listAll().size());

        System.err.println("This is a value: " + modelUser.cars.get(0).user);

        assertEquals("Jim", modelUser.cars.get(0).user.firstName);

        assertNotNull(modelUser.cars.get(0).user);        
    }

}