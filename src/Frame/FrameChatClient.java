package Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameChatClient extends JFrame implements Runnable{
   
       //화면구성 : 클라이언트의 메세지를 JFrame으로 보냄(send_bt) -> 서버가 CopyClientㅇ에게 전달    
      JTextArea area; //채팅 내용 출력
      JTextField input; //메세지 입력
      JButton send_bt; //메세지 전송버튼
      JPanel south_p;
      //서버 접속을 위한 객체들
      Socket s;
      BufferedReader in;
      PrintWriter out;
      Thread t;
      
      public FrameChatClient() {
         area=new JTextArea();
         this.add(area);
         
         //BorderLayout 배치이용
         south_p=new JPanel(new BorderLayout());//패널 생성
         south_p.add(input=new JTextField()); //패널의 가운데 입력상자 추가
         south_p.add(send_bt=new JButton("보내기"), BorderLayout.EAST); //패널에 버튼 추가
         
         this.add(south_p, BorderLayout.SOUTH);
         
         this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
               out.println("xx:~X");
               
            }
            
         });
         
         send_bt.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {

               //메세지가 서버로 넘어가는 메서드 구현부
               sendData();
               
            }
         });
         Toolkit tk = Toolkit.getDefaultToolkit();
         
         setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 200, ((int) tk.getScreenSize().getHeight()) / 2 - 300,
               400, 600);
         setVisible(true);
         area.setBackground(new Color(226, 224, 222));
         connected(); //생성자에서 메서드를 호출하여 서버에 접속요청
         
         t=new Thread(this);
         t.start(); //메세지 대기
         
      }
      
      private void connected() {
         
         try {
            
            //서버접속
            s=new Socket("172.16.10.18",2222);
            out=new PrintWriter(s.getOutputStream(), true); //true : append(추가)
            in=new BufferedReader(new InputStreamReader(s.getInputStream()));
            
         } catch (Exception e) {
            e.printStackTrace();
         }
         
      }
      
   public static void main(String[] args) {
      new FrameChatClient();

   }

   @Override
   public void run() {
      // 메세지가 도착하면 화면에 뿌림
      while(true) {
         try {
            
            String msg=in.readLine();//대기상태
            if(msg.equals("xx:~X"))
               break;
            
            if(msg !=null)
               area.append(msg+"\r\n");//윈도우에서 다음라인으로 넘김
            
            
         } catch (Exception e) {
            e.printStackTrace();
         }
         
          }
      
      closed(); //열려있는 스트림 모두 닫기
     
   }
   //작성된 메세지 보냄
   public void sendData() {
      
      String msg=input.getText().trim();
      if(msg.length() > 0) {
         out.println(msg);
      }
      input.setText("");//청소
   }
   
   //closed
   public void closed() {
      try {
         if(out != null)
            out.close();
         if(in != null)
            in.close();
         if(s != null)
            s.close();

      } catch (Exception e) {
         // TODO: handle exception
      }
      
   }

}