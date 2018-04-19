
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int i,clients;
        String server_response;
        
        try{
            ServerSocket ss = new ServerSocket(4000);
            System.out.println("Server started on port 4000 : ");
            
            System.out.println("Enter total no of clients : ");
            clients = sc.nextInt();
            
            Socket s[] = new Socket[clients];
            DataInputStream dis[] = new DataInputStream[clients];
            DataOutputStream dos[] = new DataOutputStream[clients];
            
            int client_response[] = new int[clients];
            System.out.println("Waiting for "+clients+" clients to connect...");
            
            for(i=0;i<clients;i++){
                s[i] = ss.accept();
                dos[i] = new DataOutputStream(s[i].getOutputStream());
                System.out.println("Client "+(i+1)+" connected");
            }
            
            for(i=0;i<clients;i++){
                dos[i].writeUTF("Are you ready to commit? :\n1.Yes\n2.No\n");
                dos[i].flush();
            }
            System.out.println("Query sent to all");
            
            for(i=0;i<clients;i++){
                dis[i] = new DataInputStream(s[i].getInputStream());
                client_response[i] = dis[i].readInt();
                System.out.println("Response "+client_response[i]+" from client "+(i+1)+" received");
            }
            
            int c=0;
            for(i=0;i<clients;i++){
                if(client_response[i]==1){
                    c++;
                }
            }

            if