package protoss;

//object(객체)는 상태와 행동을 가진다
public class Zealot  implements protoss{
	public Zealot(){
		this(100,100,16,1);
	}
	public Zealot(int st, int sh,int attack,int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("My Life Aior");
	}
	final String name ="질럿";
	int st;
	int sh;
	int attack;
	int armor;
	@Override
	public String getName() {

		return name;
	}
	@Override
	public int getst() {

		return st;
	}
	@Override
	public int getsh() {

		return sh;
	}
	@Override
	public int getattack() {

		return attack;
	}
	@Override
	public int getarmor() {

		return armor;
	}
//한개 ctr+spac
	//여러개 왼클 소스 오버라이드 인터페리스 웅앵
	@Override
	public void setsh(int sh) {
		this.sh = sh;
	}


}
