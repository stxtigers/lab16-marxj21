public class TechEmployee extends Employee{
  String qual;

public TechEmployee()
{
  super();  
}
  public void setQual(String ql)
  {
    qual = ql;
  }
public String getQual()
{
  return qual;
}
public void setPayRate(double pr)
{
payRate = 2*pr;
}
public String toString()
{

  String str = "Employee " + ID + ":" + lastname + " is payed " + payRate+ " and has the additional qualification of: "+ qual;
  return str;}
}