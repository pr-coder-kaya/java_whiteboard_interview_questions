package additional_tasks;

import java.util.LinkedHashMap;

public class _02_Count_Characters_In_A_String {
     /*
    Write a method that takes a String and counts each character it has
    NOTE: IGNORE SPACES
    NOTE: Count all characters as lowercase
    NOTE: First character appears in the String should be counted first and so on.

    TEST DATA:
    Sweet banana

    EXPECTED OUTPUT:
    {s=1, w=1, e=2, t=1, b=1, a=3, n=2}
     */

    public static LinkedHashMap<Character, Integer> countCharacters(String str){
        str = str.toLowerCase().replace(" ", "");
        LinkedHashMap<Character, Integer> dataTable = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            if(dataTable.containsKey(c)){
                dataTable.put(c, dataTable.get(c) + 1);
            }
            else{
                dataTable.put(c, 1);
            }
        }
        return dataTable;
    }

    //Testing method
    public static void main(String[] args) {
        System.out.println(countCharacters("Sweet banana"));
    }
}
