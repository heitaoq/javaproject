package src.Algorithms1;
/**
 * 为什么叫多态？
 * 做出来的东西表现出来的是不同的形态
 * @author Administrator
 *
 */
public class polymorphic {
	public static void main(String[] args) {
		Qizi car = new Car();//用棋子类去引用车
		Qizi horse = new Horse();//用棋子类去引用马
		car.run();
		horse.run();
	}
}

class Qizi {
	public void run(){
		System.out.println("棋子跑...");
	}
}

class Car extends Qizi{

	@Override
	public void run() {
		System.out.println("车跑...任意跑");
	}

}
class Horse extends Qizi{

	@Override
	public void run() {
		System.out.println("马跑...日字跑");
	}
}

