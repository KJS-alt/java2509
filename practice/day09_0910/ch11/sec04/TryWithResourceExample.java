package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {

		try (MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		
		
	}
}
