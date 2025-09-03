import java.io.*;
import java.net.*;

class ChatServer {
    public static void main(String Arg[]) {
        ServerSocket ssobj = null;
        Socket sobj = null;

        try {
            ssobj = new ServerSocket(5100);
            System.out.println("Marvellous server is waiting at port number 5100");

            sobj = ssobj.accept();
            System.out.println("Marvellous Server successfully connected with the client");

            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
            BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("----------------------------------------------------");
            System.out.println("Marvellous Chat Messenger is ready to use");
            System.out.println("----------------------------------------------------");

            String str1, str2;

            while ((str1 = bobj1.readLine()) != null) {
                System.out.println("Client says : " + str1);
                
                if (str1.equals("end")) {
                    System.out.println("Client ended the chat. Closing connection...");
                    break;
                }

                System.out.println("Enter the message for client : ");
                str2 = bobj2.readLine();
                pobj.println(str2);
            }

            // Cleanup
            pobj.close();
            bobj1.close();
            bobj2.close();
            sobj.close();
            ssobj.close();

        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
