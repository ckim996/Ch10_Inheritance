import java.util.Scanner;

public class AnonymousClassDemo
{
    public static void main(String[] args)
    {
        int num;
        Scanner kb = new Scanner(System.in);
        IntCalculator square = new IntCalculator(){
            public int calculate(int number)
            {
                return number * number;
            }
        };

        System.out.print("Enter an integer number: ");
        num = kb.nextInt();

        System.out.println("the square of " + num + " is " + square.calculate(num));
    }
}
