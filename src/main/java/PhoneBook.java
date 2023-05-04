import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map<String, String> phoneBook;
    public PhoneBook(){
        phoneBook = new TreeMap<>();
    }
    public int add (String name, String number){
        if(this.phoneBook.containsKey(name) || this.phoneBook.containsValue(number)){
            throw new SameValuesError("Такие значения уже есть");
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
        for (String key: this.phoneBook.keySet()) {
            System.out.println(key);
        }

    }

    public static class SameValuesError extends RuntimeException {
        public SameValuesError(String message) {
            super(message);
        }
    }

}
