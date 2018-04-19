import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            Socket s = new Socket("localhost",4000);
            System.out.println("Conected to server");
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                        
            System.out.println(dis.readUTF());
            dos.writeInt(sc.nextInt());
            
            if(dis.readUTF().equals("Global commit")){
                System.out.println("Commited globally");
            }
            else{
                System.out.println("Aborted");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
