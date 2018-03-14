
package digpro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author allwi
 */
import java.awt.GraphicsEnvironment;
 
public class GetFontList {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        GraphicsEnvironment grapEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNameList = grapEnv.getAvailableFontFamilyNames();
        for(String fontName : fontNameList){
             System.out.println(fontName);
        }
    }
 
}
