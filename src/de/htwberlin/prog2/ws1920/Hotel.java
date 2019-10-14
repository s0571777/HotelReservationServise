package de.htwberlin.prog2.ws1920;

public class Hotel {
    private String name;
    private int star;
    private int room;
    private int etage;

    public Hotel(String name, int star, int room, int etage) {
        this.name = name;
        this.star = star;
        this.room = room;
        this.etage = etage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    @Override
    public String toString() {
        return "de.htwberlin.prog2.ws1920.Hotel{" +
                "name='" + name + '\'' +
                ", star=" + star +
                ", room=" + room +
                ", etage=" + etage +
                '}';
    }
}
