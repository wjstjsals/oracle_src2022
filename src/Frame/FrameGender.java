package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameProductAutumnF.ProAuDpF;
import Frame.FrameProductAutumnF.ProAuMtF;
import Frame.FrameProductAutumnF.ProAuWmF;
import Frame.FrameProductAutumnM.ProAuDpM;
import Frame.FrameProductAutumnM.ProAuMtM;
import Frame.FrameProductAutumnM.ProAuWmM;
import Frame.FrameProductSpringF.ProSpBrF;
import Frame.FrameProductSpringF.ProSpLtF;
import Frame.FrameProductSpringF.ProSpWmF;
import Frame.FrameProductSpringM.ProSpBrM;
import Frame.FrameProductSpringM.ProSpLtM;
import Frame.FrameProductSpringM.ProSpWmM;
import Frame.FrameProductSummerF.ProSuCoF;
import Frame.FrameProductSummerF.ProSuLtF;
import Frame.FrameProductSummerF.ProSuMtF;
import Frame.FrameProductSummerM.ProSuCoM;
import Frame.FrameProductSummerM.ProSuLtM;
import Frame.FrameProductSummerM.ProSuMtM;
import Frame.FrameProductWinterF.ProWiBrF;
import Frame.FrameProductWinterF.ProWiCoF;
import Frame.FrameProductWinterF.ProWiDpF;
import Frame.FrameProductWinterM.ProWiBrM;
import Frame.FrameProductWinterM.ProWiCoM;
import Frame.FrameProductWinterM.ProWiDpM;
import Set.BaseSet;
import Set.GenderSet;

public class FrameGender extends JFrame {
   
   public static class GenSpBr extends JFrame{
      
      public GenSpBr() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpBrM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpBrF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSp(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenSpWm extends JFrame{
      
      public GenSpWm() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpWmM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpWmF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSp(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenSpLt extends JFrame{
      
      public GenSpLt() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpLtM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSpLtF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSp(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenSuLt extends JFrame{
      
      public GenSuLt() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuLtM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuLtF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenSuCo extends JFrame{
      
      public GenSuCo() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuCoM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuCoF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenSuMt extends JFrame{
      
      public GenSuMt() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuMtM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProSuMtF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backSu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenAuMt extends JFrame{
      
      public GenAuMt() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuMtM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuMtF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backAu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenAuWm extends JFrame{
      
      public GenAuWm() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuWmM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuWmF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backAu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenAuDp extends JFrame{
      
      public GenAuDp() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuDpM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProAuDpF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backAu(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenWiDp extends JFrame{
      
      public GenWiDp() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiDpM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiDpF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backWi(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenWiCo extends JFrame{
      
      public GenWiCo() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiCoM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiCoF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backWi(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
   public static class GenWiBr extends JFrame{
      
      public GenWiBr() {
         BaseSet frame=new BaseSet();
         GenderSet set=new GenderSet();
         
         frame.add(set.getLblGender());
         JLabel lblImage = new JLabel();
         JButton lblLED = new JButton(); 
         JButton lblTitle = new JButton();
         frame.logoSet(lblImage, lblLED, lblTitle);
         frame.add(set.getBtnMale());
         frame.add(set.getBtnFemale());
         
         set.getBtnMale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiBrM();
               frame.dispose();
            }
         });
         set.getBtnFemale().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new ProWiBrF();
               frame.dispose();
            }
         });
         JButton btnBack = new JButton();
         JButton btnMain = new JButton();
         frame.backWi(btnBack);
         frame.goMain(btnMain);
         
         JLabel effect = new JLabel();
         frame.backEffect(effect);
         
         frame.setVisible(true);
      }
   }
   
}