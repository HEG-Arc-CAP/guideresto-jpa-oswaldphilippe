package ch.hearc.ig.guideresto.business;

import java.util.Date;

public class BasicEvaluation extends Evaluation {
    
    private boolean likeRestaurant;
    private String ipAddress;
    private String hello;

    public BasicEvaluation() {
        this(null, null, false, null);
    }

    public BasicEvaluation(Date visitDate, Restaurant restaurant, boolean likeRestaurant, String ipAddress) {
        this(null, visitDate, restaurant, likeRestaurant, ipAddress);
    }
    
    public BasicEvaluation(Integer id, Date visitDate, Restaurant restaurant, boolean likeRestaurant, String ipAddress) {
        super(id, visitDate, restaurant);
        this.likeRestaurant = likeRestaurant;
        this.ipAddress = ipAddress;
    }

    public boolean isLikeRestaurant() {
        return likeRestaurant;
    }

    public void setLikeRestaurant(boolean likeRestaurant) {
        this.likeRestaurant = likeRestaurant;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getHello() {
        System.out.println("Hello");
        return hello;
    }
}
