package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenAuDp;
import Frame.FrameGender.GenAuMt;
import Frame.FrameGender.GenAuWm;
import Set.BaseSet;

public class FrameAutumnType extends JFrame {
   public FrameAutumnType() {

      // BaseSet 객체 생성
      BaseSet frame = new BaseSet();

      // 가을타입 이미지
      ImageIcon autumn = new ImageIcon("image/frame/가을타입.png");
      JLabel lblAutumn = new JLabel(autumn);
      lblAutumn.setBounds(115,70,350,110);
      frame.add(lblAutumn);
      
      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton(); 
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);

      // mute 팔레트창
      ImageIcon info = new ImageIcon("image/info/팔레트.png");
      ImageIcon infoon = new ImageIcon("image/info/팔레트on.png");
      JButton auMutePlt = new JButton();
      frame.ButtonSet(auMutePlt, info, infoon);
      
      auMutePlt.setBounds(460, 250, 40, 40);
      frame.add(auMutePlt);
      auMutePlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame aumtPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            aumtPlt.setTitle("Autumn Mute Palette");
            aumtPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon aumt = new ImageIcon("image/info/갈뮤팔.png");
            JLabel mtauplt = new JLabel(aumt);
            mtauplt.setBounds(0, 150, 550, 550);
            aumtPlt.add(mtauplt);
            aumtPlt.setVisible(true);
         }
      });
      
      // mute 버튼
      ImageIcon mute = new ImageIcon("image/frame/뮤트.png");
      ImageIcon muteon = new ImageIcon("image/frame/뮤트on.png");
      JButton btnMute = new JButton();
      frame.ButtonSet(btnMute, mute, muteon);
      
      btnMute.setBounds(40,240,500, 120);
      frame.add(btnMute);
      
      btnMute.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenAuMt();
            frame.dispose();
         }
      });
      
      // warm 팔레트창
      JButton auWarmPlt = new JButton();
      frame.ButtonSet(auWarmPlt, info, infoon);
      
      auWarmPlt.setBounds(460, 420, 40, 40);
      frame.add(auWarmPlt);
      auWarmPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame auwmPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            auwmPlt.setTitle("Autumn Warm Palette");
            auwmPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon auwm = new ImageIcon("image/info/갈웜팔.png");
            JLabel wmauplt = new JLabel(auwm);
            wmauplt.setBounds(0, 150, 550, 550);
            auwmPlt.add(wmauplt);
            auwmPlt.setVisible(true);
         }
      });
      
      // warm 버튼
      ImageIcon warm = new ImageIcon("image/frame/웜.png");
      ImageIcon warmon = new ImageIcon("image/frame/웜on.png");
      JButton btnWarm = new JButton();
      frame.ButtonSet(btnWarm, warm, warmon);

      btnWarm.setBounds(40,410,500, 120);
      frame.add(btnWarm);
      
      btnWarm.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenAuWm();
            frame.dispose();
         }
      });
      
      // deep 팔레트창
      JButton auDeepPlt = new JButton();
      frame.ButtonSet(auDeepPlt, info, infoon);
      
      auDeepPlt.setBounds(460, 590, 40, 40);
      frame.add(auDeepPlt);
      auDeepPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame audpPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            audpPlt.setTitle("Autumn Deep Palette");
            audpPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon audp = new ImageIcon("image/info/갈딥팔.png");
            JLabel dpauplt = new JLabel(audp);
            dpauplt.setBounds(0, 150, 550, 550);
            audpPlt.add(dpauplt);
            audpPlt.setVisible(true);
         }
      });
      
      // deep 버튼
      ImageIcon deep = new ImageIcon("image/frame/딥.png");
      ImageIcon deepon = new ImageIcon("image/frame/딥on.png");
      JButton btnDeep = new JButton();
      frame.ButtonSet(btnDeep, deep, deepon);

      btnDeep.setBounds(40,580,500, 120);
      frame.add(btnDeep);
      
      btnDeep.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenAuDp();
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