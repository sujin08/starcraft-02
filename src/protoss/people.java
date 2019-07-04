package protoss;

class People{
	String getName(){
		return null;
	}
}
class jung extends People{
	String name = "중선";
	@Override
	String getName() {
		return super.getName();
	}
}
class han extends People{
	String name = "한결";
	@Override
	String getName() {
		return super.getName();
	}
}
public class people {
		static void start(People p){
			System.out.println(p.getName());
			//동적바인딩 
			//변수는 피플에없는디 피플을 바라봄
			//피플에 네임을 오버라이드해서 부모 함수를 무시하고 자식 함수로 호출
		}
		public static void main(String[] args) {
			start(new han());
			start(new jung());
		}
}
