package src.Algorithms1;
/**
 * Ϊʲô�ж�̬��
 * �������Ķ������ֳ������ǲ�ͬ����̬
 * @author Administrator
 *
 */
public class polymorphic {
	public static void main(String[] args) {
		Qizi car = new Car();//��������ȥ���ó�
		Qizi horse = new Horse();//��������ȥ������
		car.run();
		horse.run();
	}
}

class Qizi {
	public void run(){
		System.out.println("������...");
	}
}

class Car extends Qizi{

	@Override
	public void run() {
		System.out.println("����...������");
	}

}
class Horse extends Qizi{

	@Override
	public void run() {
		System.out.println("����...������");
	}
}

