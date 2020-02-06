package com.biz;

public class UsbFin implements IUsbBiz {
    private String uname;
    
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	@Override
	public void service() {
		System.out.println(uname+"ÕıÔÚ¸øcpu½µÎÂ");
		
	}

}
