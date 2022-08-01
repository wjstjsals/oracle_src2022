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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Set.BaseSet;

public class FrameLogin extends JFrame {

	public FrameLogin() {

		BaseSet frame = new BaseSet();

		// 옷로고 이미지
		ImageIcon oflogo = new ImageIcon("image/frame/옷.png"); // 그림불러오기
		JLabel lblPCSR = new JLabel(oflogo); // 그림 붙이기
		lblPCSR.setSize(350, 350);
		lblPCSR.setLocation(125, 50);
		frame.add(lblPCSR);

		// 제목 이미지
		ImageIcon title = new ImageIcon("image/frame/제목.png"); // 그림불러오기
		ImageIcon titleon = new ImageIcon("image/frame/제목on.png");
		JButton titlePCSR = new JButton(title);
		frame.ButtonSet(titlePCSR, title, titleon);
		titlePCSR.setSize(400, 200);
		titlePCSR.setLocation(30, 500);
		frame.add(titlePCSR);

		// 라인 이미지
		ImageIcon line = new ImageIcon("image/frame/line.png"); // 그림불러오기
		JLabel lblLine = new JLabel(line); // 그림 붙이기
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

		Font f1 = new Font("Noto Sans KR Medium", Font.BOLD, 15);

		// id 글자
		ImageIcon id = new ImageIcon("image/frame/id.png");
		JLabel lbId = new JLabel(id);
		lbId.setBounds(100, 698, 40, 40);
		lbId.setFont(f1);
		frame.add(lbId);

		// id 입력창
		JTextField idBox = new JTextField();
		idBox.setBounds(150, 705, 180, 30);
		idBox.setFont(f1);
		frame.add(idBox);

		// pw 글자
		ImageIcon pw = new ImageIcon("image/frame/pw.png");
		JLabel lbPw = new JLabel(pw);
		lbPw.setBounds(99, 740, 40, 40);
		lbPw.setFont(f1);
		frame.add(lbPw);

		// pw 입력창
		JPasswordField pwBox = new JPasswordField();
		pwBox.setBounds(150, 745, 180, 30);
		pwBox.setFont(f1);
		frame.add(pwBox);

		// login 버튼
		ImageIcon login = new ImageIcon("image/frame/login.png");
		ImageIcon loginon = new ImageIcon("image/frame/loginon.png");
		JButton btnLogin = new JButton();
		frame.ButtonSet(btnLogin, login, loginon);
		btnLogin.setBounds(340, 703, 110, 75);
		frame.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (idBox.getText().equals("LED") && pwBox.getText().equals("123")) {
					JOptionPane.showMessageDialog(null, "환영합니다!");
					new FrameStart();
				} else {
					if (idBox.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "아이디를 입력해주세요.");
					} else {
						if (!idBox.getText().equals("LED")) {
							JOptionPane.showMessageDialog(null, "존재하지 않는 아이디입니다.");
						} else {
							if (pwBox.getText().equals("")) {
								JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요.");
							} else {
								JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
							}
						}
					}
				}
			}
		});

		// 배경효과 처리
		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);
	}
}