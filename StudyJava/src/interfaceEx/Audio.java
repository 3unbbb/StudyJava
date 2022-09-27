package interfaceEx;

public class Audio implements RemoteConrtrol{

	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio On!!");	
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off!!");	
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteConrtrol.MAX_VOLUME){
			this.volume = RemoteConrtrol.MAX_VOLUME;
		}else if(volume<RemoteConrtrol.MIN_VOLUME){
			this.volume = RemoteConrtrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("now Audio volume : " + this.volume);
		
	}
	
	//디폴트 메소드 재정의
	@Override
	public void setMute(boolean mute){
		this.mute = mute;
		
		if(mute){
			System.out.println("audio mute!!");
		}else{
			System.out.println("audio mute off!!");
		}
	}

}
