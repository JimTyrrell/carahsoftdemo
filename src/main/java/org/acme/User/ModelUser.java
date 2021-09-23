package org.acme.User;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="Users")
@ApplicationScoped
public class ModelUser extends PanacheEntityBase{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty()
    long userID;

    @JsonProperty()
    String firstName = "";
    
    @JsonProperty()
    String lastName = "";

    @JsonProperty()
    String middleName = "";
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonProperty()
    @JsonManagedReference
    List<ModelCar> cars = new ArrayList<>();
}
