public class CargoShip extends Ship
{
    private int capacity;

    public CargoShip()
    {
        capacity = 0;
    }

    public CargoShip(String n, String y, int c)
    {
        super(n,y);
        this.capacity = c;
    }

    public void setCapacity(int c)
    {
        this.capacity = c;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String toString()
    {
        String str = "[Cargo Ship] Ship name: " + getName();
        str += "\nShip capacity: " + capacity + " lbs";

        return str;
    }
}
