package org.acme.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Cars")
@ApplicationScoped
public class ModelCar extends PanacheEntityBase{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty()
    long carID;

    @JsonProperty()
    String manufacturer = "";
    
    @JsonProperty()
    String make = "";

    @JsonProperty()
    String color = "";

    @ManyToOne
    @JoinColumn(name = "userID")
    @JsonProperty()
    ModelUser user;

    public ModelCar() {}

    public ModelCar(String manufacturer, String make, String color)
    {
        this.manufacturer = manufacturer;
        this.make = make;
        this.color = color;
    }
}
