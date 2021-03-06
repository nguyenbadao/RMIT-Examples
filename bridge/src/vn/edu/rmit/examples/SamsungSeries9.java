package vn.edu.rmit.examples;

public class SamsungSeries9 implements TV {

	private boolean on;
	private int currentChannel = -1;
	private int previousChannel = -1;
	
	@Override
	public void on() {
		on = true;
	}

	@Override
	public void off() {
		on = false;
	}

	@Override
	public int tuneChannel(int c) {
		if(!on) {
			on();
		}
		previousChannel = currentChannel;
		currentChannel = c;
		return currentChannel;
	}

	@Override
	public int recallChannel() {
		return previousChannel;
	}
	
}
