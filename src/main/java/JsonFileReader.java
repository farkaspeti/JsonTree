import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonFileReader {
    
    
    public JSONArray fileReader(String fileName) throws IOException, ParseException {
        File file = new File(fileName);
        JSONParser parser = new JSONParser();
        return (JSONArray) parser.parse(new FileReader(file));
    }
}
