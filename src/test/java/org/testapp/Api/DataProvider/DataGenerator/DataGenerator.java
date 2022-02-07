package org.testapp.Api.DataProvider.DataGenerator;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;


import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

public class DataGenerator {
//    //Using GregorianCalendar to fetch the time details
//    Calendar cal = new GregorianCalendar();
//    //Month value is always 1 less than actual. For February, MONTH would return 1
//    int month = cal.get(Calendar.MONTH);
//    int year = cal.get(Calendar.YEAR);
//    int sec = cal.get(Calendar.SECOND);
//    int min = cal.get(Calendar.MINUTE);
//    int date = cal.get(Calendar.DATE);
//    int day = cal.get(Calendar.HOUR_OF_DAY);
//
//    static DataGenerator dataGenerator;
//    public static DataGenerator getDataGenerator(){
//
//        return dataGenerator = new DataGenerator();
//    }
//    public String getRandomData(){
//
//        return year + "_" + date+ "_" + (month + 1) + "_" + day + "_" + min + "_" + sec;
//    }


//    public void readJSONArray(int pos) throws IOException, ParseException {
//        String fileName = "./src/test/resources/users.json";
//        JSONParser jsonParser = new JSONParser();
//        Object obj = jsonParser.parse(new FileReader(fileName));
//        JSONArray jsonArray = (JSONArray) obj;
//        JSONObject jsonObj = (JSONObject) jsonArray.get(pos);
//        System.out.println(jsonObj.get("email"));
//        setEmail((String) jsonObj.get("email"));
//
//    }
    public  static  void read() throws IOException {
        FileReader reader=new FileReader("apiConfig.properties");
        Properties p= new Properties();
//        FileOutputStream fileOutputStream
//                = new FileOutputStream(
//                "userCreated.properties");
        p.load(reader);
        System.out.println(p.getProperty("mspid"));
    }

    public String generateRandomid(int min,int max){
        double id=Math.random()*(max-min)+min;
        return "test"+(int)id;
    }





}
