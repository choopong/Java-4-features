import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.close();
        // Must use `java -ea Main01` to run
        assert age > 18 : "Age is not greater than 18";
    }
}