package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl tv = new TV();
		RemoteControl audio = new Audio();
		
		tv.turnOn();
		tv.setVolume(-5);
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBattery();
		//static �޼����̹Ƿ� �������̽� �̸����� ���� ����
		
		audio.turnOn();
		audio.setVolume(7);
		audio.turnOff();
	}

}
