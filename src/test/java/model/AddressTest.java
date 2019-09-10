package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddressTest
    {

    private Address AddyTest = new Address();
    private String AddyTestStreet_str = "1234 This way",
        AddyTestCity_str = "Dumas",
        AddyTestState_str = "TX",
        AddyTestZip_str = "79029"
            ;


    @Test
    void setStreet()
        {
        AddyTest.setStreet(AddyTestStreet_str);
        assertEquals(AddyTest.getStreet(), AddyTestStreet_str);
        }

    @Test
    void setCity()
        {
        AddyTest.getCityStateZip().setCityName_str(AddyTestCity_str);
        assertEquals(AddyTest.getCity(), AddyTestCity_str);
        }

    @Test
     void setState()
        {
        AddyTest.getCityStateZip().setState_str(AddyTestState_str);
        assertEquals(AddyTest.getState(), AddyTestState_str);
        }

    @Test
     void setZipcode()
        {
        AddyTest.getCityStateZip().setZipCode_str(AddyTestZip_str);
        assertEquals(AddyTest.getZipCode(), AddyTestZip_str);
        }
    }