public class Ship
{
    private String name;
    private String year;

    public Ship()
    {
        name = "";
        year = "";
    }

    public Ship(String n, String y)
    {
        name = n;
        if(y.length() == 4)
        {
            year = y;
        }else{
            year = "INVALID YEAR. ONLY YEAR ABOVE 999";
        }
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setYear(String y)
    {
        year = y;
    }

    public String getName()
    {
        return name;
    }

    public String getYear()
    {
        return year;
    }

    public String toString()
    {
        String str = "[Personal] Ship name: " + name;
        str += "\nShip year: " + year;

        return str;
    }
}
