package practiceTMS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException{
		PrintWriter writer = null;
		Socket clientSocket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
//		String serverIp = "192.168.181.4";
		String serverIp = "localhost";
		
//		IP, Post
		clientSocket = new Socket(serverIp, 7777);
		System.out.println("서버와 연결되었습니다.");
		
		try {
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
			
			while(true) {
				System.out.println("클라이언트에서 서버로 보내기 >>>");
				String outMessage = sc.nextLine();
				
				out.write(outMessage + "\n");
				out.flush();
				
				String inMessage = in.readLine();
				System.out.println("서버 >>" + inMessage);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(sc != null) {
				sc.close();
			}
			if(out != null) {
				out.close();
			}
			if(clientSocket != null) {
				clientSocket.close();
			}
		}
		
	}
}
