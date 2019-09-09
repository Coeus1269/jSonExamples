package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressTest
    {

    private Address AddyTest = new Address();
    private String AddyTestStreet_str = "1234 This way",
        AddyTestCity_str = "Dumas",
        AddyTestState_str = "TX",
        AddyTestZip_str = "79029"
            ;


    @Test
    public void setStreet()
        {
        AddyTest.setStreet(AddyTestStreet_str);
        assertEquals(AddyTest.getStreet(), AddyTestStreet_str);
        }

    @Test
    public void setCity()
        {
        AddyTest.setCity(AddyTestCity_str);
        assertEquals(AddyTest.getCity(), AddyTestCity_str);
        }

    @Test
    public void setState()
        {
        AddyTest.setState(AddyTestState_str);
        assertEquals(AddyTest.getState(), AddyTestState_str);
        }

    @Test
    public void setZipcode()
        {
        AddyTest.setZipcode(AddyTestZip_str);
        assertEquals(AddyTest.getZipcode(), AddyTestZip_str);
        }
    }