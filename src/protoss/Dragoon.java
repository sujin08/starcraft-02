package protoss;

//object(객체)는 상태와 행동을 가진다
public class Dragoon implements protoss{
	public Dragoon(){
		this(100,100,20,1);
	}
	public Dragoon(int st, int sh,int attack,int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("I had returned");
	}
	final String name ="드라곤";
	int st;
	int sh;
	int attack;
	int armor;
	
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
	public void setsh(int sh) {
		this.sh = sh;
	}

}
