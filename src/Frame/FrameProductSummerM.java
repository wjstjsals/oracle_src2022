package Frame;

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
import Set.MyShop;
import Set.ProductSet;
import Set.Shop;

public class FrameProductSummerM extends JFrame {

	public static class ProSuLtM extends JFrame {
		public ProSuLtM() {
			// 객체 생성
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// 로고들
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// 상단 타이틀
			ImageIcon sult = new ImageIcon("image/product/여라.png");
			JLabel suLight = new JLabel(sult);
			suLight.setBounds(115, 70, 350, 110);
			frame.add(suLight);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/m여라1.png");
					JLabel ltSet1 = new JLabel(set1);
					ltSet1.setBounds(25, 25, 485, 485);
					newF.add(ltSet1);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/125.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/m여라2.png");
					JLabel ltSet2 = new JLabel(set2);
					ltSet2.setBounds(25, 25, 485, 485);
					newF.add(ltSet2);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/171.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/m여라3.png");
					JLabel ltSet3 = new JLabel(set3);
					ltSet3.setBounds(25, 25, 485, 485);
					newF.add(ltSet3);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/134.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sultm1 = new Shop("Spring Light Set1(M)", 125,
							new JLabel(new ImageIcon("image/product/mcart/m여라1.png")));
					MyShop.pCount++;
					MyShop.add(sultm1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sultm2 = new Shop("Spring Light Set2(M)", 171,
							new JLabel(new ImageIcon("image/product/mcart/m여라2.png")));
					MyShop.pCount++;
					MyShop.add(sultm2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sultm3 = new Shop("Spring Light Set3(M)", 134,
							new JLabel(new ImageIcon("image/product/mcart/m여라3.png")));
					MyShop.pCount++;
					MyShop.add(sultm3);
				}
			});
			// back버튼
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSuLt();
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

	public static class ProSuCoM extends JFrame {
		public ProSuCoM() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// 로고들
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// 상단 타이틀
			ImageIcon suco = new ImageIcon("image/product/여쿨.png");
			JLabel suCool = new JLabel(suco);
			suCool.setBounds(115, 70, 350, 110);
			frame.add(suCool);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/m여쿨1.png");
					JLabel coSet1 = new JLabel(set1);
					coSet1.setBounds(25, 25, 485, 485);
					newF.add(coSet1);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/116.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/m여쿨2.png");
					JLabel coSet2 = new JLabel(set2);
					coSet2.setBounds(25, 25, 485, 485);
					newF.add(coSet2);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/93.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/m여쿨3.png");
					JLabel coSet3 = new JLabel(set3);
					coSet3.setBounds(25, 25, 485, 485);
					newF.add(coSet3);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/147.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sucom1 = new Shop("Spring Cool Set1(M)", 116,
							new JLabel(new ImageIcon("image/product/mcart/m여쿨1.png")));
					MyShop.pCount++;
					MyShop.add(sucom1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sucom2 = new Shop("Spring Cool Set2(M)", 93,
							new JLabel(new ImageIcon("image/product/mcart/m여쿨2.png")));
					MyShop.pCount++;
					MyShop.add(sucom2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sucom3 = new Shop("Spring Cool Set3(M)", 147,
							new JLabel(new ImageIcon("image/product/mcart/m여쿨3.png")));
					MyShop.pCount++;
					MyShop.add(sucom3);
				}
			});
			// back
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSuCo();
					frame.dispose();
				}
			});
			// main
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// 배경효과
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}// 생성자 end
	}// 내부 class end

	public static class ProSuMtM extends JFrame {
		public ProSuMtM() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// 로고들
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// 상단 타이틀
			ImageIcon sumt = new ImageIcon("image/product/여뮤.png");
			JLabel suMute = new JLabel(sumt);
			suMute.setBounds(115, 70, 350, 110);
			frame.add(suMute);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/m여뮤1.png");
					JLabel mtSet1 = new JLabel(set1);
					mtSet1.setBounds(25, 25, 485, 485);
					newF.add(mtSet1);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/125.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/m여뮤2.png");
					JLabel mtSet2 = new JLabel(set2);
					mtSet2.setBounds(25, 25, 485, 485);
					newF.add(mtSet2);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/147.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/m여뮤3.png");
					JLabel mtSet3 = new JLabel(set3);
					mtSet3.setBounds(25, 25, 485, 485);
					newF.add(mtSet3);
					// 가격 이미지
					ImageIcon price = new ImageIcon("image/product/price/108.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sumtm1 = new Shop("Spring Mute Set1(M)", 125,
							new JLabel(new ImageIcon("image/product/mcart/m여뮤1.png")));
					MyShop.pCount++;
					MyShop.add(sumtm1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sumtm2 = new Shop("Spring Mute Set2(M)", 147,
							new JLabel(new ImageIcon("image/product/mcart/m여뮤2.png")));
					MyShop.pCount++;
					MyShop.add(sumtm2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop sumtm3 = new Shop("Spring Mute Set3(M)", 108,
							new JLabel(new ImageIcon("image/product/mcart/m여뮤3.png")));
					MyShop.pCount++;
					MyShop.add(sumtm3);
				}
			});
			// back
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSuMt();
					frame.dispose();
				}
			});
			// main
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// 배경효과
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}
}