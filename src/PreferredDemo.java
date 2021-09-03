import java.util.Scanner;

public class PreferredDemo
{
    public static void main(String[] args)
    {
        PreferredCustomer pc = new PreferredCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.print("What is customer name: ");
        String n = sc.nextLine();
        pc.setName(n);

        System.out.print("\nWhat is customer address: ");
        String address = sc.nextLine();
        pc.setAddress(address);

        System.out.print("\nWhat is customer phone # (FORMAT XXX-XXX-XXXX):");
        String teleNum = sc.nextLine();
        pc.setTelephone(teleNum);

        System.out.print("\nProvide customer number:");
        String cNum = sc.nextLine();
        pc.setCustomerNum(cNum);

        System.out.print("\nDoes customer want to subscribe to the mail list: (y/n): ");
        String choice = sc.nextLine();
        if(choice.toUpperCase().equals("Y"))
        {
            pc.setMailList(true);
        }else{
            pc.setMailList(false);
        }

        System.out.print("\nHow much did customer spend: ");
        double price = sc.nextDouble();
        pc.setAmount(price);

        System.out.println(pc);

    }
}
