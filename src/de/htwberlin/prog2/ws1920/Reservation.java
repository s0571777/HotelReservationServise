package de.htwberlin.prog2.ws1920;

public class Reservation {
    private int reservationID;
    private String reservationDate;
    private String zahlungsArt;
    private int preis;

    public Reservation(int reservationID, String reservationDate, String zahlungsArt, int preis) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.zahlungsArt = zahlungsArt;
        this.preis = preis;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getZahlungsArt() {
        return zahlungsArt;
    }

    public void setZahlungsArt(String zahlungsArt) {
        this.zahlungsArt = zahlungsArt;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        return "de.htwberlin.prog2.ws1920.Reservation{" +
                "reservationID=" + reservationID +
                ", reservationDate='" + reservationDate + '\'' +
                ", zahlungsArt='" + zahlungsArt + '\'' +
                ", preis=" + preis +
                '}';
    }
}
