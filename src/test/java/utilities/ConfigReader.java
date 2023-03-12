package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;

    /*
        METHODU DEVREYE SOKABILMEK ICIN FILEINPUTSTREAM ILE DOSTA YOLUNU BELIRTMEMIZ GEREKIR
     METHODDAN ONCE CALISMASI ICIN STATIC METHOD ICERISINE FILEINPUTSTREAM'I OLUSTURMAMIZ GEREKIR
     */


    // bir classda herseyden once calismasini istedigimiz seyleri static block icine alirizzz.. kendi yorumum..
    static {
        String dosyaYolu ="config.properties" ;
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);//fis'in okudugu bilgileri properties'e yukler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String Key){

        /*
             Test method'undan gonderdigimiz string key degerini alip Properties class'indan getProperty() methodunu
           kullanarak bu key' e ait value'u bize getirir.
         */

        return properties.getProperty(Key);
    }
}
