import java.text.DecimalFormat;

public class ProductionWorker extends Employee
{
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;
    private int shift;
    private double payRate;

    public ProductionWorker(String n, String num, String date, int sh, double rate)
    {
        super(n,num,date);
        shift = sh;
        payRate = rate;
    }

    public ProductionWorker()
    {
        super();
        shift = DAY_SHIFT;
        payRate = 0.0;
    }

    public void setShift(int s)
    {
        shift = s;
    }

    public void setPayRate(double rate)
    {
        payRate = rate;
    }

    public int getShift()
    {
        return shift;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public String toString()
    {
        String str = super.toString();

        str += "\nShift: ";
        if(shift == DAY_SHIFT)
        {
            str += "Day";
        }else if(shift == NIGHT_SHIFT)
        {
            str += "Night";
        }

        return str += ("\nHourly Pay Rate: $" + payRate);
    }
}
