import java.io.*;
class Run
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.dog = 330;
        d1.animal = 120;
        try
        {
            System.out.println("Before Serialization:");
            System.out.println(d1.animal);
            System.out.println(d1.dog);

            ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("test.txt"));
            oout.writeObject(d1);
            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("test.txt"));
            Dog d = (Dog)oin.readObject();

            System.out.println("After DeSerialization:");
            System.out.println(d.animal);
            System.out.println(d.dog);


        }
        catch(IOException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}