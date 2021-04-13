public class TestEmployee 
{
  public static void main(String args[])
  { //employee Array
      Employee [] ArrayA = new Employee[4];
      ArrayA [0] = new Employee();
      ArrayA [1] = new TechEmployee();
      ArrayA[2] = new Employee();
      ArrayA[3] = new TechEmployee();
      for (int i = 0; i != 4; i++ )
      {
      ArrayA[i].setLastName("Stevens");
      }//techemployee array 
      TechEmployee [] ArrayB = new TechEmployee [4];
       ArrayB [0] = new TechEmployee();
      ArrayB [1] = new TechEmployee();
      ArrayB[2] = new TechEmployee();
      ArrayB[3] = new TechEmployee();
      for (int i = 0; i != 4; i++ )
      {
      ArrayA[i].setLastName("Stevens");
         ArrayB[i].setQual("Joker");
      }

    for (int x = 0; x!= ArrayA.length; x++)
    {
      System.out.println(ArrayA[x]);
    
    }
for (int x = 0; x!= ArrayB.length; x++)
    {
      System.out.println(ArrayB[x]);
    
    }
    ArrayB[0].setPayRate(7.5);
    System.out.println(ArrayB[0].getPayRate());
}
}