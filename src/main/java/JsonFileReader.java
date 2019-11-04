import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {
    
    
    public static JSONArray fileReader() throws IOException, ParseException {
        String fileName = "vehicles.json";
        ClassLoader cl = new Main().getClass().getClassLoader();
        JSONParser parser = new JSONParser();
        return (JSONArray) parser.parse(new FileReader(new File(cl.getResource(fileName).getFile())));
    }
}
