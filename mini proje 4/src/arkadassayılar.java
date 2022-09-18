
public class arkadassayılar {

	public static void main(String[] args) {
		//222-284
		int sayı1 = 222;
		int sayı2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayı1; i++) {
			if (sayı1 %i == 0){
				toplam1 = toplam1 + 1;
				
			}
		}
		
		for(int i=1; i<sayı2; i++) {
			if (sayı2 %i == 0){
				toplam2 = toplam2 + 1;
				
			}
		}
		if (sayı1 == toplam2 || sayı2 == toplam1) {
			//|| alt gr + küçüktür büyüktür tuşu
			System.out.println("bu iki sayı arkadaştır");
		}else {
			System.out.println("bu iki sayı arkadaş değildir");
		}
	  }
	}


