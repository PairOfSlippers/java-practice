import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMaps{
    public static void main(String[] Args){
        //Creating a HashMap: HashMap<keyDataType,valueDataType> mapName=new HashMap<>();
        HashMap<String,Integer> map=new HashMap<>();

        //Input value in HashMaps: mapName.put(key,value);
        map.put("China",150);
        map.put("India",120);
        map.put("USA",30);

        //Values can be overidden.
        map.put("India",180);

        //Printing a HashMap:
        System.out.println(map);

        //Checking if a key is present in a map: mapName.containsKey(keyName);
        if(map.containsKey("Indonesia"))
            System.out.println("Map contains it.");
        else
            System.out.println("Map does not contain it.");

        //To get value of a key: mapName.get(keyName);
        System.out.println(map.get("China"));

        //To Iterate a HashMap:
        /* Method 1: using Map.Entry
        Map.Entry<keyDataType,valueDataType> name : mapName.entrySet();
         */
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()+"= "+e.getValue());
        }

        /*Method 2: using SetKey method:
        Set<keyDataype> name=mapName.keySet();
        for(keyDatatype name2 : name)
            System.println(key+" "+mapName.getKey());
         */
        Set<String> e=map.keySet();
        for(String keys: e){
            System.out.println(keys+"= "+map.get(keys));
        }

        //Removing a key: mapName.remove(keyName);
        map.remove("USA");
        System.out.println(map);
    }
}
