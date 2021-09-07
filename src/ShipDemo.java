import java.util.Scanner;

public class ShipDemo
{
    public static void main(String[] args)
    {
        final int CARGO_CARRYING_CAPACITY = 2240; // 2240 lbs
        final int maxNumPassenger = 6680;
        String name;
        String year;

        Scanner sc = new Scanner(System.in);

        System.out.print("What will be your personal ship name: ");
        name = sc.nextLine();
        System.out.print("What year is your boat: ");
        year = sc.nextLine();
        Ship s = new Ship(name,year);

        System.out.println();

        System.out.print("What will be your Cruise Ship name: ");
        name = sc.nextLine();
        System.out.print("What year is your boat: ");
        year = sc.nextLine();
        Ship cruise = new CruiseShip(name, year, maxNumPassenger);

        System.out.println();

        System.out.print("What will be your Cargo Ship name: ");
        name = sc.nextLine();
        System.out.print("What year is your boat: ");
        year = sc.nextLine();
        Ship cargo = new CargoShip(name,year,CARGO_CARRYING_CAPACITY);

        System.out.println("\n" + s + "\n\n" + cruise + "\n\n" + cargo);
    }
}
