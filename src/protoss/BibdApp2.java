package protoss;

interface Animal{
	void soind(); //�ϼ��� �Լ� ���� ���Ǹ�
	//public abstract void  soind();
	//Ÿ�Ը� ��ġ�����ִ� ���(terminal) ���ٱ�
	//�������̽�
	//�θ� ����ִ� �Լ��� ������ �ʼ�
}
class Dog implements Animal{
	public void soind(){
		System.out.println("�۸�"); 
		//�������̵�
		//�θ� ����ִ� �Լ��� ������
		//�θ� ����ִ� �Լ��� ������ �����ʰ� ����ص� ���� 
	}
}
class Cat implements Animal{
	public void soind(){
		System.out.println("�߿�");
	}
}
class Fish implements Animal{
	public void soind(){
		System.out.println("��������");
	}
}
public class BibdApp2 {
	private static void start(Animal a) {
			a.soind();
			//Animal a a�� �ٶ󺸴� ���� Animal a�� Fish �޸𸮿� �ø�
			
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
