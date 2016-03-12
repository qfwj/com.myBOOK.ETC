/**
* @Project: myWebSocket
* @Title: ChatWebSocket.java
* @Description: TODO
* @author: zhongbo
* @date :2015年11月25日 下午11:34:26
* @Copyright: Copyright (c) 2015
* @version V3.0
*/

package myWebSocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import org.apache.catalina.websocket.MessageInbound;
import org.apache.catalina.websocket.WsOutbound;

/**
* @ClassName: ChatWebSocket
* @Description: TODO
* @author: zhongbo
* @date: 2015年11月25日下午11:34:26
* @remark: 
*/

public class ChatWebSocket extends MessageInbound {

    @Override
    protected void onTextMessage(CharBuffer message) throws IOException {

    }

    @Override
    protected void onOpen(WsOutbound outbound) {
        
    }

    @Override
    protected void onClose(int status) {
        

    }

    @Override
    protected void onBinaryMessage(ByteBuffer arg0) throws IOException {

    }
//其余略

}

















