import java.util.*;

class Athread extends Thread
{
public void run()
{
for(int i = 1 ; i<=10;i++)
{
System.out.println("\t From Thread A :i = " + i);
try 
 { Thread.sleep(1000); 
 } 
 catch (InterruptedException ie) 
 { }
}
System.out.println("Exit From A");
}
}
class Bthread extends Thread
{
public void run()
{
for(int j = 1 ; j<=10;j++)
{
System.out.println("\t From Thread B :j = " + j);
}
System.out.println("Exit From B");
}
}
class Cthread extends Thread
{
public void run()
{
for(int k = 1 ; k<=10;k++)
{
System.out.println("\t From Thread C :K = "+ k);
}
System.out.println("Exit From C");
}
}
public class New 
{
public static void main(String[] args) 
{
// TODO Auto-generated method stub
 
 Athread objA = new Athread();
 Bthread objB = new Bthread();
 Cthread objC = new Cthread();
 
 objC.setPriority(Thread.MAX_PRIORITY);
 objB.setPriority(5);
 objA.setPriority(1);
 System.out.println("Priority of " + objA.getName() + ": " + objA.getPriority());
 System.out.println("Priority of " + objB.getName() + ": " + objB.getPriority());
 System.out.println("Priority of " + objC.getName() + ": " + objC.getPriority());
 
 System.out.println("Start Thread A");
 objA.start();
 System.out.println("Start Thread B");
 objB.start();
 System.out.println("Start Thread C");
 objC.start();
 System.out.println("End of Main Thread");
 
}
}