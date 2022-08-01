package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Set.BaseSet;
import Set.MyShop;

public class FrameStart extends JFrame {

	public FrameStart() {
		// BaseSet 객체 생성
		BaseSet frame = new BaseSet();

		// 옷로고 이미지
		ImageIcon imageLogo = new ImageIcon("image/frame/옷.png");
		JLabel lblImage = new JLabel(imageLogo);
		lblImage.setSize(350, 350);
		lblImage.setLocation(125, 50);
		frame.add(lblImage);

		// 제목 이미지 & 정보창
		ImageIcon title = new ImageIcon("image/frame/제목.png");
		ImageIcon titleon = new ImageIcon("image/frame/제목on.png");
		JButton titlePCSR = new JButton();
		frame.ButtonSet(titlePCSR, title, titleon);
		titlePCSR.setBounds(30, 500, 400, 200);
		frame.add(titlePCSR);
		titlePCSR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame InfoPc = new JFrame();
				Toolkit tk = Toolkit.getDefaultToolkit();

				InfoPc.setTitle("PersonalColor Information");
				InfoPc.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
						((int) tk.getScreenSize().getHeight()) / 2 - 275, 550, 550);
				ImageIcon pc = new ImageIcon("image/info/퍼컬설명.png");
				JLabel pcinfo = new JLabel(pc);
				pcinfo.setBounds(0, 0, 550, 550);
				InfoPc.add(pcinfo);
				InfoPc.setVisible(true);
			}
		});

		// 라인 이미지
		ImageIcon line = new ImageIcon("image/frame/line.png");
		JLabel lblLine = new JLabel(line);
		lblLine.setSize(600, 1);
		lblLine.setLocation(0, 480);
		frame.add(lblLine);

		// 팀 로고 이미지
		ImageIcon tName = new ImageIcon("image/frame/팀명.png");
		ImageIcon tNameon = new ImageIcon("image/frame/팀명on.png");
		JButton teamName = new JButton();
		frame.ButtonSet(teamName, tName, tNameon);
		teamName.setSize(90, 240);
		teamName.setLocation(470, 480);
		frame.add(teamName);

		// 상단의 chat버튼 설정
		ImageIcon chat = new ImageIcon("image/frame/chat.png");
		ImageIcon chaton = new ImageIcon("image/frame/chaton.png");
		JButton btnChat = new JButton();
		frame.ButtonSet(btnChat, chat, chaton);
		btnChat.setSize(75, 75);
		btnChat.setLocation(30, 20);
		frame.add(btnChat);
		
		btnChat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameChatClient();
			}
		});

		// 상단의 cart버튼 설정
		ImageIcon cart = new ImageIcon("image/frame/cart.png");
		ImageIcon carton = new ImageIcon("image/frame/carton.png");
		JButton btnCart = new JButton();
		frame.ButtonSet(btnCart, cart, carton);
		btnCart.setSize(75, 75);
		btnCart.setLocation(480, 20);
		frame.add(btnCart);

		btnCart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (MyShop.buylist.isEmpty()) {
					JOptionPane.showMessageDialog(null, "장바구니가 비어있습니다.");
				} else {
					new FrameCart();
					frame.dispose();
				}
			}
		});

		// 하단의 start버튼 설정
		ImageIcon start = new ImageIcon("image/frame/start.png");
		ImageIcon starton = new ImageIcon("image/frame/starton.png");
		JButton btnStart = new JButton();
		frame.ButtonSet(btnStart, start, starton);
		btnStart.setSize(350, 85);
		btnStart.setLocation(125, 700);
		frame.add(btnStart);

		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameSeason();
				frame.dispose();
			}
		});

		// 배경효과 처리
		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);

	}

}
