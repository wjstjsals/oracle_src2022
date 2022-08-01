package Frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import Set.BaseSet;
import Set.MyShop;

public class FrameOrder extends JFrame {

	public FrameOrder() {
		BaseSet frame = new BaseSet();

		ImageIcon order = new ImageIcon("image/frame/ordertitle.png");
		JLabel lblOrder = new JLabel(order);
		lblOrder.setBounds(115, 70, 350, 85);
		frame.add(lblOrder);

		int total = 0;
		for (int i = 0; i < MyShop.buylist.size(); i++) {
			total += MyShop.buylist.get(i).getPrice();
		}

		// 폰트
		Font txtFont = (new Font("Noto Sans KR Medium", Font.PLAIN, 15));
		Font numFont = (new Font("Will&Grace", Font.PLAIN, 15));

		// 주문내역
		JPanel orderList = new JPanel();
		orderList.setLayout(new GridLayout(1, 5));
		orderList.setBounds(30, 190, 530, 120);
		orderList.setBackground(new Color(226, 224, 222));
		orderList.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "주문내역", TitledBorder.LEADING,
				TitledBorder.TOP, new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000)));
		frame.add(orderList);

		String orderInfo = "";
		for (int i = 0; i < MyShop.buylist.size(); i++) {
			switch (i) {
			case 0:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 1:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 2:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 3:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			case 4:
				orderInfo += "\n- " + MyShop.buylist.get(i).getName();
				break;
			}
		}

		TextArea MyShopping = new TextArea("주문상품명 :" + orderInfo + "\n\n결제금액 : " + total + ",000원", 0, 0,
				TextArea.SCROLLBARS_VERTICAL_ONLY);
		MyShopping.setFont(txtFont);
		orderList.add(MyShopping);

		// 배송지 입력
		JPanel deliver = new JPanel(); // 배송지 패널 생성
		deliver.setLayout(new GridLayout(6, 3, 10, 10));
		deliver.setBounds(30, 338, 530, 230); // 가로넓이
		deliver.setBackground(new Color(226, 224, 222));
		deliver.setBorder(new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), // 테두리없음
				"배달정보", // 내용
				TitledBorder.LEADING, // 텍스트 정렬방식 : 양쪽정렬
				TitledBorder.TOP, // 텍스트 표시 위치 : 상단
				new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000))); // 색상

		// 성함
		TextField name = new TextField("", 30);
		name.setFont(txtFont);
		Label cName = new Label("주문자 성함");
		cName.setFont(txtFont);
		deliver.add(cName);
		deliver.add(name);

		// 주소
		TextField adress = new TextField("", 30);
		adress.setFont(txtFont);
		Label cAddress = new Label("주소");
		cAddress.setFont(txtFont);
		deliver.add(cAddress);
		deliver.add(adress);

		// 전화번호
		TextField phone = new TextField("", 30);
		phone.setFont(txtFont);
		Label cPhone = new Label("전화번호");
		cPhone.setFont(txtFont);
		deliver.add(cPhone);
		deliver.add(phone);

		// 배송시 요청사항
		TextField demand = new TextField("배송전 연락바랍니다.", 30);
		demand.setFont(txtFont);
		Label cDemand = new Label("배송시 요청사항");
		cDemand.setFont(txtFont);
		deliver.add(cDemand);
		deliver.add(demand);

		// 결제하기 버튼
		ImageIcon pay = new ImageIcon("image/frame/pay.png");
		ImageIcon payon = new ImageIcon("image/frame/payon.png");
		JButton btnPay = new JButton();
		frame.ButtonSet(btnPay, pay, payon);
		btnPay.setBounds(250, 670, 80, 80);
		frame.add(btnPay);

		btnPay.setVisible(false);

		btnPay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "주문이 완료되었습니다.");
				MyShop.clear();
				frame.dispose();
				new FrameStart();
			}
		});

		// 완료
		JButton btnInput = new JButton("입력");
		// btn.setBackground(Color.ORANGE);
		btnInput.setBackground(new Color(207, 207, 207)); // 버튼 바탕색
		btnInput.setForeground(Color.BLACK); // 글자색
		btnInput.setBorderPainted(false); // 버튼 테두리 비활성화
		// btn.setOpaque(true); //불투명
		frame.add(btnInput);
		btnInput.setBounds(200, 512, 180, 40);
		btnInput.setEnabled(false);

		frame.add(deliver);

		btnInput.addActionListener(new ActionListener() {
			// "성함 : " + name.getText() + "\n\n" +
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null,
						name.getText() + "님의 배송지 입력이 완료되었습니다.  \n\n" + "주소 : " + adress.getText() + "\n\n" + "전화번호 : "
								+ phone.getText() + "\n\n" + "요청사항 : " + demand.getText());
				btnPay.setVisible(true);
			}
		});

		// 완료 버튼 활성화
		adress.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) { // 글자를 칠때 입력할 수 있게 풀어줌

				if (btnInput.getText().equals("")) { // 내용이 없으면
					btnInput.setEnabled(false); // 버튼 잠금

				}
			}
		});
		demand.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void focusGained(FocusEvent e) {
				if (demand.getText().equals("배송전 연락바랍니다.")) {
					demand.setText("");
				}
			}
		});

		// 결제수단
		JPanel payment = new JPanel();
		payment.setLayout(new FlowLayout());
		payment.setBounds(30, 590, 530, 70);
		payment.setBackground(new Color(226, 224, 222));
		payment.setBorder(new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), // 테두리없음
				"결제수단", // 내용
				TitledBorder.LEADING, // 텍스트 정렬방식:양쪽정렬
				TitledBorder.TOP, // 텍스트 표시 위치 : 상단
				new Font("Noto Sans KR Medium", Font.BOLD, 20), new Color(000, 000, 000)));
		add(payment);

		new Label("결제수단").setFont(txtFont);
		CheckboxGroup group = new CheckboxGroup();
		Checkbox card = new Checkbox("카드", group, true);
		Checkbox deposit = new Checkbox("무통장입금", group, false);
		Checkbox kakaopay = new Checkbox("kakaoPay", group, false);

		payment.add(card);
		payment.add(deposit);
		payment.add(kakaopay);
		frame.add(payment);

		phone.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) { // 글자를 칠때 입력할 수 있게 풀어줌

				if (btnInput.getText().equals("")) { // 내용이 없으면
					btnInput.setEnabled(false); // 버튼 잠금

				} else {
					btnInput.setEnabled(true);// 그렇지 않으면 버튼 활성화
				}
			}
		});

		JLabel lblImage = new JLabel();
		JButton lblLED = new JButton();
		JButton lblTitle = new JButton();
		frame.logoSet(lblImage, lblLED, lblTitle);

		// back버튼
		JButton btnBack = new JButton();
		frame.goBack(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameCart();
				frame.dispose();
			}
		});

		// main버튼
		JButton btnMain = new JButton();
		frame.goMain(btnMain);

		JLabel effect = new JLabel();
		frame.backEffect(effect);

		frame.setVisible(true);
	}// 생성자
}// 클래스