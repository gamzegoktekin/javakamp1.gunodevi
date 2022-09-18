
public class miniproje1 {

	public static void main(String[] args) {
		//asal sayı
		int number = 5;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean interPrime = true;
		
		if (number == 1) {
			System.out.println("sayı asal değildir.");
			return;
		}
		
		if (number<2) {
			System.out.println("geçersiz sayı");
		}

		boolean isPrime = false;
		for (int i =2; i<number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("sayı asaldır");
		}else {
			System.out.println("sayı asal değildir");
		}
	}

}
