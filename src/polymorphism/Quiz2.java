package polymorphism;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();

		list.add(new Customer("둘리"));
		list.add(new GOLDCustomer("또치"));
		list.add(new VIPCustomer("도우너"));

		for (Customer customer : list) {
			customer.calcPrice(10000);
		}
//		for(Customer customer : list) {
//			customer.showInfo();
//		}

	}

}

class GOLDCustomer extends Customer {

	double saleRatio;

	public GOLDCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		double salePrice = price - price * saleRatio;
		System.out.println(customerName + "님이 " + salePrice + "원을 결제했습니다.");
	}

}