import java.net.*;
import java.util.*;
import com.mongodb.*;

public class ConnectToDB { 
   
   public static void main( String args[] ) throws Exception{  
      
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 ); 
   
      // Creating Credentials 
     List<String> databases=mongo.getDatabaseNames();
     for(String str:databases)
     {
      System.out.println(str);
      DB db=mongo.getDB(str);
      Set<String> collections=db.getCollectionNames();
      for(String str1:collections)
     {
      System.out.println(str1);
      }
      mongo.close();
     
     
     }
      
      
   } 
}
