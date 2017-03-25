package com.websocket.sample;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/demowebsocketservice")
public class WebSocketService {

	@OnOpen
	public void openWebSocketConnection() {
		System.out.println("Web socket connection was established!");
	}
	
	@OnClose
	public void closeWebSocketConnection() {
		System.out.println("Web socket connection was closed!");
	}
	
	@OnMessage
	public String onMessage(String messageFromClient) {
		
		return "Echo from server: " + messageFromClient;
	}
	
	@OnError
	public void onError(Throwable e) {
		if(e != null)
			System.out.println(e.getMessage());
	}
}
