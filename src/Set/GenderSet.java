package Set;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GenderSet extends JFrame {
	JButton btnMale;
	JButton btnFemale;
	JLabel lblGender;
	JLabel lblImage;
	JLabel lblLED;
	JLabel lblTitle;

	public GenderSet() {
		BaseSet frame = new BaseSet();

		// 젠더 이미지
		ImageIcon gender = new ImageIcon("image/frame/gender.png");
		lblGender = new JLabel(gender);
		lblGender.setBounds(115, 70, 350, 85);

		// 남자 버튼
		ImageIcon male = new ImageIcon("image/frame/male.png");
		ImageIcon maleon = new ImageIcon("image/frame/maleon.png");
		btnMale = new JButton();
		frame.ButtonSet(btnMale, male, maleon);
		btnMale.setBounds(30, 180, 260, 520);

		// 여자 버튼
		ImageIcon female = new ImageIcon("image/frame/female.png");
		ImageIcon femaleon = new ImageIcon("image/frame/femaleon.png");
		btnFemale = new JButton();
		frame.ButtonSet(btnFemale, female, femaleon);
		btnFemale.setBounds(295, 180, 260, 520);

	}

	public JLabel getLblGender() {
		return lblGender;
	}

	public JLabel getLblImage() {
		return lblImage;
	}

	public JLabel getLblLED() {
		return lblLED;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public JButton getBtnMale() {
		return btnMale;
	}

	public JButton getBtnFemale() {
		return btnFemale;
	}
}