import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapsConcepts {
    public static void main (String [] args){
        Map <String ,Integer> m = new HashMap<String, Integer>();
        m.put("First",1);
        m.put("Second",2);
        m.put("Third",3);
        System.out.println(m);
        m.put("Third",2);
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.isEmpty());
        System.out.println(m.containsKey("Second"));
        System.out.println(m.containsValue(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());
        System.out.println(m.get("Fist"));
        System.out.println(m.getOrDefault("dog",-1));

    }
}
