package com.ryanair.automation.testdata;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class JSONReader {

    private final static String TEST_DATA_FILE_PATH = "testdata.json";
    private JSONParser jsonParser;

    public String readValue(String key){
        try{
            jsonParser = new JSONParser();
            JSONArray array = (JSONArray) jsonParser.parse(new FileReader(TEST_DATA_FILE_PATH));

            for(Object o: array){
                JSONObject k = (JSONObject) o;
                if(k.containsKey(key)){
                    return (String) k.get(key);
                }

            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
