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
		//������
		//new Deajeon(); �޸𸮿� �ø���
		//Earth d �ٶ󺸴°� (Ÿ��)
		System.out.println(d.getName());
		//�ڽ��� ��������� ���� �Լ� ��ȿȭ
		//�����ڽ��� ���� �Լ��� ��� �Ʒ��Ʒ��ڽ��� ������ �װ� ����
	}
}
