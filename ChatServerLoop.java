import java.io.*;
import java.net.*;

Class ChatServerLoop
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

        System.out.println("----------------------------------------------");
        System.out.println("--------------Marvellous Server---------------");
        System.out.println("----------------------------------------------");

        String str1 = null,str2 = null;

        while((str1 = bobj2.readLine()) != null)
        {
            System.out.println("Client Says :"+str1);
            System.out.println("Enter message for Client :");
            str1 = bobj2.readLine();
            System.out.println("Server Says :"+str2);
            System.out.println("Enter Message for Client :");
            str2 = bobj2.readLine();
            pboj.println(str2);

        }
    }
}
