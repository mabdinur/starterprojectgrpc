package helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderHelper
{
    public static JSONObject getData(String fileName)
    {
        JSONObject dataJson = new JSONObject();
        try
        {
            // Read JSON file
        	FileReader reader = new FileReader(fileName);
            JSONParser jsonParser = new JSONParser();
            dataJson = (JSONObject) jsonParser.parse(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dataJson;
    }
}
