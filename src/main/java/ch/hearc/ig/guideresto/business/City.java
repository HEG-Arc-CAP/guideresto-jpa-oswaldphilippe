package ch.hearc.ig.guideresto.business;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="VILLES")
public class City {
    @Id()
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_VILLES")
    @SequenceGenerator(name="SEQ_VILLES", sequenceName="SEQ_VILLES")
    @Column(name="numero")
    private Integer id;
    @Column(name="code_postal", nullable = false)
    private String zipCode;
    @Column(name="nom_ville", nullable = false)
    private String cityName;
    @OneToMany(mappedBy="nom_de_la_relation_vers_restaurant")
    private Set<Restaurant> restaurants;

    public City() {
        this(null, null);
    }

    public City(String zipCode, String cityName) {
        this(null, zipCode, cityName);
    }
    
    public City(Integer id, String zipCode, String cityName) {
        this.id = id;
        this.zipCode = zipCode;
        this.cityName = cityName;
        this.restaurants = new HashSet();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String city) {
        this.cityName = city;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}