import java.io.*;
import java.net.*;

class ChatClient {
    public static void main(String Arg[]) {
        try {
            System.out.println("Marvellous Client is ready to connect with server");

            Socket sobj = new Socket("localhost", 5100);
            System.out.println("Marvellous Client is successfully connected with server");

            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("----------------------------------------------------");
            System.out.println("Marvellous Chat Messenger is ready to use");
            System.out.println("----------------------------------------------------");

            String str1, str2;

            while (!(str1 = bobj2.readLine()).equals("end")) {
                pobj.println(str1);
                str2 = bobj1.readLine();
                System.out.println("Server says : " + str2);
                System.out.println("Enter message for server : ");
            }

            // Close all connections
            pobj.close();
            bobj1.close();
            bobj2.close();
            sobj.close();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
