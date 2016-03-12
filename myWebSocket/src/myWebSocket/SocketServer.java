/**
* @Project: myWebSocket
* @Title: SocketServer.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月25日 下午11:27:30
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package myWebSocket;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.websocket.StreamInbound;
import org.apache.catalina.websocket.WebSocketServlet;

/**
* @ClassName: SocketServer
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月25日下午11:27:30
* @remark: 
*/

public class SocketServer extends WebSocketServlet {
    private static final long serialVersionUID = 1L;
    //……
    @Override
    protected StreamInbound createWebSocketInbound(String arg0,
            HttpServletRequest arg1) {
        // TODO Auto-generated method stub
        return new ChatWebSocket(users);
    }
}



