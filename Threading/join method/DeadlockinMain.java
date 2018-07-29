class DeadlockinMain
{
public static void main(String...s)
{

try{Thread.currentThread().join();}catch(InterruptedException e){e.printStackTrace();}
System.out.println("This will never be printed");

}



}