//shutdown hooks are executed whether program  is terminated abrupltly(due to exception),or by user(ctrl+C) or naturally(when main ends)

class shutdownhook
{

public static void main(String...s)
{
Runtime.getRuntime().addShutdownHook(new Thread(){
public void run(){System.out.println("shutting down");}});
System.out.println("hello main");
int c=10/0;



}


}