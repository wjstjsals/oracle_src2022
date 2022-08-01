package Set;

import javax.swing.JLabel;

public class Shop {
	int price;
	String name;
	JLabel image;

	public Shop(String name, int price, JLabel image) {
		this.price = price;
		this.name = name;
		this.image = image;
	}

	public JLabel getImage() {
		return image;
	}

	public void setImage(JLabel image) {
		this.image = image;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
