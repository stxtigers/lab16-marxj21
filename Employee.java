
public class Employee
{
String lastname;
double payRate;
public static int  numOfEmployee = 1;
public int ID = 0;
public Employee()
{
  lastname = "LastName";
  payRate = 7.26;
  ID = numOfEmployee;
  numOfEmployee++;
}
public void setLastName(String name)
{
  lastname = name;
}
public String getlastName()
{
  return lastname;
}
public void setPayRate(double pr)
{
payRate = pr;
}
public double getPayRate( )
{
  return payRate;
}
public String toString()
{
   String str = "Employee "+ ID+ ":"+ lastname + " is payed " + payRate;
  return str;
}
}
