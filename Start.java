public class Start{
	public static void main(String[]args){
		Mobile person1= new Mobile("Abtahi Islam","01315477832",50,"Android",false);
		Mobile person2= new Mobile("Sharmila","01323565742",80,"iOS",true);
		Mobile person3= new Mobile("Rahman Islam","01865647365",35,"iOS",false);
		Mobile person4= new Mobile("Tulha","0194865742",77,"Android",false);
		person1.showInfo();
		person2.showInfo();
		person3.showInfo();
		person4.showInfo();
		person3.CallSomeone(7);
	}
}