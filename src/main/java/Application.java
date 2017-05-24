import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Application {
    public static void main(String[] args) {
        System.out.println("P1 = " +
                new Util().getPropertyValue("prop_1"));

        System.out.println("P2 = " +
                new Util().getPropertyValue("prop_2"));
    }
}

class Util {
    public String getPropertyValue(String propertyName) {
        String pV = "";
        Properties properties=new Properties();

        try(InputStream inputStream=this.getClass().
                getResourceAsStream("application.properties")){
            properties.load(inputStream);
            pV=properties.getProperty(propertyName);
        }catch (IOException e){
            System.out.println(e);
        }

        return pV;
    }
}
