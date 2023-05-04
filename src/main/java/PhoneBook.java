import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook;
    public PhoneBook(){
        phoneBook = new HashMap<>();
    }
    public int add (String name, String number){
        this.phoneBook.put(name, number);
        return this.phoneBook.size();
    }
}
