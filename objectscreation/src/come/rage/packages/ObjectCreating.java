package come.rage.packages;

public class ObjectCreating {
	
String bankName;
String name;
long bankaccoNumber;


ObjectCreating()
{
	
}

public ObjectCreating(String bankName, String name, long bankaccoNumber){
	this.bankName = bankName;
	this.name = name;
	this.bankaccoNumber = bankaccoNumber;
}
public ObjectCreating(String bankName, String name){
	this.bankName = bankName;
	this.name = name;
}
public ObjectCreating(String bankName, long bankaccoNumber){
	this.bankName = bankName;
	this.bankaccoNumber = bankaccoNumber;
}

}