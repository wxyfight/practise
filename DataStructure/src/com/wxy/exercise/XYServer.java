package com.wxy.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

public class XYServer {
	
	ServerSocket serverSocket;
	private int port = 3333; 
	
	public XYServer(int port){
		this.port = port;
	}
	
	public void start(){
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("服务启动。。。。");
			Socket socket = null;
			while(true){
				socket = serverSocket.accept();
				System.out.println(socket.getInetAddress().getHostName()+"已连接。。。");
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				StringBuilder sb = new StringBuilder();
				String tmp;
				while((tmp=br.readLine())!=null){
					sb.append(tmp);
				}
				System.out.println("from client......");
				System.out.println(sb.toString());
				Writer writer = new OutputStreamWriter(socket.getOutputStream());
				writer.write("server saied OK");
				writer.close();
				br.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		XYServer server = new XYServer(3434);
		server.start();
	}
	
}
