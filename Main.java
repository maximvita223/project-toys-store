import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        store.put("1 2 конструктор");
        store.put("4 2 робот");
        store.put("3 6 кукла");

        try {
            FileWriter writer = new FileWriter("results.txt");

            for (int i = 0; i < 10; i++) {
                String result = Store.get();
                writer.write(result + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
