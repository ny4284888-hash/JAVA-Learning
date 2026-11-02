
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Change value at index 1
        list.set(1, 25);

        // Remove value at index 3
        list.remove(3);

        System.out.println(list);

        System.out.println("Size: " + list.size());
    }
}

