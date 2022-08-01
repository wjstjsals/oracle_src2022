package Set;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ProductSet {
	JLabel lblSet1;
	JLabel lblSet2;
	JLabel lblSet3;
	JButton btnAdd1;
	JButton btnAdd2;
	JButton btnAdd3;
	JButton btnShow1;
	JButton btnShow2;
	JButton btnShow3;

	public ProductSet() {
		BaseSet frame = new BaseSet();
		
		// set1
		ImageIcon set1 = new ImageIcon("image/product/set1.png");
		lblSet1 = new JLabel(set1);
		lblSet1.setBounds(40, 240, 500, 120);

		// set2
		ImageIcon set2 = new ImageIcon("image/product/set2.png");
		lblSet2 = new JLabel(set2);
		lblSet2.setBounds(40, 410, 500, 120);

		// set3
		ImageIcon set3 = new ImageIcon("image/product/set3.png");
		lblSet3 = new JLabel(set3);
		lblSet3.setBounds(40, 580, 500, 120);
		
		// show1
		ImageIcon show = new ImageIcon("image/product/show.png");
		ImageIcon showon = new ImageIcon("image/product/showon.png");
		btnShow1 = new JButton();
		btnShow1.setBounds(310, 265, 70, 70);
		frame.ButtonSet(btnShow1, show, showon);
		
		// show2
		btnShow2 = new JButton();
		btnShow2.setBounds(310, 435, 70, 70);
		frame.ButtonSet(btnShow2, show, showon);
		
		// show3
		btnShow3 = new JButton();
		btnShow3.setBounds(310, 605, 70, 70);
		frame.ButtonSet(btnShow3, show, showon);
		
		// add1
		ImageIcon add = new ImageIcon("image/product/add.png");
		ImageIcon addon = new ImageIcon("image/product/addon.png");
		btnAdd1 = new JButton();
		btnAdd1.setBounds(420, 265, 70, 70);
		frame.ButtonSet(btnAdd1, add, addon);
		
		// add2
		btnAdd2 = new JButton();
		btnAdd2.setBounds(420, 435, 70, 70);
		frame.ButtonSet(btnAdd2, add, addon);
		
		// add3
		btnAdd3 = new JButton();
		btnAdd3.setBounds(420, 605, 70, 70);
		frame.ButtonSet(btnAdd3, add, addon);
	}
	
	public void newFrame(JFrame newFrame) {
		Toolkit tk = Toolkit.getDefaultToolkit();

		newFrame.setTitle(null);
		newFrame.setLayout(null);
		newFrame.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
				((int) tk.getScreenSize().getHeight()) / 2 - 350, 
				550, 700);
				
		newFrame.getContentPane().setBackground(new Color(226, 224, 222));
	}

	public JLabel getLblSet1() {
		return lblSet1;
	}

	public JLabel getLblSet2() {
		return lblSet2;
	}

	public JLabel getLblSet3() {
		return lblSet3;
	}

	public JButton getBtnAdd1() {
		return btnAdd1;
	}

	public JButton getBtnAdd2() {
		return btnAdd2;
	}

	public JButton getBtnAdd3() {
		return btnAdd3;
	}

	public JButton getBtnShow1() {
		return btnShow1;
	}

	public JButton getBtnShow2() {
		return btnShow2;
	}

	public JButton getBtnShow3() {
		return btnShow3;
	}

}
