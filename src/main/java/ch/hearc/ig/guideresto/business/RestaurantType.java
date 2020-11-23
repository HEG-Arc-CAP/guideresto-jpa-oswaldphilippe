package ch.hearc.ig.guideresto.business;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class RestaurantType {
    @Id()
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="SEQ_TYPES_GASTRONOMIQUES")
    @SequenceGenerator(name="SEQ_TYPES_GASTRONOMIQUES", sequenceName="SEQ_TYPES_GASTRONOMIQUES")
    @Column(name="numero")
    private Integer id;
    @Column(name="libelle", nullable = false)
    private String label;
    @Column(name="description") // TODO type CLOB
    private String description;
    // TODO
    private Set<Restaurant> restaurants;

    public RestaurantType() {
        this(null, null);
    }

    public RestaurantType(String label, String description) {
        this(null, label, description);
    }

    public RestaurantType(Integer id, String label, String description) {
        this.restaurants = new HashSet();
        this.id = id;
        this.label = label;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}