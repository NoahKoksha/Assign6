package koksha;

public class Widget {
	
	public static void main(String[] args) {
		System.out.println("run to the store");
		constructMemo();
		addListenerEvents();
	}
	
	public static void constructMemo() {
		computeCMS();
		for(int i = 0; i < 10) {
			System.out.println(i);
		}
	}
	
	public static void addListenerEvents() {
		System.out.println("inside method");
	}
}
