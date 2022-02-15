package additional_tasks;

import java.util.TreeMap;

public class _01_Parse_Data_From_A_String_As_Key_And_Values {
    /*
    Write a method that takes a String has some keys in {} and values after between them
    NOTE: The keys should be sorted!

    TEST DATA:
    {104}LA{101}Paris{102}Berlin{103}Chicago{100}London

    EXPECTED OUTPUT:
    {100=London, 101=Paris, 102=Berlin, 103=Chicago, 104=LA}
     */

    public static TreeMap<String, String> parseDataAsKeyAndValues(String str){
        TreeMap<String, String> dataTable = new TreeMap<>();
        while(str.contains("{")){
            String key = str.substring(str.indexOf("{")+1, str.indexOf("}"));
            str = str.substring(str.indexOf("}"));
            String value = str.contains("{") ? str.substring(str.indexOf("}")+1, str.indexOf("{")) : str.substring(1);
            if(str.contains("{")) str = str.substring(str.indexOf("{"));
            dataTable.put(key, value);
        }
        return dataTable;
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(parseDataAsKeyAndValues("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
    }
}
