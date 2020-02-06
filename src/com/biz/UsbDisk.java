package com.biz;

public class UsbDisk implements IUsbBiz {
  private String uname;
    
	public UsbDisk() {
	super();
	// TODO Auto-generated constructor stub
}
    
	public  UsbDisk(String uname,int type) {
		super();
		System.out.println("uname:"+uname+"<===>type:"+type);
		this.uname = uname;
	}

	public String getUname() {
	return uname;
    }

    public void setUname(String uname) {
    	System.out.println("set方法正在动作");
	this.uname = uname;
    }

	@Override
	public void service() {
		System.out.println(uname+"正在复制文件");
	}

}
