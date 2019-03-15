package info.streamfileprocessing;

public class Address {
	private String hno;
	private String colony;
	private String State;
	private String pinCode;
	
	public Address() {
		super();
	}

	
	public Address(String hno, String colony, String state, String pinCode) {
		super();
		this.hno = hno;
		this.colony = colony;
		State = state;
		this.pinCode = pinCode;
	}


	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	
	
	
	

}
