import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {
    private final int id;
    private final  String name;
    private final HashMap<Integer,String> map;

    ImmutableClass(int id, String name, HashMap<Integer, String> map){
        this.id = id;
        this.name = name;

        HashMap<Integer,String> tempMap = new HashMap<Integer,String>();
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            tempMap.put(entry.getKey(),entry.getValue());
        }

        this.map=tempMap;
    }

    public Integer getId(){
        return  id;
    }
    public String getName(){
        return  name;
    }
    public HashMap<Integer,String> getMap(){
        return  map;
    }
}
