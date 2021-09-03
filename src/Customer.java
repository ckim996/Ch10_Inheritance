public class Customer extends Person
{
    private String customerNum;
    private boolean mailList;

    public Customer()
    {
        customerNum ="";
        mailList = false;
    }

    public Customer(String n, String a, String tele, String cNum, boolean mList)
    {
        super(n,a,tele);
        customerNum = cNum;
        mailList = mList;
    }

    public void setCustomerNum(String n)
    {
        customerNum = n;
    }

    public void setMailList(boolean s)
    {
        mailList = s;
    }

    public String getCustomerNum()
    {
        return customerNum;
    }

    public boolean getMailList()
    {
        return mailList;
    }

    public String toString()
    {
        String str = super.toString();

        str += "\nCustomer Number: " + customerNum;

        if(mailList == true)
        {
            str += "\nCustomer is added to mail list";
        }else{
            str += "\nCustomer does not want to be in the mail list";
        }

        return str;
    }
}
