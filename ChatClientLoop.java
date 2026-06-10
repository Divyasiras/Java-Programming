import java.io.*;
import java.net.*;

Class ChatClientLoop
{
    public static void main(String A[]) throws Exception
    {
        


        Scoket sobj = new Scoket("Localhost",5100);
        System.out.println("Client gets connected with Server successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

         System.out.println("----------------------------------------------");
         System.out.println("--------------Marvellous Server---------------");
         System.out.println("----------------------------------------------");

         String str1 = null,str2 = null; 

         while(!(str1 = bobj2.readLine()).equals("End"))
         {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server Says :"+str2);
            System.out.println("Enter Message for Server :");
         }
    }
}
