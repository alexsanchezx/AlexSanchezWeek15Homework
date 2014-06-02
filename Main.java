import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{

 public static void main(String[] args) {

  Throw[] Roller = new Throw[25];

  System.out.println("Starting executor");
  ExecutorService TE = Executors.newCachedThreadPool();
  for(int i = 0; i<Roller.length;i++)
  {
   //create task with array
   Roller[i]= new Throw("taskName " + i); 
   int sum = Dice.Throw();
   //System.out.println(Throw.taskName);
   System.out.println(Throw.taskName+" landed on "+sum);
  }


  for(int i = 0;i<Roller.length;i++){
   //execute with array
   TE.execute (Roller[i]);
  } 
  TE.shutdown();
  System.out.println("Task started, main ended.\n");

 }
}