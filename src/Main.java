import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        for (int i = 1; i < 21; i++) {
            phoneBook.addNumber("Name"+i+" Surname"+i ,"+7"+(i*11212121));
        }
        phoneBook.printAll();
        /////////////////////
        Product apple = new Product("Яблоко", 15.5f, 3);
        Product orange = new Product("Апельсин", 25.7f, 6);
        Recepts salat = new Recepts("Фруктовый салат");
        salat.addToRecept(apple,7);
        salat.addToRecept(orange,12);
        System.out.printf("%.2f\n",salat.getTotalCost());
        /////////////////////
        Map<String, Integer> map =new HashMap<>();
        for (int i = 0; i < 5; i++) {
            addToMap(map,"Name"+i, i);
        }
        for (Map.Entry<String,Integer> iter : map.entrySet()){
            System.out.println(iter.getKey()+" - "+iter.getValue());
        }
        addToMap(map,"Name8",8);
        addToMap(map,"Name1",111);
        addToMap(map,"Name3",33);

        for (Map.Entry<String,Integer> iter : map.entrySet()){
            System.out.println(iter.getKey()+" - "+iter.getValue());
        }
        //////////////
        Map<String, List<Integer>> map5 = new HashMap<>();
        Random RANDOM =new Random();
        for (int i = 0; i < 5; i++) {
            map5.put("Stringovina №"+i, new ArrayList<>(List.of(RANDOM.nextInt(1001),RANDOM.nextInt(1001),RANDOM.nextInt(1001))));
        }
        Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<String,List<Integer>> mapa : map5.entrySet()){
            int sum=0;
            for (Integer int1 : mapa.getValue()) {
                sum+= int1;
            }
            newMap.put(mapa.getKey(),sum);
        }
        for (Map.Entry<String, Integer> iter : newMap.entrySet()) {
            System.out.println(iter.getKey()+"---"+iter.getValue());
        }
        //////////////
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        for(int i = 1 ; i<11 ; i++){
            linkedMap.put(i,i*111+"");
        }
        for(Map.Entry<Integer,String> linkMap : linkedMap.entrySet()){
            System.out.println(linkMap.getKey()+"---"+linkMap.getValue());
        }
    }
    static void addToMap(Map<String, Integer> map , String s, Integer i){
        if(map.containsKey(s)&&map.get(s).equals(i)){
            throw new RuntimeException("Такое значение уже есть в таблице");
        } else map.put(s, i);
    }
}