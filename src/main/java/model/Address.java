package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zipcode;


@Override
public String toString(){
	return getStreet() + ", "+getCity()+", "+getZipcode();
	}

}
