package protoss;

public class protossApp {
	public static void attack(protoss unit1, protoss unit2){
		int gamage = unit1.getattack() - unit2.getarmor();
		unit2.setsh(unit2.getsh()-gamage);
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
		System.out.println("����� �����" + u2.sh);
	}
	public static void printunit(Zealot u2) {
		System.out.println("������ �����" + u2.sh);
	}
	public static void printunit(DarkTempler u2) {
		System.out.println("DarkTempler�� �����" + u2.sh);
	}

	public static void main(String[] args) {
		gateWay gate1 =new gateWay();
		Zealot z1 = gate1.makeZealot();
		Zealot z2 = gate1.makeZealot();
		
		Dragoon d1 = gate1.makeDragoon();
		Dragoon d2 = gate1.makeDragoon();
//�Լ��� ȣ���Ѵ� = �ٸ���ü���� �޽����� ������
		DarkTempler dT1 = gate1.makeDarkTempler();
		DarkTempler dT2 = gate1.makeDarkTempler();
		
		protossApp.attack(z1, d1);
		protossApp.printunit(d1);
		
		protossApp.attack(d1, z1);
		protossApp.printunit(z1);
		
		protossApp.attack(z1,z1);
		protossApp.printunit(z1);
		
		protossApp.attack(z1,dT1);
		protossApp.printunit(dT1);
		
		
	}

}
