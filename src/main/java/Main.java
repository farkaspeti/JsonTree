import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException, ParseException {
        JsonFileReader jsonFileReader = new JsonFileReader();
        jsonFileReader.fileReader();
    }
}
