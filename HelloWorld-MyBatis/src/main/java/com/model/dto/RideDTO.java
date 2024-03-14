package com.model.dto;

public class RideDTO implements java.io.Serializable{
    private int rideCode;
    private int entranceCode;
    private String rideSort;
    private String watingTime;
    private String operRationInfo;

    public RideDTO() {
    }

    public RideDTO(int rideCode, int entranceCode, String rideSort, String watingTime, String operRationInfo) {
        this.rideCode = rideCode;
        this.entranceCode = entranceCode;
        this.rideSort = rideSort;
        this.watingTime = watingTime;
        this.operRationInfo = operRationInfo;
    }

    public int getRideCode() {
        return rideCode;
    }

    public void setRideCode(int rideCode) {
        this.rideCode = rideCode;
    }

    public int getEntranceCode() {
        return entranceCode;
    }

    public void setEntranceCode(int entranceCode) {
        this.entranceCode = entranceCode;
    }

    public String getRideSort() {
        return rideSort;
    }

    public void setRideSort(String rideSort) {
        this.rideSort = rideSort;
    }

    public String getWatingTime() {
        return watingTime;
    }

    public void setWatingTime(String watingTime) {
        this.watingTime = watingTime;
    }

    public String getOperRationInfo() {
        return operRationInfo;
    }

    public void setOperRationInfo(String operRationInfo) {
        this.operRationInfo = operRationInfo;
    }

    @Override
    public String toString() {
        return "RideDTO{" +
                "rideCode=" + rideCode +
                ", entranceCode=" + entranceCode +
                ", rideSort='" + rideSort + '\'' +
                ", watingTime='" + watingTime + '\'' +
                ", operRationInfo='" + operRationInfo + '\'' +
                '}';
    }
}
