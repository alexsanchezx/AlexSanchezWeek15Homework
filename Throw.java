import java.util.Random;

public class Throw implements Runnable {//Runnable allows the class to have threads

 public static String taskName; //String Variable that numbers the task
 static Random random = new Random();

 public Throw(String name) //gives a name to the roll;
 {
  taskName = name; 
  //System.out.println(taskName);

 }

 public void run() {  //method that runs the thread.
  Runnable T1 = new Throw(taskName);//instantiate the thread
  Thread Roll = new Thread(T1);//creates a new thread
  Roll.setName(taskName);
  Roll.start();
 }

}