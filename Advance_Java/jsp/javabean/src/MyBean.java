package user;
public class MyBean implements java.io.Serializable
{
     private String name;
     private int roll;
     public void setName(String name)
     {this.name=name;}
     public void setRoll(int roll)
     {this.roll=roll;}
     public String getName()
     {
     	return name;
     }
     public int getRoll()
     {return roll;}

}