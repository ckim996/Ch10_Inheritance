public class CruiseShip extends Ship
{
    private int maxNum;

    public CruiseShip()
    {
        maxNum = 0;
    }

    public CruiseShip(String n,String y, int m)
    {
        super(n,y);
        maxNum = m;
    }

    public void setMaxNum(int m)
    {
        maxNum = m;
    }

    public int getMaxNum()
    {
        return maxNum;
    }

    public String toString()
    {
        String str = "[Cruise Ship]Ship name: " + getName();
        str += "\nMaximum number of passengers: " + maxNum;

        return str;
    }
}
