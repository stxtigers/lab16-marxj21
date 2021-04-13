public class Sloth implements Animal
{
double weight;
double pos = 0;
double length;
double movespeed;
String Sound = "HAHAHHA! YES I AM SLOTH";
private static final int numberOfLimbs = 4; 
public static int  numOfAnimalB = 0;
public int ID = 0;

public Sloth(double weight, double legnth){
  this.weight = weight;
  this.length = legnth;
  this.movespeed = 1;
  numOfAnimalB++;
  ID = numOfAnimalB;
  }
public void move(int time)
{
pos += time*movespeed;
}
public String toString()
{
  String str = "Sloth " + ID + ": at location " + pos;
  return str;
}
public String sound ()
{
  return Sound;
}
}