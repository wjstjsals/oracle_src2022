package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenSuCo;
import Frame.FrameGender.GenSuLt;
import Frame.FrameGender.GenSuMt;
import Set.BaseSet;

public class FrameSummerType extends JFrame{
   public FrameSummerType() {
      
      // BaseSet 객체 생성
      BaseSet frame = new BaseSet();
      
      // 여름타입 이미지
      ImageIcon summer = new ImageIcon("image/frame/여름타입.png");
      JLabel lblSummer = new JLabel(summer);
      lblSummer.setBounds(115, 70, 350, 110);
      frame.add(lblSummer);

      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton(); 
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);

      // light 팔레트창
      ImageIcon info = new ImageIcon("image/info/팔레트.png");
      ImageIcon infoon = new ImageIcon("image/info/팔레트on.png");
      JButton suLightPlt = new JButton();
      frame.ButtonSet(suLightPlt, info, infoon);
      
      suLightPlt.setBounds(460, 250, 40, 40);
      frame.add(suLightPlt);
      suLightPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame sultPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            sultPlt.setTitle("Summer Light Palette");
            sultPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon sult = new ImageIcon("image/info/여라팔.png");
            JLabel ltsuplt = new JLabel(sult);
            ltsuplt.setBounds(0, 150, 550, 550);
            sultPlt.add(ltsuplt);
            sultPlt.setVisible(true);
         }
      });
      
      // light 버튼
      ImageIcon light = new ImageIcon("image/frame/라이트.png");
      ImageIcon lighton = new ImageIcon("image/frame/라이트on.png");
      JButton btnLight = new JButton();
      frame.ButtonSet(btnLight, light, lighton);

      btnLight.setBounds(40, 240, 500, 120);
      frame.add(btnLight);
      
      btnLight.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSuLt();
            frame.dispose();
         }
      });
      
      // cool 팔레트창
      JButton suCoolPlt = new JButton();
      frame.ButtonSet(suCoolPlt, info, infoon);
      
      suCoolPlt.setBounds(460, 420, 40, 40);
      frame.add(suCoolPlt);
      suCoolPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame sucoPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            sucoPlt.setTitle("Summer cool Palette");
            sucoPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon suco = new ImageIcon("image/info/여쿨팔.png");
            JLabel cosuplt = new JLabel(suco);
            cosuplt.setBounds(0, 150, 550, 550);
            sucoPlt.add(cosuplt);
            sucoPlt.setVisible(true);
         }
      });
      
      // cool 버튼
      ImageIcon cool = new ImageIcon("image/frame/쿨.png");
      ImageIcon coolon = new ImageIcon("image/frame/쿨on.png");
      JButton btnCool = new JButton();
      frame.ButtonSet(btnCool, cool, coolon);

      btnCool.setBounds(40, 410, 500, 120);
      frame.add(btnCool);
      
      btnCool.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSuCo();
            frame.dispose();
         }
      });
      
      // mute 팔레트창
      JButton suMutePlt = new JButton();
      frame.ButtonSet(suMutePlt, info, infoon);
      
      suMutePlt.setBounds(460, 590, 40, 40);
      frame.add(suMutePlt);
      suMutePlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame sumtPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            sumtPlt.setTitle("Summer Mute Palette");
            sumtPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon sumt = new ImageIcon("image/info/여뮤팔.png");
            JLabel mtsuplt = new JLabel(sumt);
            mtsuplt.setBounds(0, 150, 550, 550);
            sumtPlt.add(mtsuplt);
            sumtPlt.setVisible(true);
         }
      });
      
      // mute 버튼
      ImageIcon mute = new ImageIcon("image/frame/뮤트.png");
      ImageIcon muteon = new ImageIcon("image/frame/뮤트on.png");
      JButton btnMute = new JButton();
      frame.ButtonSet(btnMute, mute, muteon);

      btnMute.setBounds(40, 580, 500, 120);
      frame.add(btnMute);
      
      btnMute.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenSuMt();
            frame.dispose();
         }
      });
      
      
      // back 버튼
      JButton btnBack = new JButton();
      frame.goBack(btnBack);

      btnBack.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameSeason();
            frame.dispose();
         }
      });
      
      // main 버튼
      JButton btnMain = new JButton();
      frame.goMain(btnMain);
      
      // 배경효과 처리
      JLabel effect = new JLabel();
      frame.backEffect(effect);
      
      // 세팅
      frame.setVisible(true);
      
   }
}