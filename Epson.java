package interfaceseggregation;

public class Epson implements Machine1,Machine2 {

	@Override
	public void scan() {
		System.out.println("scanning");
		
	}

	@Override
	public void print() {
		System.out.println("epson printing");
		
	}

}
