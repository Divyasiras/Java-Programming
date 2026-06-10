import java.io.*;
import java.net.*;

Class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.ouyt.println("Server is waiting at port 5100");
        Scoket sobj = ssobj.accept();
                                                                           
        System.out.println("Client request gets accept successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));






        String str = bobj.readLine();
        System.out.println("Client Says :"+str);
        System.out.println("enter message for Client:");
        str = bobj2.readLine();
        pobj.println(str);


        


    }
}
