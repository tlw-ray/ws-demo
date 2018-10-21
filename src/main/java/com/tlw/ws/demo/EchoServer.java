package com.tlw.ws.demo;

import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/echo")
@Component
public class EchoServer {
    @OnMessage
    public String echo(String message, Session session){
        System.out.println(session.getId() + " get message: " + message);
        return "Get message: " + message;
    }

    @OnOpen
    public void onOpen(Session session, EndpointConfig config) {
        System.out.println(session.getId() + ": " + config);
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println(session.getId() + ": " + closeReason);
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println(session.getId() + ": " + throwable);
    }
}
