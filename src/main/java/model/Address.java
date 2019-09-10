package model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@Getter

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Address
	{
	private String street;
	private CityStateZip cityStateZip = new CityStateZip();

	public Address()
		{
		}

	public Address(String street_str, String city_str, String state_str, String zip_str)
		{
		this.street = street_str;
		cityStateZip.setCityName_str(city_str);
		cityStateZip.setState_str(state_str);
		cityStateZip.setZipCode_str(zip_str);
		}

	public String toString()
		{ return getStreet() + ", "+ cityStateZip.getCityName_str()+
				", " + cityStateZip.getState_str() +
				", "+ cityStateZip.getZipCode_str();
		}

	/* -------------------------------- Getters & Setters  -------------------------------- */

	// Lombok handles this via annotation @Getter & @ Setter

    // the following are examples to access the CityStateZip class
	  String getCity()
		 {return cityStateZip.getCityName_str();}

	 String getState()
		{return cityStateZip.getState_str();}

	 String getZipCode()
		{return cityStateZip.getZipCode_str();}
	/* ------------------------------ End Getters & Setters  ------------------------------ */


	}
