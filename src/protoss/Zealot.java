package protoss;

//object(객체)는 상태와 행동을 가진다
public class Zealot {
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


}
