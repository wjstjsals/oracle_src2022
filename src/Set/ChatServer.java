package Set;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer extends Thread{
   
   ServerSocket ss;
   ArrayList<CopyClient> list;
   
   public ChatServer() {
      
      try {
         
         list=new ArrayList<CopyClient>(); //리스트 생성
         ss=new ServerSocket(2222);
         
         System.out.println("Server Start!");
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   

   public static void main(String[] args) {
      new ChatServer().start();

   }

   @Override
   public void run() {
      
      
      while(true) {
            //접속대기 상태
      try {
         
         Socket s=ss.accept();
         
         
         
          sendMessage("안녕하세요. 문의하실 내용을 입력해주세요.");   
          //클라이언트와 서버의 정보를 가진 CopyClient 생성
          CopyClient cc=new CopyClient(s, this);
          list.add(cc); //list에 CopyClient추가
          cc.start(); //해당 클라이언트 각자의 스레드 구동 => InputStream을 통해 클라이언트로부터 넘어온 값 처리
          
      } catch (Exception e) {
         e.printStackTrace();
      }
    }
      
   }
   //작성한 내용을 클라이언트에게 전달
   public void sendMessage(String msg) {
      //접속자들은 CopyClient로 만들어져서 ArrayList에 모두 저장된 상태다
      try {
         
         for(CopyClient cc: list) {
            cc.out.println(msg);
         }
         
      } catch (Exception e) {
         e.printStackTrace();
      }   
   }
   
   public void removeClient(CopyClient cc) {
      list.remove(cc); //메개변수로 전달받은 클라이언트를 ArrayList에서 제거
      sendMessage("☆★☆★ 퇴장! ☆★☆★");
      
   }

}