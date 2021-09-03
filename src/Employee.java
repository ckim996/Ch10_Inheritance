public class Employee
{
    private String empName;
    private String empNum;
    private String hireDate;

    public Employee()
    {
        empName ="";
        empNum = "";
        hireDate = "";
    }

    public Employee(String name, String num, String date)
    {
        empName = name;
        empNum = num;
        hireDate = date;
    }

    public String getName()
    {
        return empName;
    }

    public String getNum()
    {
        return empNum;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public void setName(String n)
    {
        empName = n;
    }

    public void setEmpNum(String e)
    {
        if(isValidEmpNum(e))
        {
            empNum = e;
        }else{
            empNum = "";
        }
    }

    public boolean isValidEmpNum(String e)
    {
        boolean status = true;

        if(e.length() != 5)
        {
            status = false;
        }else{
            if(!Character.isDigit(e.charAt(0)) || !Character.isDigit(1) || !Character.isDigit(2) || e.charAt(3) != '-' || (Character.toUpperCase(e.charAt(4)) < 'A') || (Character.toUpperCase(e.charAt(4)) > 'M'))
            {
                status = false;
            }
        }

        return status;
    }

    public String toString()
    {
        String str = "Name: " + empName + "\nEmployee Number: ";
        if(empNum == "")
        {
            str += "INVALID EMPLOYEE NUMBER";
        }else{
            str += empNum;
        }

        return str += ("\nHire Date: " + hireDate);
    }
}
