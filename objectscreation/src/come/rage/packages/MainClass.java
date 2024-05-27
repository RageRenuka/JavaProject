package come.rage.packages;

public class MainClass {

	public static void main(String[] args) {
	
		ObjectCreating oc=new ObjectCreating();
		
		
		ObjectCreating oc1=new ObjectCreating("SBI","RENUKA",1113274849);

		ObjectCreating oc2=new ObjectCreating("hdfc","madhu",1026354748);
		System.out.println(oc1.bankaccoNumber+","+oc1.bankName+","+oc1.name);
		ObjectCreating oc3=new ObjectCreating("bank of barod","sai kumar");
		System.out.println(oc3.bankaccoNumber+","+oc3.bankName);
		ObjectCreating oc4=new ObjectCreating("panjob bank",635374736);
		System.out.println(oc1.bankName+","+oc1.name);
	
	System.out.println(oc2.bankaccoNumber+","+oc2.bankName+","+oc2.name);


}
}
