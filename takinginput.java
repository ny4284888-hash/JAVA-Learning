import java.util.*;                                    // Import the Scanner class from the java.util package to read input from the user.
 public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         // Create a Scanner object to read input from the user.
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();                    // Read an integer input from the user.
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
    
}
