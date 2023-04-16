package javafullcoursepart3;
class phone{
	 void call() {
		 System.out.println("You can make a call");
	 }
	 void sms() {
		 System.out.println("You can message ");
	 }
	 
}

interface camera{
	void click();
	void record();
	
}
interface audioplayer{
	void pause();
	void play();
	void stop();
}
class smartphone extends phone implements camera,audioplayer{

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Music is paused");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Music is play");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Music is stop");
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Click the camera ");
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println("Record the video");
	}
	
}
public class Multipleinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
smartphone s=new smartphone();
s.call();
s.click();
s.pause();
s.play();
s.sms();
s.record();
s.stop();
	}

}
