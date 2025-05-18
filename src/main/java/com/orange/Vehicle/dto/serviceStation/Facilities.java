package com.orange.Vehicle.dto.serviceStation;

public class Facilities {
    private boolean lounge;
    private boolean pickupDrop;
    private boolean wifi;
    private boolean parking;

    public Facilities() {
    }

    public Facilities(boolean lounge, boolean pickupDrop, boolean wifi, boolean parking) {
        this.lounge = lounge;
        this.pickupDrop = pickupDrop;
        this.wifi = wifi;
        this.parking = parking;
    }

    public boolean isLounge() {
        return lounge;
    }

    public void setLounge(boolean lounge) {
        this.lounge = lounge;
    }

    public boolean isPickupDrop() {
        return pickupDrop;
    }

    public void setPickupDrop(boolean pickupDrop) {
        this.pickupDrop = pickupDrop;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "Facilities{" +
                "lounge=" + lounge +
                ", pickupDrop=" + pickupDrop +
                ", wifi=" + wifi +
                ", parking=" + parking +
                '}';
    }
}
