import java.util.HashMap;
import java.util.Map;

public class MapExercises {
    public static void main(String[] args) {
        System.out.println("\n\n--------Exercícios-Map---------");

        //q1
        System.out.println("\n--------q1---------");
        Map<Integer, String> namesList = new HashMap<Integer, String>();

        namesList.put(0, "Nayara");
        namesList.put(2, "Dya");
        namesList.put(1, "Lua");
        System.out.println(namesList);

        //q2
        System.out.println("\n--------q2---------");
        System.out.println(namesList.size());

        //q3
        System.out.println("\n--------q3---------");
        Map<Integer, String> namesCopyMap = new HashMap<Integer, String>();
        namesCopyMap.putAll(namesList);
        System.out.println("Copy: "+namesCopyMap);

        //q4
        System.out.println("\n--------q4---------");

        namesCopyMap.clear();
        System.out.println("Copy empty: "+namesCopyMap);

        //q5
        System.out.println("\n--------q5---------");
        if (namesCopyMap.isEmpty()){
            System.out.println("Empty map");
        }

        //q6
        System.out.println("\n--------q6---------");
        Map<Integer, String> namesSuperficialCopy = new HashMap<Integer, String>(namesList);
        System.out.println(namesSuperficialCopy);

        //q7
        System.out.println("\n--------q7---------");
        if (namesSuperficialCopy.containsKey(1)){
            System.out.println("Map contains key specified");
        }

        //q8
        System.out.println("\n--------q8---------");
        if (namesSuperficialCopy.containsValue("Nayara")){
            System.out.println("Map contains value specified");
        }

        //q9
        System.out.println("\n--------q9---------");
        System.out.println(namesSuperficialCopy);


        //q10
        System.out.println("\n--------q10---------");
        Map<String, Integer> quantity = new HashMap<String, Integer>();

        quantity.put("n", 0);
        quantity.put("a", 1);
        quantity.put("b", 2);
        quantity.put("o", 3);

        System.out.println(quantity.get("a"));

        //q11
        System.out.println("\n--------q11---------");
        System.out.println(quantity.keySet());


        //q12
        System.out.println("\n--------q12---------");
        System.out.println(quantity.values());

    }
}
