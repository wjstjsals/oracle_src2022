package Set;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameAutumnType;
import Frame.FrameSpringType;
import Frame.FrameStart;
import Frame.FrameSummerType;
import Frame.FrameWinterType;

public class BaseSet extends JFrame {

	JLabel lblImage;
	JButton lblLED;
	JButton lblTitle;

	public BaseSet() {

		// 해상도
		Toolkit tk = Toolkit.getDefaultToolkit();

		// 기본 JFrame 환경설정
		setTitle("PCSR");// 맨위에
		setLayout(null);// 자동배치
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, ((int) tk.getScreenSize().getHeight()) / 2 - 450,
				600, 900); // 실제 사이즈

		getContentPane().setBackground(new Color(226, 224, 222));

	}// 생성자

	public void backEffect(JLabel effect) {
		ImageIcon backEffect = new ImageIcon("image/frame/배경효과.png"); // 뒤에 회색
		effect = new JLabel(backEffect);
		effect.setBounds(0, 0, 600, 900);
		add(effect);
	}

	public void logoSet(JLabel lblImage, JButton lblLED, JButton lblTitle) {
		// 옷로고
		ImageIcon imageLogo = new ImageIcon("image/frame/로고옷.png");
		lblImage = new JLabel(imageLogo);
		lblImage.setBounds(30, 20, 70, 70);
		add(lblImage);

		// 팀로고
		ImageIcon teamLogo = new ImageIcon("image/frame/팀로고.png");
		ImageIcon teamLogoon = new ImageIcon("image/frame/팀로고on.png");
		lblLED = new JButton();
		ButtonSet(lblLED, teamLogo, teamLogoon);
		lblLED.setBounds(480, 20, 70, 80);
		add(lblLED);

		// 타이틀로고
		ImageIcon titleLogo = new ImageIcon("image/frame/타이틀로고.png");
		ImageIcon titleLogoon = new ImageIcon("image/frame/타이틀로고on.png");
		lblTitle = new JButton();
		ButtonSet(lblTitle, titleLogo, titleLogoon);
		lblTitle.setBounds(220, 780, 140, 60);
		add(lblTitle);
	}

	public void ButtonSet(JButton btn, ImageIcon stateIcon, ImageIcon overIcon) {
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setBorder(null);
		btn.setIcon(stateIcon);
		btn.setRolloverIcon(overIcon); // 마우스가져갔을때
		btn.setPressedIcon(overIcon); // 클릭했을때
	}

	public void goMain(JButton btnMain) {
		ImageIcon main = new ImageIcon("image/frame/main.png");
		ImageIcon mainon = new ImageIcon("image/frame/mainon.png");
		ButtonSet(btnMain, main, mainon);
		btnMain.setBounds(440, 740, 120, 60);
		add(btnMain);
		btnMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameStart(); // FrameStart 여기로 가라
				dispose();
			}
		});
	}

	public void goBack(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setBounds(30, 740, 120, 60);
		add(btnBack); // 내용을 만들어 놓은 가방으로 넣음
	}

	public void backSp(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setBounds(30, 740, 120, 60);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameSpringType();
				dispose();
			}
		});
	}

	public void backSu(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setBounds(30, 740, 120, 60);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameSummerType();
				dispose();
			}
		});
	}

	public void backAu(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setBounds(30, 740, 120, 60);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameAutumnType();
				dispose();
			}
		});
	}

	public void backWi(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setBounds(30, 740, 120, 60);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameWinterType();
				dispose();
			}
		});
	}

	@Override
	public int getDefaultCloseOperation() {
		// TODO Auto-generated method stub
		return super.getDefaultCloseOperation();
	}
}
