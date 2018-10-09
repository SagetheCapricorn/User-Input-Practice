import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Whats your name sport?");
        String name= input.nextLine();
        System.out.println("Hiya"+name+", nice to meet you!!");
    }
}
