package Set;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread{
   
   //서버 접속을 위한 객체들
   Socket s; //클라이언트 정보
   BufferedReader in;
   public PrintWriter out;
   ChatServer server;
   String ip;
   
   public CopyClient(Socket s, ChatServer server) {
      this.s=s; //클라이언트
      this.server=server; //서버
      
      try {
         
         in=new BufferedReader(new InputStreamReader(s.getInputStream()));
         out=new PrintWriter(s.getOutputStream(), true); //true : append(추가)
         ip=s.getInetAddress().getHostAddress(); //클라이언트 ip
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   @Override
   public void run() {
      while(true) {
         try {
            
            String msg=in.readLine();
            
            if(msg.equals("xx:~X")) {
               out.println("xx:~X");
               
               server.removeClient(this);
               break;
            }
            
            //관리자 - 고객분리
            if(ip.equals("172.16.10.18")) {
               server.sendMessage("관리자 : " + msg);
            }else {
               server.sendMessage("고객 : " + msg);
            }
               
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}