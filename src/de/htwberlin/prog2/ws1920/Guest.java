package de.htwberlin.prog2.ws1920;

public class Guest {

    private String name;
       private Address privateAddress;
    private Address businessAddress;

    public Guest( String name, Address privateAddress) {

        this.name = name;
        this.privateAddress = privateAddress;
        //this.businessAddress = businessAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getPrivateAddress() {
        return privateAddress;
    }

    public void setPrivateAddress(Address privateAddress) {
        this.privateAddress = privateAddress;
    }

    public Address getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(Address businessAddress) {
        this.businessAddress = businessAddress;
    }
}
