package strings;

public class stringss2 {

	public static void main(String[] args) {
		String mesaj = "          Bugün Hava Çok Güzel.          ";
		System.out.println(mesaj); 
		
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());
		//mesajın başındaki ve sonudaki boşlukları atar.
	}

}
