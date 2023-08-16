package interfaceseggregation;

public class Nikon  implements Machine1,Machine2,Machine3{

	@Override
	public void fax() {
		System.out.println("nikon faxing");
		
	}

	@Override
	public void scan() {
		// TODO Auto-generated method stub
		System.out.println("nikon sacnning");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("nikon printing");
		
	}

}
