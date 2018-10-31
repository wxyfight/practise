package com.wxy.exercise;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class XTClient {

	Socket socket;
	
	public XTClient(){
	}
	
	public void init(){
		try {
			socket = new Socket("localhost", 3434);
			System.out.println(socket.getPort()+"=============");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void connect(){
		
	}
	
	
	public static void main(String[] args) {
		XTClient client = new XTClient();
		client.init();
	}
}
