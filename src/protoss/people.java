package protoss;

class People{
	String getName(){
		return null;
	}
}
class jung extends People{
	String name = "�߼�";
	@Override
	String getName() {
		return super.getName();
	}
}
class han extends People{
	String name = "�Ѱ�";
	@Override
	String getName() {
		return super.getName();
	}
}
public class people {
		static void start(People p){
			System.out.println(p.getName());
			//�������ε� 
			//������ ���ÿ����µ� ������ �ٶ�
			//���ÿ� ������ �������̵��ؼ� �θ� �Լ��� �����ϰ� �ڽ� �Լ��� ȣ��
		}
		public static void main(String[] args) {
			start(new han());
			start(new jung());
		}
}
