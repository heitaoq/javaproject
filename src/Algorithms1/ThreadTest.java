package src.Algorithms1;

/**
 * Java线程：线程的同步
 *
 * @author hash-x
 */
public class ThreadTest {
	public static void main(String[] args) {
		User u = new User("张三", 100);
		System.out.println(u + " 的账户记录如下： ");
		System.out.println();
		MyThread t4 = new MyThread("线程D", u, -30);
		MyThread t5 = new MyThread("线程E", u, 32);
		MyThread t6 = new MyThread("线程F", u, 21);
		MyThread t1 = new MyThread("线程A", u, 20);
		MyThread t2 = new MyThread("线程B", u, -60);
		MyThread t3 = new MyThread("线程C", u, -80);
		MyThread t7 = new MyThread("线程G", u, -80);
		MyThread t8 = new MyThread("线程H", u, -80);
		MyThread t9 = new MyThread("线程I", u, -80);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}
}

class MyThread extends Thread {
	private User u;
	private int y = 0;

	MyThread(String name, User u, int y) {
		super(name);//调用父类的构造函数进行初始化子类的线程名字
		this.u = u;
		this.y = y;
	}

	/**
	 * 每启动一个线程,都要执行run里面的方法
	 */
	@Override
	public void run() {
		u.oper(y);
	}
}

class User {
	private String name;
	private int cash;

	User(String name, int cash) {
		this.name = name;
		this.cash = cash;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	/**
	 * 业务方法
	 *
	 * 如果不加入同步,可能产生的一组输出如下：
	 *
	 * User{name='张三', cash=100} 的账户记录如下：

	 *	线程A运行结束，增加“20”，当前用户账户余额为：120
	 *	线程H运行结束，增加“-80”，当前用户账户余额为：-29  {正确的应该是40}
	 *	线程F运行结束，增加“21”，当前用户账户余额为：51
	 *	线程D运行结束，增加“-30”，当前用户账户余额为：30
	 *	线程B运行结束，增加“-60”，当前用户账户余额为：60
	 *	线程G运行结束，增加“-80”，当前用户账户余额为：-109
	 *	线程I运行结束，增加“-80”，当前用户账户余额为：-189
	 *	线程C运行结束，增加“-80”，当前用户账户余额为：-269
	 *	线程E运行结束，增加“32”，当前用户账户余额为：-237
	 *
	 * @param x
	 *            添加x万元
	 */
	public synchronized void oper(int x) {
		try {
			Thread.sleep(10L);
			this.cash += x;
			System.out.println(Thread.currentThread().getName() + "运行结束，增加“"
					+ x + "”，当前用户账户余额为：" + cash);
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "User{" + "name='" + name + '\'' + ", cash=" + cash + '}';
	}
}