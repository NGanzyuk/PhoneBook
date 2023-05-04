import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> phoneBook;
    public PhoneBook(){
        phoneBook = new HashMap<>();
    }
    public int add (String name, String number){
        if(this.phoneBook.containsKey(name) || this.phoneBook.containsValue(number)){
            return this.phoneBook.size();
        }
        this.phoneBook.put(name, number);
        return this.phoneBook.size();
    }
    public String findByNumber(String number){
        for (String key: phoneBook.keySet()) {
            if(phoneBook.get(key).equals(number)){
                return key;
            }
        }
        return null;
    }
    public String findByName(String name){
        if (this.phoneBook.containsKey(name)){
            return this.phoneBook.get(name);
        }
        return null;
    }

    public void printAllNames(){
        System.out.println("dasknflsknf");
    }


}
