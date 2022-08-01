package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Set.BaseSet;

public class FrameSeason extends JFrame {

   public FrameSeason() {
      // BaseSet 객체 생성
      BaseSet frame = new BaseSet();

      // 계절 이미지
      ImageIcon season = new ImageIcon("image/frame/season.png");
      JLabel lblSeason = new JLabel(season);
      lblSeason.setBounds(115, 70, 350, 85);
      frame.add(lblSeason);

      // 옷로고 팀로고 타이틀로고
      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton();
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);

      // 봄정보 버튼
      ImageIcon info = new ImageIcon("image/info/정보.png");
      ImageIcon infoon = new ImageIcon("image/info/정보on.png");
      JButton btnSpInfo = new JButton();
      frame.ButtonSet(btnSpInfo, info, infoon);
      
      btnSpInfo.setBounds(225, 200, 40, 40);
      frame.add(btnSpInfo);
      btnSpInfo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame InfoSp = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            InfoSp.setTitle("Spring Information");
            InfoSp.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon sp = new ImageIcon("image/info/봄설명.png");
            JLabel spinfo = new JLabel(sp);
            spinfo.setBounds(0, 0, 550, 550);
            InfoSp.add(spinfo);
            InfoSp.setVisible(true);
         }
      });

      // 봄 버튼
      ImageIcon spring = new ImageIcon("image/frame/봄.png");
      ImageIcon springon = new ImageIcon("image/frame/봄on.png");
      JButton btnSpring = new JButton();
      frame.ButtonSet(btnSpring, spring, springon);
      btnSpring.setBounds(40, 190, 236, 236);
      frame.add(btnSpring);

      btnSpring.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameSpringType();
            frame.dispose();
         }
      });

      // 여름정보 버튼
      JButton btnSuInfo = new JButton();
      frame.ButtonSet(btnSuInfo, info, infoon);
      
      btnSuInfo.setBounds(495, 200, 40, 40);
      frame.add(btnSuInfo);
      btnSuInfo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame InfoSu = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            InfoSu.setTitle("Summer Information");
            InfoSu.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon su = new ImageIcon("image/info/여름설명.png");
            JLabel suinfo = new JLabel(su);
            suinfo.setBounds(0, 0, 550, 550);
            InfoSu.add(suinfo);
            InfoSu.setVisible(true);
         }
      });
      
      // 여름 버튼
      ImageIcon summer = new ImageIcon("image/frame/여름.png");
      ImageIcon summeron = new ImageIcon("image/frame/여름on.png");
      JButton btnSummer = new JButton();
      frame.ButtonSet(btnSummer, summer, summeron);

      btnSummer.setBounds(310, 190,236, 236);
      frame.add(btnSummer);

      btnSummer.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameSummerType();
            frame.dispose();
         }
      });

      // 가을정보 버튼
      JButton btnAuInfo = new JButton();
      frame.ButtonSet(btnAuInfo, info, infoon);
      
      btnAuInfo.setBounds(225, 475, 40, 40);
      frame.add(btnAuInfo);
      btnAuInfo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame InfoAu = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            InfoAu.setTitle("Autumn Information");
            InfoAu.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon au = new ImageIcon("image/info/가을설명.png");
            JLabel auinfo = new JLabel(au);
            auinfo.setBounds(0, 0, 550, 550);
            InfoAu.add(auinfo);
            InfoAu.setVisible(true);
         }
      });
      
      // 가을 버튼
      ImageIcon autumn = new ImageIcon("image/frame/가을.png");
      ImageIcon autumnon = new ImageIcon("image/frame/가을on.png");
      JButton btnAutumn = new JButton();
      frame.ButtonSet(btnAutumn, autumn, autumnon);

      btnAutumn.setBounds(40, 465, 236, 236);
      frame.add(btnAutumn);

      btnAutumn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameAutumnType();
            frame.dispose();
         }
      });

      // 겨울정보 버튼
      JButton btnWiInfo = new JButton();
      frame.ButtonSet(btnWiInfo, info, infoon);
      
      btnWiInfo.setBounds(495, 475, 40, 40);
      frame.add(btnWiInfo);
      btnWiInfo.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame InfoWi = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            InfoWi.setTitle("winter Information");
            InfoWi.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon wi = new ImageIcon("image/info/겨울설명.png");
            JLabel wiinfo = new JLabel(wi);
            wiinfo.setBounds(0, 0, 550, 550);
            InfoWi.add(wiinfo);
            InfoWi.setVisible(true);
         }
      });
      
      // 겨울 버튼
      ImageIcon winter = new ImageIcon("image/frame/겨울.png");
      ImageIcon winteron = new ImageIcon("image/frame/겨울on.png");
      JButton btnWinter = new JButton();
      frame.ButtonSet(btnWinter, winter, winteron);

      btnWinter.setBounds(310, 465, 236, 236);
      frame.add(btnWinter);

      btnWinter.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameWinterType();
            frame.dispose();
         }
      });

      // back버튼
      JButton btnBack = new JButton();
      frame.goBack(btnBack);

      btnBack.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameStart();
            frame.dispose();
         }
      });

      // main버튼
      JButton btnMain = new JButton();
      frame.goMain(btnMain);

      // 배경효과 처리
      JLabel effect = new JLabel();
      frame.backEffect(effect);

      frame.setVisible(true);
   }

}