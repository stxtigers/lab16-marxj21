public class TestAnima 
{
  public static void main(String args[])
  {
      Animal [] ArrayA = new Animal[4];
      ArrayA [0] = new Sloth(8, 9 );
      ArrayA [1] = new Squirrel(2, 1);
      ArrayA[2] = new GreyS(7,2);
      ArrayA[3] = new FlyingS(7,1);
      for (int i = 0; i != 4; i++ )
      {
      ArrayA[i].move(2);
      }
    for (int x = 0; x!= ArrayA.length; x++)
    {
      System.out.println(ArrayA[x]);
    }
  }
}