package de.htwberlin.prog2.ws1920;

public class Address {
    private String strasse;
    private  String hausnummer;
    private String plz;
    private String city;
    private String land;

    public Address(String strasse, String hausnummer, String plz, String city, String land) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.city = city;
        this.land = land;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    @Override
    public String toString() {
        return "de.htwberlin.prog2.ws1920.Address{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer='" + hausnummer + '\'' +
                ", plz='" + plz + '\'' +
                ", city='" + city + '\'' +
                ", land='" + land + '\'' +
                '}';
    }
}
