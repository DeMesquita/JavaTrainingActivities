import java.util.*;

public class SetExercises {

    public static void main(String[] args) {
        System.out.println("\n--------Exercícios Set---------");
        //q1
        System.out.println("\n--------q1---------");
        Set<String> names = new HashSet<>();

        names.add("José");

        //q2
        System.out.println("\n--------q2---------");
        names.add("Nayara");
        names.add("Julia");

        System.out.println(names);

        //q3
        System.out.println("\n--------q3---------");
        System.out.println("Size: " + names.size());


        //q4
        System.out.println("\n--------q4---------");
        System.out.println(names);
        names.clear();
        System.out.println("Size: " + names.size());


        //q5
        System.out.println("\n--------q5---------");

        if (names.isEmpty()) {
            System.out.println("Empty set");
        }

        //q6
        System.out.println("\n--------q6---------");

        names.add("João");
        names.add("Mayara");
        names.add("Juliana");

        Set<String> namesCopy = new HashSet<>();

        for (String name: names) {
            namesCopy.add(name);
        }
        System.out.println(namesCopy);

        //q7
        System.out.println("\n--------q7---------");

        List<String> arrayNames = new ArrayList<String>(names);
        System.out.println(arrayNames);
        System.out.println(arrayNames.get(0));

        //q8
        System.out.println("\n--------q8---------");
        Set<Integer> hashNumbers = new HashSet<>();
        hashNumbers.add(1);
        hashNumbers.add(4);
        hashNumbers.add(3);
        hashNumbers.add(2);
        TreeMap<Integer, Integer> treeClone = new TreeMap<>();
        Integer cont;
        for (Integer number: hashNumbers) {
            cont = number;
            treeClone.put(number, cont);

        }
        System.out.println(hashNumbers);
        System.out.println(treeClone.values());


        //q9
        System.out.println("\n--------q9---------");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);

        List<Integer> numbersArrayList = new ArrayList<>(numbers);
        System.out.println(numbersArrayList.get(0));
        System.out.println(numbersArrayList);

        //q10
        System.out.println("\n--------q10---------");
        Set<Integer> numbersOne = new HashSet<>();
        numbersOne.add(5);
        numbersOne.add(2);
        numbersOne.add(7);

        Set<Integer> numbersTwo = new HashSet<>();
        numbersTwo.add(6);
        numbersTwo.add(5);
        numbersTwo.add(7);

        for (Integer numberOne: numbersOne) {
            for (Integer numberTwo: numbersTwo) {
                if (numberOne.equals(numberTwo))
                    System.out.println("Same number: "+ numberOne );
            }
        }

        //q11
        System.out.println("\n--------q11---------");

        Set<Integer> numbersFirstList = new HashSet<>();
        numbersFirstList.add(5);
        numbersFirstList.add(2);
        numbersFirstList.add(7);

        Set<Integer> numbersSecondList = new HashSet<>();
        numbersSecondList.add(6);
        numbersSecondList.add(5);
        numbersSecondList.add(7);

        Set<Integer> numbersThirdList = new HashSet<>();

        for (Integer numberOne: numbersFirstList) {
            for (Integer numberTwo: numbersSecondList) {
                if (numberOne.equals(numberTwo))
                    numbersThirdList.add(numberOne);
            }
        }

        System.out.println("numbersThirdList: "+numbersThirdList);

        //q12
        System.out.println("\n--------q12---------");

        numbersThirdList.clear();
        System.out.println("numbersThirdList: "+numbersThirdList);


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

        System.out.println(quantity.get("a"));;

        //q11
        System.out.println("\n--------q11---------");
        System.out.println(quantity.keySet());;


        //q12
        System.out.println("\n--------q12---------");
        System.out.println(quantity.values());












    }
}
