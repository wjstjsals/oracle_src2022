package Set;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class MyShop {

	public static int pCount;

	private static MyShop instance;

	public static ArrayList<Shop> buylist = new ArrayList<>();

	public static MyShop getMyShop() {
		if (instance == null) {
			instance = new MyShop();
		}
		return instance;
	}

	public static void add(Shop s) {

		if (pCount > 5) {
			JOptionPane.showMessageDialog(null, "장바구니 최대 상품수량을 초과했습니다.");
			pCount--;
		} else {
			if (buylist.size() == 0) {
				buylist.add(s);
				JOptionPane.showMessageDialog(null, s.getName() + " 을(를) 장바구니에 담았습니다.");
			} else if(buylist.size() == 1){
				if (s.name.equals(buylist.get(0).getName())) {
					JOptionPane.showMessageDialog(null, "이미 장바구니에 있는 상품입니다.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " 을(를) 장바구니에 담았습니다.");
					}
			} else if(buylist.size() == 2) {
				if (s.name.equals(buylist.get(0).getName()) || s.name.equals(buylist.get(1).getName())) {
					JOptionPane.showMessageDialog(null, "이미 장바구니에 있는 상품입니다.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " 을(를) 장바구니에 담았습니다.");
				}
			} else if(buylist.size() == 3) {
				if (s.name.equals(buylist.get(0).getName()) || s.name.equals(buylist.get(1).getName())
						|| s.name.equals(buylist.get(2).getName())) {
					JOptionPane.showMessageDialog(null, "이미 장바구니에 있는 상품입니다.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " 을(를) 장바구니에 담았습니다.");
				}
			} else if(buylist.size() == 4) {
				if (s.name.equals(buylist.get(1).getName()) || s.name.equals(buylist.get(1).getName())
						|| s.name.equals(buylist.get(2).getName()) || s.name.equals(buylist.get(3).getName())) {
					JOptionPane.showMessageDialog(null, "이미 장바구니에 있는 상품입니다.");
					pCount--;
				} else {
					buylist.add(s);
					JOptionPane.showMessageDialog(null, s.getName() + " 을(를) 장바구니에 담았습니다.");
				}
			}
		}
	}

	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null, "장바구니를 비웠습니다.");
	}
	
}
