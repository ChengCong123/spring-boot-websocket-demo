package com.sunlong.service.impl;

import com.sunlong.service.SendService;
import org.springframework.stereotype.Service;

import javax.websocket.Session;
import java.io.IOException;
import java.util.List;

/**
 * spring-boot-websocket-demo
 *
 * @Author 孙龙
 * @Date 2017/11/28
 */
@Service
public class SendServiceImpl implements SendService {

    @Override
    public void sendBatch(List<Session> sessionList, String message) throws IOException {
        for (Session session : sessionList) {
            sendMessage(session, message);
        }
    }

    @Override
    public void sendMessage(Session session, String message) throws IOException {
        session.getBasicRemote().sendText(message);
    }
}

