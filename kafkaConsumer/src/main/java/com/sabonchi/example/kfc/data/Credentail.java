package com.sabonchi.example.kfc.data;


public class Credentail{
	
	String userName;
	String note;
	
	public Credentail() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	public Credentail(String userName, String note) {
		super();
		this.userName = userName;
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}




	@Override
	public String toString() {
		return "Credentail [userName=" + userName + ", password=" + note + "]";
	}

}
