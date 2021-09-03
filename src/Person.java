public class Person
{
    private String name;
    private String address;
    private String telephone;

    public Person()
    {
        name = "";
        address = "";
        telephone = "";
    }

    public Person(String n, String a, String tele)
    {
        name = n;
        address = a;
        telephone = tele;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setAddress(String add)
    {
        address = add;
    }

    public void setTelephone(String tele)
    {
        if(isValidNum(tele))
        {
            telephone = tele;
        }else{
            telephone = "";
        }
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public boolean isValidNum(String tele)
    {
        boolean status = true;
        if(tele.length() != 10)
        {
            status = false;
            // XXX-XXX-XXXX
        }else if(!Character.isDigit(tele.charAt(0)) ||
                !Character.isDigit(tele.charAt(1)) ||
                !Character.isDigit(tele.charAt(2)) ||
                (tele.charAt(3) != '-') ||
                !Character.isDigit(tele.charAt(4)) ||
                !Character.isDigit(tele.charAt(5)) ||
                !Character.isDigit(tele.charAt(6)) ||
                (tele.charAt(7) != '-')||
                !Character.isDigit(tele.charAt(8)) ||
                !Character.isDigit(tele.charAt(9)) ||
                !Character.isDigit(tele.charAt(10)) ||
                !Character.isDigit(tele.charAt(11))
        )
        {
            status = false;
        }
        return status;
    }

    public String toString()
    {
        String str = "Customer Name: " + name + "\nCustomer Address: " + address + "\nPhone num: (XXX-XXX-XXXX):";

        if(telephone == "")
        {
            str += "INVALID PHONE #";
        }else{
            str += telephone;
        }

        return str;
    }
}
