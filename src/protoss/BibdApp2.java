package protoss;

interface Animal{
	void soind(); //완성됭 함수 못씀 정의만
	//public abstract void  soind();
	//타입만 일치시켜주는 통로(terminal) 껍다구
	//인터페이스
	//부모가 들고있는 함수를 재정의 필수
}
class Dog implements Animal{
	public void soind(){
		System.out.println("멍멍"); 
		//오버라이딩
		//부모가 들고있는 함수를 재정의
		//부모가 들고있는 함수를 재정의 하지않고 사용해도 가능 
	}
}
class Cat implements Animal{
	public void soind(){
		System.out.println("야옹");
	}
}
class Fish implements Animal{
	public void soind(){
		System.out.println("뻐끔뻐끔");
	}
}
public class BibdApp2 {
	private static void start(Animal a) {
			a.soind();
			//Animal a a가 바라보는 것은 Animal a는 Fish 메모리에 올림
			
	}

	public static void main(String[] args) {
		start(new Fish());
		start(new Cat());
		start(new Dog());
	/*	Animal f =new Fish();
		f.soind();
		
		Animal c = new Cat();
		c.soind();
		
		Animal d = new Dog();
		d.soind();*/
	}

}
