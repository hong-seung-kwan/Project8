package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		BasicTV basicTV = new BasicTV();
		basicTV.isPowerOn = true;
		basicTV.channel = 7;
		basicTV.volume = 20;
		basicTV.showInfo();
		
		System.out.println();
		
		SmartTV smartTV = new SmartTV();
		smartTV.isPowerOn = true;
		smartTV.channel = 30;
		smartTV.volume = 12;
		smartTV.ip = "192.168.0.111";
		smartTV.showInfo();

	}

}

class BasicTV{
	boolean isPowerOn;
	int channel;
	int volume;
	
	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
}

class SmartTV extends BasicTV {
	String ip;
	
	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
}
