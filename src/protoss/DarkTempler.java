package protoss;

public class DarkTempler implements protoss{
	public DarkTempler() {
		this(100,100,40,1);
	}
	public DarkTempler(int st, int sh, int attack, int armor){
		this.st=st;
		this.sh=sh;
		this.attack=attack;
		this.armor=armor;
		
		System.out.println("Adun Touridus");
	}
	final String name ="다크템플러";
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
	@Override
	public void setsh(int sh) {
		this.sh = sh;
	}
}
