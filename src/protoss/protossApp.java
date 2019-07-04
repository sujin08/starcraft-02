package protoss;

public class protossApp {
	public static void attack(Zealot unit1, Dragoon unit2){
		int gamage = unit1.attack - unit2.armor;
		unit2.sh =unit2.sh -gamage;
	}
	public static void attack(Dragoon unit1, Zealot unit2){
		int gamage = unit1.attack - unit2.armor;
		unit2.sh =unit2.sh -gamage;
	}
	public static void attack(Zealot unit1, Zealot unit2){
		int gamage = unit1.attack - unit2.armor;
		unit2.sh =unit2.sh -gamage;
	}
	public static void printunit(Dragoon u2) {
		System.out.println("드라군의 쉴드는" + u2.sh);
	}
	public static void printunit(Zealot u2) {
		System.out.println("질럿의 쉴드는" + u2.sh);
	}

	public static void main(String[] args) {
		gateWay gate1 =new gateWay();
		Zealot z1 = gate1.makeZealot();
		Zealot z2 = gate1.makeZealot();
		
		Dragoon d1 = gate1.makeDragoon();
		Dragoon d2 = gate1.makeDragoon();
//함수를 호출한다 = 다른객체에게 메시지를 보낸다
		
		protossApp.attack(z1, d1);
		protossApp.printunit(d1);
		
		protossApp.attack(d1, z1);
		protossApp.printunit(z1);
		
		protossApp.attack(z1,z1);
		protossApp.printunit(z1);
	}

}
