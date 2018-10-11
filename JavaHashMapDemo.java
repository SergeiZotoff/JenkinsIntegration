import java.util.HashMap;
import java.util.Map;

public class JavaHashMapDemo {

    public static void main(String[] args)
    {
        HashMap<String, String> obj1 = new HashMap<String, String>();

        obj1.put("400", "Selenium");
        obj1.put("500", "SOAP UI");
        obj1.put("600", "JMeter");
        obj1.put("700", "Katalon Studio");
        obj1.put("700", "Katalon Studio");

        System.out.println(obj1);

        String value = obj1.get("500");
        System.out.println("Value from map with key 500: " + value);

        for(Map.Entry<String, String> data: obj1.entrySet())
        {
            System.out.println("Key from MAP is: " + data.getKey() + " and Value is: " + data.getValue());
        }

    }
}