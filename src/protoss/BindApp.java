package protoss;

class Earth{
	String name ="Earth";
	public String getName() {
		return name;
	}
}
class Asis extends Earth{
	String name ="Asis";
	public String getName() {
		return name;
	}
}
class Korea extends Asis{
	String name ="Korea";
	public String getName() {
		return name;
	}
}
class Deajeon extends Korea{
	String name ="Deajeon";
	public String getName() {
		return name;
	}
}
public class BindApp {
	public static void main(String[] args) {
		Earth d = new Deajeon();
		//다형성
		//new Deajeon(); 메모리에 올리기
		//Earth d 바라보는것 (타입)
		System.out.println(d.getName());
		//자식이 들고있으면 같은 함수 무효화
		//직속자식이 같은 함수가 없어도 아래아래자식이 있으면 그게 실행
	}
}
