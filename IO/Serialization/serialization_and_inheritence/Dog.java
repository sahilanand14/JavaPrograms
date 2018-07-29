import java.io.Serializable;
class Dog extends Animal implements Serializable
{
    int dog = 20;
    static
    {
        System.out.println("static block of Dog called");
    }
    {
        System.out.println("Init block of Dog called");
    }


    Dog()
    {
        System.out.println("Default constructor of Dog");
    }

}

class Animal
{
    int animal = 100;
    static
    {
        System.out.println("static block of Animal called");
    }
    {
        System.out.println("Init block of Animal called");
    }
    Animal()
    {
        System.out.println(" Default Constructor of Animal called");
    }
}


//if parent class is not serializable, its constructor must be called during deserialization.
// therefore non serializable class must have a default constructor