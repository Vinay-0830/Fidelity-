import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String reverse = "";

        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            reverse = words[i] + " " + reverse;
        }
        System.out.println(reverse);
    }
}
