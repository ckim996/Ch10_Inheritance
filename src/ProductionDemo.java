import java.util.Scanner;

public class ProductionDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please write Employee Name: ");
        String name = sc.nextLine();
        System.out.print("\nPlease write Employee Num in the following format (###-L), where L is Character A-M: ");
        String num = sc.nextLine();
        System.out.print("\nPlease write date in the following format: MM-DD-YYYY: ");
        String date = sc.nextLine();
        System.out.print("\nDay (1) or Night Shift (2): ");
        int s = sc.nextInt();
        System.out.print("Pay rate: ");
        double payRate = sc.nextDouble();
        ProductionWorker p = new ProductionWorker(name,num,date,s,payRate);
        System.out.println(p);
    }
}
