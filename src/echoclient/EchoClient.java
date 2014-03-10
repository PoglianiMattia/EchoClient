package echoclient;

import java.io.*;
import java.net.*;

public class EchoClient {

    public static void main(String[] args) throws IOException {

        Socket s = new Socket(InetAddress.getLocalHost(), 6666);
        BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter std_out = new PrintWriter(new OutputStreamWriter(System.out), true);
        
        while (true) {
            sock_out.println(std_in.readLine());
            System.out.println(sock_in.readLine());
        }
    }
}
