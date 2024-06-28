public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber;
	private double mobileBalance;
	private String mobileOSName;
	private boolean lock;
	
	public Mobile(){
	}
	public Mobile(String mobileOwnerName,String mobileNumber,double mobileBalance,String mobileOSName,boolean lock){
		this.mobileOwnerName=mobileOwnerName;
		this.mobileNumber=mobileNumber;
		this.mobileBalance=mobileBalance;
		this.mobileOSName=mobileOSName;
		this.lock=lock;
	}
	
	public void setmobileOwnerName(String mobileOwnerName){
		this.mobileOwnerName=mobileOwnerName;
	}
	public void setmobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public void setmobileBalance(double mobileBalance){
		this.mobileBalance=mobileBalance;
	}
	public void setmobileOSName(String mobileOSName){
		this.mobileNumber=mobileNumber;
	}
	public void setLock(boolean lock){
		this.lock=lock;
	}
	
	public String getmobileOwnerName(){
		return mobileOwnerName;
	}
	public String getmobileNumber(){
		return mobileNumber;
	}
	public double getmobileBalance(){
		return mobileBalance;
	}
	public String getmobileOSName(){
		return mobileOSName;
	}
	public boolean lock(){
		return lock;
	}
	public void showInfo(){
		System.out.println("Mobile Owner Name :"+mobileOwnerName);
		System.out.println("Mobile Number\t  :"+mobileNumber);
		System.out.println("Mobile Balance\t  :"+mobileBalance);
		System.out.println("MobileOSName\t  :"+mobileOSName);
		System.out.println("Lock  \t\t:"+lock);
		System.out.println();
	}
	public void Recharge(int amount) {
		if(mobileBalance>0){
			mobileBalance=mobileBalance+amount;
			System.out.println("You recharged "+amount+" taka and Your update Mobile Balance : "+mobileBalance+" taka");
		}
	}
	public void CallSomeone(int timeDuration){
		double callcost = timeDuration * 0.5;
		if(mobileBalance>=callcost){
			mobileBalance = mobileBalance - callcost;
			System.out.println("Call Duration    \t: "+timeDuration+" minutes");
			System.out.println("Remaining balance\t: "+mobileBalance+" taka");
		}
		else if(mobileBalance<=callcost){
			System.out.println("Insufficient balance");
		}
	}
	
}