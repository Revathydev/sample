package org.base;


public class Sample extends BaseClass{
	public static void main(String[] args) {
		launchBrowser("Chrome");
		implicityWait();
		launchUrl("https://adactinhotelapp.com/");
		Login l=new Login();
		fillTextBox(l.getTxtUsername(), "DRevathy");
		fillTextBox(l.getTxtPassword(), "revathy");
		btnClick(l.getLogIn());
		Selection s=new Selection();
		selectByIndex(s.getLocation(), 2);
		selectByIndex(s.getHotels(), 2);
		selectByIndex(s.getRoomType(), 3);
		selectByIndex(s.getRoomNos(), 2);
		(s.getCheckIn()).clear();
		fillTextBox(s.getCheckIn(), "03/04/2021");
		(s.getCheckOut()).clear();
		fillTextBox(s.getCheckOut(), "04/04/2021");
		selectByIndex(s.getAdultRoom(), 2);
		selectByIndex(s.getChildRoom(), 2);
		btnClick(s.getSubmit());
		FinishPage f=new FinishPage();
		btnClick(f.getRadio());
		btnClick(f.getClick());
		Booking b=new Booking();
		fillTextBox(b.getFirstName(), "revathy");
		fillTextBox(b.getLastName(), "dev");
		fillTextBox(b.getAddress(), "49,refvygy,gtfevdve,tfdtgds");
		fillTextBox(b.getCcNumber(), "1234567891234567");
		selectByIndex(b.getCcType(), 2);
		selectByIndex(b.getCcExpiryMonth(), 5);
		selectByIndex(b.getCcExpiryYear(), 12);
		fillTextBox(b.getCvvNum(), "1254");
		btnClick(b.getBookNow());
		OrderId o=new OrderId();
		System.out.println(getAttribute(o.getOrderId()));
				
	}
}
