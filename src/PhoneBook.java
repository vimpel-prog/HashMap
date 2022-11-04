import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {
    private Map<String,String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void addNumber(String nameSurname, String number) {
        phoneBook.put(nameSurname,number);
    }
    public void getNumber(String name) {
        phoneBook.get(name);
    }
    public void printAll(){
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }
    }
}
