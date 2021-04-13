public class Squirrel implements Animal
{
double weight;
double pos = 0;
double length;
double movespeed;
String Sound = "HAHAHHA! YES I AM SQUIRREL";
private static final int numberOfLimbs = 4; 
public static int  numOfAnimalA = 0;
public int ID = 0;
public Squirrel(double weight, double legnth){
  this.weight = weight;
  this.length = legnth;
  this.movespeed = 4;
  numOfAnimalA++;
  ID = numOfAnimalA;
  }
public void move(int time)
{
pos += time*movespeed;
}
public String sound ()
{
  return Sound;
}
public String toString()
{
  String str = "Squirrel " + ID + ": at location " + pos;
  return str;
}
}