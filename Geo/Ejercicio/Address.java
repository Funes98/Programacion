package Ejercicio;

import java.util.Objects;

public class Address {
	private String address_id;
	private String address;
	
	
	
	public Address(String address_id, String address) {
		super();
		this.address_id = address_id;
		this.address = address;
	}



	public String getAddress_id() {
		return address_id;
	}



	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(address_id, address);
	}
	
	@Override
    public boolean equals(Object obj) {
        return this==obj || obj!=null &&
                obj instanceof Address
                && this.hashCode()==((Address)obj).hashCode();
    }
	
	
	@Override
	public String toString() {
		return String.format("	Address id: %s, Address: %s", this.address_id,this.address);
	}
}
