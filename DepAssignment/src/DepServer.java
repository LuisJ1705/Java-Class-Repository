import java.io.*;
import java.net.*;
public class DepServer {
    public static String isPrime(int num) {
        if(num<2) {
            return "No";
        }
        int i=2;
        while(i<num) {
            if(num%i==0) {
                return "No";
            }
            i++;
        }
        return "Yes";
    }
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(8080);
//Connect to server
            Socket s=ss.accept();
            DataInputStream dinputs=new DataInputStream(s.getInputStream());
            DataOutputStream doutput=new DataOutputStream(s.getOutputStream());

            int num = (int)dinputs.readInt();
// Call function and return value to client
            doutput.writeUTF(isPrime(num));
            doutput.flush();

            doutput.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}