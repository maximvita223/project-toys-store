import java.util.PriorityQueue;
public class Store {
    private static PriorityQueue<Toy> toys = new PriorityQueue((t1, t2) -> ((Toy) t2).getWeight() - ((Toy) t1).getWeight());

    public void put(String line) {
        String[] tokens = line.split(" ");
        int id = Integer.parseInt(tokens[0]);
        int weight = Integer.parseInt(tokens[1]);
        String name = tokens[2];

        Toy toy = new Toy(id, name, weight);
        toys.add(toy);

    }

    public static PriorityQueue<Toy> getToyQueue() {
        return toys;
    }

    public static String get() {
        double rand = Math.random()*10;
        double cumulativeWeight = 0;

        for (Toy toy : toys) {
            cumulativeWeight += toy.getWeight();

            if (rand <= cumulativeWeight) {
                return String.valueOf(toy.getId());
            }
        }
        return "1";
    }
}