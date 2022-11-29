import java.io.*;
import java.net.*;
import java.util.Scanner;

public class DepClient {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            Socket s=new Socket("localhost",8080);
            DataInputStream dinputs=new DataInputStream(s.getInputStream());
            DataOutputStream doutput=new DataOutputStream(s.getOutputStream());

//User input
            System.out.print("\nEnter a Number : ");
            int num = scan.nextInt();
//Write number to server
            doutput.writeInt(num);
            String ans = (String)dinputs.readUTF();
            System.out.println("\nNumber "+num+
                    " Is Prime Number: "+ans);
            doutput.flush();
            doutput.close();
            s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        scan.close();
    }
}