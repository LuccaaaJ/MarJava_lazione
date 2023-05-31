package miniproject_db.copy;

public class SmartTV extends Product{

	String mf;
	

	public SmartTV(String pname, int price, String mf) {
		this.pname=pname;
		this.price=price;
		this.mf = mf;
	} // 중복일 경우 super과 this를 명확하게 정해줘야한다. 

	
	public String getMf() {
		return mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	@Override
	public void printExtra() {
		System.out.print("해상도 : " + mf);
	}
}

	
