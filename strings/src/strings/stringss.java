package strings;

public class stringss {

	public static void main(String[] args) {
		String mesaj = "Bugün Hava Çok Güzel.";
		
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char [25];
		mesaj.getChars(0, 0, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
	}

}
