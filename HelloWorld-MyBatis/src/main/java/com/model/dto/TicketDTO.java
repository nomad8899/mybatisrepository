package com.model.dto;

public class TicketDTO implements java.io.Serializable{
    private int ticketCode;
    private String ticketSort;
    private int ticketPrice;
    private double ticketDate;

    public TicketDTO() {
    }

    public TicketDTO(int ticketCode, String ticketSort, int ticketPrice, double ticketDate) {
        this.ticketCode = ticketCode;
        this.ticketSort = ticketSort;
        this.ticketPrice = ticketPrice;
        this.ticketDate = ticketDate;
    }

    public int getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getTicketSort() {
        return ticketSort;
    }

    public void setTicketSort(String ticketSort) {
        this.ticketSort = ticketSort;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(double ticketDate) {
        this.ticketDate = ticketDate;
    }

    @Override
    public String toString() {
        return "TicketDTO{" +
                "ticketCode=" + ticketCode +
                ", ticketSort='" + ticketSort + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketDate=" + ticketDate +
                '}';
    }
}
