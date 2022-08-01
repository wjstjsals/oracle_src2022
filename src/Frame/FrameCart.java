package Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;

import Set.BaseSet;
import Set.MyShop;

public class FrameCart extends JFrame {

	public FrameCart() {
		BaseSet frame = new BaseSet();

		ImageIcon cart = new ImageIcon("image/frame/carttitle.png");
		JLabel lblCart = new JLabel(cart);
		lblCart.setBounds(115, 70, 350, 85);
		frame.add(lblCart);

		// order버튼
		ImageIcon order = new ImageIcon("image/frame/order.png");
		ImageIcon orderon = new ImageIcon("image/frame/orderon.png");
		JButton btnOrder = new JButton();
		frame.ButtonSet(btnOrder, order, orderon);
		btnOrder.setBounds(440, 740, 120, 60);
		frame.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameOrder();
				frame.dispose();
			}
		});

		if (MyShop.buylist.isEmpty()) {
			JOptionPane.showMessageDialog(null, "장바구니가 비어있습니다.");
			btnOrder.setVisible(false);
		}

		// 폰트
		Font txtFont = (new Font("Noto Serif KR Medium", Font.BOLD, 17));
		Font numFont = (new Font("Will&Grace", Font.BOLD, 17));

		JPanel basket = new JPanel();

		basket.setBounds(30, 190, 530, 520);
		basket.setBackground(Color.lightGray);
		basket.setBorder(new TitledBorder(null, null, TitledBorder.LEADING, TitledBorder.TOP,
				new Font("Noto Sans KR Medium", Font.BOLD, 25), new Color(000, 000, 000)));
		frame.add(basket);
		basket.setLayout(null);

		// 삭제, 항목, 가격
		JLabel column1 = new JLabel("항목");
		column1.setFont(txtFont);
		column1.setBounds(130, 10, 80, 50);
		basket.add(column1);

		JLabel column2 = new JLabel("가격");
		column2.setFont(txtFont);
		column2.setBounds(330, 10, 80, 50);
		basket.add(column2);

		JLabel column3 = new JLabel("삭제");
		column3.setFont(txtFont);
		column3.setBounds(450, 10, 80, 50);
		basket.add(column3);

		JLabel column4 = new JLabel("합계금액 : ");
		column4.setFont(txtFont);
		column4.setBounds(300, 465, 200, 50);
		basket.add(column4);

		// 합계금액
		int sum = 0;
		for (int i = 0; i < MyShop.buylist.size(); i++) {
			sum += MyShop.buylist.get(i).getPrice();
		}
		String total = sum + ",000";
		JLabel lblTotal = new JLabel(total);
		lblTotal.setBounds(400, 460, 120, 60);
		lblTotal.setFont(new Font("Will&Grace", Font.BOLD, 22));
		basket.add(lblTotal);
		if (MyShop.buylist.isEmpty()) {
			lblTotal.setVisible(false);
		}

		// 라인만들기
		ImageIcon Line1 = new ImageIcon("image/frame/line.png");
		JLabel lblLine1 = new JLabel(Line1);
		lblLine1.setBounds(0, 60, 530, 1);
		basket.add(lblLine1);

		//
		ImageIcon delete = new ImageIcon("image/frame/delete.png");
		ImageIcon deleteon = new ImageIcon("image/frame/deleteon.png");

		// 장바구니 리스트 구현
		if (!MyShop.buylist.isEmpty()) {
			for (int i = 0; i < MyShop.buylist.size(); i++) {
				switch (i) {
				case 0:
					JLabel proImage1 = MyShop.buylist.get(0).getImage();
					proImage1.setBounds(25, 75, 40, 40);
					basket.add(proImage1);

					String strProName1 = MyShop.buylist.get(0).getName();
					JLabel proName1 = new JLabel(strProName1);
					proName1.setBounds(85, 5, 500, 180);
					proName1.setFont(txtFont);
					basket.add(proName1);

					String strProPrice1 = MyShop.buylist.get(0).getPrice() + ",000";
					JLabel proPrice1 = new JLabel(strProPrice1);
					proPrice1.setBounds(320, 5, 500, 180);
					proPrice1.setFont(numFont);
					basket.add(proPrice1);

					JButton btnDlt1 = new JButton();
					frame.ButtonSet(btnDlt1, delete, deleteon);
					btnDlt1.setBounds(450, 80, 35, 35);
					basket.add(btnDlt1);
					btnDlt1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "장바구니에서 삭제했습니다.");
							MyShop.buylist.remove(0);
							MyShop.pCount--;
							new FrameCart();
							frame.dispose();
						}
					});
					break;
				case 1:
					JLabel lblLine2 = new JLabel(Line1);
					lblLine2.setBounds(0, 135, 530, 1);
					basket.add(lblLine2);

					JLabel proImage2 = MyShop.buylist.get(1).getImage();
					proImage2.setBounds(25, 150, 40, 40);
					basket.add(proImage2);

					String strProName2 = MyShop.buylist.get(1).getName();
					JLabel proName2 = new JLabel(strProName2);
					proName2.setBounds(85, 80, 500, 180);
					proName2.setFont(txtFont);
					basket.add(proName2);

					String strProPrice2 = MyShop.buylist.get(1).getPrice() + ",000";
					JLabel proPrice2 = new JLabel(strProPrice2);
					proPrice2.setBounds(320, 80, 500, 180);
					proPrice2.setFont(numFont);
					basket.add(proPrice2);

					JButton btnDlt2 = new JButton();
					frame.ButtonSet(btnDlt2, delete, deleteon);
					btnDlt2.setBounds(450, 155, 35, 35);
					basket.add(btnDlt2);
					btnDlt2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "장바구니에서 삭제했습니다.");
							MyShop.buylist.remove(1);
							MyShop.pCount--;
							new FrameCart();
							frame.dispose();
						}
					});
					break;

				case 2:
					JLabel lblLine3 = new JLabel(Line1);
					lblLine3.setBounds(0, 210, 530, 1);
					basket.add(lblLine3);

					JLabel proImage3 = MyShop.buylist.get(2).getImage();
					proImage3.setBounds(25, 225, 40, 40);
					basket.add(proImage3);

					String strProName3 = MyShop.buylist.get(2).getName();
					JLabel proName3 = new JLabel(strProName3);
					proName3.setBounds(85, 155, 500, 180);
					proName3.setFont(txtFont);
					basket.add(proName3);

					String strProPrice3 = MyShop.buylist.get(2).getPrice() + ",000";
					JLabel proPrice3 = new JLabel(strProPrice3);
					proPrice3.setBounds(320, 155, 500, 180);
					proPrice3.setFont(numFont);
					basket.add(proPrice3);

					JButton btnDlt3 = new JButton();
					frame.ButtonSet(btnDlt3, delete, deleteon);
					btnDlt3.setBounds(450, 230, 35, 35);
					basket.add(btnDlt3);
					btnDlt3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "장바구니에서 삭제했습니다.");
							MyShop.buylist.remove(2);
							MyShop.pCount--;
							new FrameCart();
							frame.dispose();
						}
					});
					break;

				case 3:
					JLabel lblLine4 = new JLabel(Line1);
					lblLine4.setBounds(0, 285, 530, 1);
					basket.add(lblLine4);

					JLabel proImage4 = MyShop.buylist.get(3).getImage();
					proImage4.setBounds(25, 300, 40, 40);
					basket.add(proImage4);

					String strProName4 = MyShop.buylist.get(3).getName();
					JLabel proName4 = new JLabel(strProName4);
					proName4.setBounds(85, 230, 500, 180);
					proName4.setFont(txtFont);
					basket.add(proName4);

					String strProPrice4 = MyShop.buylist.get(3).getPrice() + ",000";
					JLabel proPrice4 = new JLabel(strProPrice4);
					proPrice4.setBounds(320, 230, 500, 180);
					proPrice4.setFont(numFont);
					basket.add(proPrice4);

					JButton btnDlt4 = new JButton();
					frame.ButtonSet(btnDlt4, delete, deleteon);
					btnDlt4.setBounds(450, 305, 35, 35);
					basket.add(btnDlt4);
					btnDlt4.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "장바구니에서 삭제했습니다.");
							MyShop.buylist.remove(3);
							MyShop.pCount--;
							new FrameCart();
							frame.dispose();
						}
					});
					break;

				case 4:
					JLabel lblLine5 = new JLabel(Line1);
					lblLine5.setBounds(0, 360, 530, 1);
					basket.add(lblLine5);

					JLabel proImage5 = MyShop.buylist.get(4).getImage();
					proImage5.setBounds(25, 375, 40, 40);
					basket.add(proImage5);

					String strProName5 = MyShop.buylist.get(4).getName();
					JLabel proName5 = new JLabel(strProName5);
					proName5.setBounds(85, 305, 500, 180);
					proName5.setFont(txtFont);
					basket.add(proName5);

					String strProPrice5 = MyShop.buylist.get(4).getPrice() + ",000";
					JLabel proPrice5 = new JLabel(strProPrice5);
					proPrice5.setBounds(320, 305, 500, 180);
					proPrice5.setFont(numFont);
					basket.add(proPrice5);

					JButton btnDlt5 = new JButton();
					frame.ButtonSet(btnDlt5, delete, deleteon);
					btnDlt5.setBounds(450, 380, 35, 35);
					basket.add(btnDlt5);
					btnDlt5.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							JOptionPane.showMessageDialog(null, "장바구니에서 삭제했습니다.");
							MyShop.buylist.remove(4);
							MyShop.pCount--;
							new FrameCart();
							frame.dispose();
						}
					});
					break;
				}
			}
		}

		// 로고들
		JLabel lblImage = new JLabel();
		JButton lblLED = new JButton();
		JButton lblTitle = new JButton();
		frame.logoSet(lblImage, lblLED, lblTitle);

		// main버튼
		ImageIcon main = new ImageIcon("image/frame/main.png");
		ImageIcon mainon = new ImageIcon("image/frame/mainon.png");
		JButton btnMain = new JButton();
		frame.ButtonSet(btnMain, main, mainon);
		btnMain.setBounds(30, 740, 120, 60);
		frame.add(btnMain);
		btnMain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameStart();
				frame.dispose();
			}
		});

		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);
	}// 생성자
}// class