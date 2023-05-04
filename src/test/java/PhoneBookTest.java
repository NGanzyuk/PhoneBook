import org.junit.jupiter.api.*;

public class PhoneBookTest {
    private static long startTime;
    private long testStartTime;

    @BeforeAll
    public static void init(){
        System.out.println("Тестирование запущено");
        startTime = System.nanoTime();
    }
    @AfterAll
    public static void completeTests(){
        System.out.println("Тестирование завершено "+ (System.nanoTime() - startTime));
    }
    @BeforeEach
    public void runningTest(){
        System.out.println("Тест запущен");
        testStartTime = System.nanoTime();
    }
    @AfterEach
    public void finishTests(){
        System.out.println("Тест пройден "+ (System.nanoTime() - testStartTime));
    }

    @Test
    public void testAdd(){
        final int result = 1;
        PhoneBook phoneBook = new PhoneBook();
        int expected = phoneBook.add("Name", "Number");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber(){
        final String result = "Name";
        PhoneBook phoneBook = new PhoneBook();
        String number = "Number";
        phoneBook.add("Name", number);
        String expected = phoneBook.findByNumber(number);
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void testFindByName(){
        final String result = "Number";
        PhoneBook phoneBook = new PhoneBook();
        String name = "Name";
        phoneBook.add(name, "Number");
        String expected = phoneBook.findByName(name);
        Assertions.assertEquals(expected, result);
    }
}
