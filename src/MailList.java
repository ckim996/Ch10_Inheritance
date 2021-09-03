import java.util.Scanner;

public class MailList
{
    public static void main(String[] args)
    {
        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.print("What is customer name: ");
        String n = sc.nextLine();
        c.setName(n);

        System.out.print("\nWhat is customer address: ");
        String address = sc.nextLine();
        c.setAddress(address);

        System.out.print("\nWhat is customer phone # (FORMAT XXX-XXX-XXXX):");
        String teleNum = sc.nextLine();
        c.setTelephone(teleNum);

        System.out.print("\nProvide customer number:");
        String cNum = sc.nextLine();
        c.setCustomerNum(cNum);

        System.out.print("\nDoes customer want to subscribe to the mail list: (y/n): ");
        String choice = sc.nextLine();
        if(choice.toUpperCase().equals("Y"))
        {
            c.setMailList(true);
        }else{
            c.setMailList(false);
        }

        System.out.println(c);

    }
}
