import com.google.gson.Gson;
import model.Address;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main
    {
    public static void main(String[] args)
        {
        System.out.println("Hello");
        Address AddyFun = new Address();

        AddyFun.setStreet("123456789 Ugh wy");
        AddyFun.getCityStateZip().setState_str("TX");
        AddyFun.getCityStateZip().setCityName_str("Dumas");
        AddyFun.getCityStateZip().setZipCode_str("79029");

        Gson toGsonObj = new Gson();
        String Gson_str = toGsonObj.toJson(AddyFun);

        // string output from Gson from Address class
        System.out.println(Gson_str);

        try
            {
            Address fromGsonAddy = toGsonObj.fromJson(Gson_str, Address.class);
            JAXBContext context = JAXBContext.newInstance(Address.class);
            Marshaller m = context.createMarshaller();
            StringWriter sw = new StringWriter();
            m.marshal( fromGsonAddy, sw );
            System.out.println(sw.toString());
            }
        catch (Exception e )
            { System.out.println(e);
            }

        }
    }
