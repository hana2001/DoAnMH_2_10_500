package com.example.doanmonhoc.models;

import java.io.Serializable;

public class Room implements Serializable {
    private String soPhong;
    private String  descriptionRoom;
    private int ImageRoom;
    private double priceRoom;
    private int people;
    private boolean isBook;

    public Room(String soPhong, String descriptionRoom, int imageRoom, double priceRoom, int people) {
        this.soPhong = soPhong;
        this.descriptionRoom = descriptionRoom;
        this.ImageRoom = imageRoom;
        this.priceRoom = priceRoom;
        this.people = people;
        this.isBook = false;
    }

    public boolean isBook() {
        return isBook;
    }

    public void setBook(boolean book) {
        isBook = book;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public String getDescriptionRoom() {
        return descriptionRoom;
    }

    public void setDescriptionRoom(String descriptionRoom) {
        this.descriptionRoom = descriptionRoom;
    }

    public int getImageRoom() {
        return ImageRoom;
    }

    public void setImageRoom(int imageRoom) {
        ImageRoom = imageRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

}
