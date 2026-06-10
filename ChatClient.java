import java.io.*;
import java.net.*;

Class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        


        Scoket sobj = new Scoket("Localhost",5100);
        System.out.println("Client gets connected with Server successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));




        System.out.println("Enter Message for Server:");
        String str = bobj2.readLine();
        pobj.println(str);



        str = bobj1.readLine();
        System.out.println("Client says :"+str);
        
    }
}