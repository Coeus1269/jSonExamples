import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import model.Address;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class Main
    {
    public static void main(String[] args)
        {
        // this is a simple project to test and demonstrate
        //  class to Gson and Gson back to class
        // Jaxb to XML and back to class
        // and Jackson to jSon and back to class

        try
            {

            System.out.println("Hello");
            Address AddyFun = new Address();

            AddyFun.setStreet("123456789 Ugh wy");
            AddyFun.getCityStateZip().setState_str("TX");
            AddyFun.getCityStateZip().setCityName_str("Dumas");
            AddyFun.getCityStateZip().setZipCode_str("79029");

            // string output from Address class
            System.out.println("AddyFun.toString\n" + AddyFun.toString());


            // Gson object to and from
            Gson GsonObj = new Gson();
            String Gson_str = GsonObj.toJson(AddyFun);

            // string output from Gson from Address class
            System.out.println("from Gson from Address class\n" + Gson_str);

            Address fromGsonAddy = GsonObj.fromJson(Gson_str, Address.class);
            // string output from newly populated Address class
            System.out.println("fromGsonAddy.toString\n" + fromGsonAddy.toString());


            // Jaxb XML to and from
            JAXBContext context = JAXBContext.newInstance(Address.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();
            m.marshal( fromGsonAddy, sw );

            System.out.println(sw.toString());


            // Jackson to and from
            ObjectMapper mapper_obj = new ObjectMapper();

            String jsonString = mapper_obj.writerWithDefaultPrettyPrinter().writeValueAsString(AddyFun);
            System.out.println("Jackson jSon Sting\n" + jsonString);

            Address JacksonAddy = mapper_obj.readValue(jsonString, Address.class);

            System.out.println("JacksonAddy\n" + JacksonAddy);


            } // end try
        catch (Exception e )    { e.printStackTrace(); }

        }// end main
    } // end class
