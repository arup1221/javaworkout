import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

class  MapUsingHash {
    private Entity[] entities;
    public MapUsingHash() {
        entities = new Entity[100];
    }
    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); //overriding
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null &&entities[hash].equals(key)){
            entities[hash] = null;
        }
    }

    private  class Entity {
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}




public class Main {
    public static void main(String[] args) {
//        String name = "Arup";
//        int code = name.hashCode();
//        System.out.println(198 / 10);
//        TreeMap<String, Integer> map = new TreeMap<>();

//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("Arup", 34);
//        map.put("anny", 99);
//        map.put("victor", 64);

//        System.out.println(map.get("anny"));
//        System.out.println(map.getOrDefault("Anushka", 10));

//        HashSet<Integer> set = new HashSet<>();
//        set.add(89);
//        set.add(9);
//        set.add(12);
//        set.add(43);
//        set.add(56);
//        set.add(2);
//
//        System.out.println(set);


        //hashDemo();

//        MapUsingHash map = new MapUsingHash();
        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("Mango", "king of fruits");
        map.put("Apple", "A sweet red fruit");
        map.put("Lichi", "Good fruit");

        System.out.println(map);
    }
}