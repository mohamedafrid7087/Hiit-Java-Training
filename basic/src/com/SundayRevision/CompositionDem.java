package com.SundayRevision;


//when we have implemented inheritance, we can achieve composition.
//one of the biggest achievement we do with inheritance is static composition...
public class CompositionDem {
	public static void main(String[] args) {
		//Static composition - happens before compile time...
		HomeoMedicine medicine=new ChelloDeniumMajus(new CenothusAmericanas(new CardusMarianus()));
		
		System.out.println(medicine.cure());
	}
}
class HomeoMedicine{
	public String cure() {
		return "homeo cure....";
	}
}
class ChelloDeniumMajus extends HomeoMedicine{
	HomeoMedicine medicine;
	public ChelloDeniumMajus() {
		// TODO Auto-generated constructor stub
	}
	public ChelloDeniumMajus(HomeoMedicine medicine) {
		this.medicine=medicine;
	}
	
	public String cure() {
		if(medicine==null) {
			return "For Liver Inflamation......";
		}
		else {
			return "For Liver Inflamation...:"+medicine.cure();
		}
	}
	
}
class CenothusAmericanas extends HomeoMedicine{
	HomeoMedicine medicine;
	public CenothusAmericanas() {
		// TODO Auto-generated constructor stub
	}
	public CenothusAmericanas(HomeoMedicine medicine) {
		this.medicine=medicine;
	}
	public String cure() {
		if(medicine==null) {
			return "For Jaundice....";
		}
		else {
			return "For Jaundice..:"+medicine.cure();
		}
	}
}
class CardusMarianus extends HomeoMedicine{
	HomeoMedicine medicine;
	public CardusMarianus() {
		
	}
	public CardusMarianus(HomeoMedicine medicine) {
		this.medicine=medicine;
	}
	public String cure() {
		if(medicine==null) {
			return "Cures Hepatitis...";
		}
		else {
			return "Cures Hepatitis..."+medicine.cure();
		}
		
	}
}