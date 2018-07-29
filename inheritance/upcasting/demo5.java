// NOTE : Overriding happens only with instance memeber function. NOT  with static functions or instance data members.
class demo5
{
public void display()
{
System.out.println("papa ka Display");
}

public static void printname()
{
System.out.println("papa ka printname");
}

public void papapersonal()
{
System.out.println("papa personal method");


}

}
class demo6 extends demo5
{
public void show()
{
System.out.println("bete ka personal Show");
}
public void display()
{
System.out.println("bete ka Display");
}

public static void printname()
{
System.out.println("bete ka printname");
}


public static void main(String...s)
{
  demo5 d=new demo6();  //upkasting,child ka reference papa me rakha jaa skta h.


//d.show();  complie time error kyonki papa ke variable se bete ke "personal" methods nhi chala skte.
			//working: papa k variable se chalane ki koshish kr rahe h isliye compile time par pehle show ko check
			//krne papa k paas jaega. agar show papa me mil  mil gya to bete ka show chala dega. agar nhi mila to error fek dega. 


  demo6 dd=(demo6)d;//solution to above problem is Downcasting. 
  dd.show();
  
  ((demo6)d).show(); //same as above 2 statments


  d.display();// bete ka chalega as we have overriden it and it is also in papa class so error nhi aayega.
  

  //important: static methods k case me "FUNCTION HIDING"  hogi isliye depend krega ki kis type ke reference variable
  //se function call kr rhe h. therefore papa ka printname chalega.
  d.printname();
  


  d.papapersonal();



//summary:
//agar papa k reference variable se koi bhi function chalayege to pehle check krne papa m hi jaayega, agar papa m method nhi mila 
//to error aayegi. 
//agar papa m mila but bete ne override nhi kiya to papa wala chalega.
//agar bete ne ovverride kiya to bete wala chalega.

}


}