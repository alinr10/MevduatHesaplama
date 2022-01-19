import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Uygulamadaki bankalar :\nKuveyt Türk\nİş bankası\nAkbank\nDenizbank\nGaranti Bankası\nZiraat Bankası\nİNG Bank\nVakıf Bank");

		System.out.println("\nAnaparanızı giriniz:");
		int a=scan.nextInt();
		System.out.println("Vade giriniz(Gün cinsinden):");
		int v=scan.nextInt();
		
			baseMevduat kuveytturk=new kuveytTurk();
			System.out.print("Kuveyt türk mevduat getirisi: ");
			kuveytturk.mevduathesapla(a,13.67,v);
			baseMevduat isbankasi =new isBankasi();
			System.out.print("\nİsbankasi mevduat getirisi: ");
			isbankasi.mevduathesapla(a,16.0,v);
			baseMevduat akbank =new Akbank();
			System.out.print("\nAkbank mevduat getirisi: ");
			akbank.mevduathesapla(a,20.0,v);
			baseMevduat denizbank =new DenizBank();
			System.out.print("\nDenizbank mevduat getirisi: ");
			denizbank.mevduathesapla(a,17.0,v);
			baseMevduat garanti =new Garanti();
			System.out.print("\nGaranti mevduat getirisi: ");
			garanti.mevduathesapla(a,16.25,v);
			baseMevduat ziraatbank=new baseMevduat();
			System.out.print("\nZiraat Bankası mevduat getirisi: ");
			ziraatbank.mevduathesapla(a,14.5,v);
			baseMevduat ingbank=new baseMevduat();
			System.out.print("\nİNG Bank Bankası mevduat getirisi: ");
			ingbank.mevduathesapla(a,21.00,v);
			baseMevduat vakifbank=new baseMevduat();
			System.out.print("\nVakıf Bank mevduat getirisi: ");
			vakifbank.mevduathesapla(a,18.5,v);
			
	}

	}
