import java.text.DecimalFormat;

public class PreferredCustomer extends Customer
{
    private double amount;
    private int discount;

    public PreferredCustomer()
    {
        amount = 0.00;
        discount = 0;
    }

    public PreferredCustomer(String n, String a, String tele, String cNum, boolean mList, double price, int dc)
    {
        super(n,a,tele,cNum,mList);
        amount = price;
        discount = dc;
    }

    public void setAmount(double p)
    {
        amount = p;
    }

    public void setDiscount(int s)
    {
        discount = s;
    }

    public double getAmount()
    {
        return amount;
    }

    public int getDiscount()
    {
        return discountLevel(discount);
    }

    public int discountLevel(int dc)
    {
        if(amount >= 500 || amount < 1000)
        {
            dc = 5;
        }else if(amount >= 1000 || amount < 1500)
        {
            dc = 6;
        }else if(amount >= 1500 || amount < 2000)
        {
            dc = 7;
        }else if(amount >= 2000)
        {
            dc = 10;
        }else{
            dc = 0;
        }
        return dc;
    }

    public String toString()
    {
        DecimalFormat dc = new DecimalFormat("'$'0.00");
        String str = "Customer paid: " + amount + " and should be getting " + discount + "% discount.";
        int disc = getDiscount();
        double finalPrice = amount - (amount * (disc/100));
        str += "\nFinal price will be " + dc.format(finalPrice);
        return str;
    }
}
