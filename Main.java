import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Uygulamadaki bankalar :\nKuveyt T�rk\n�� bankas�\nAkbank\nDenizbank\nGaranti Bankas�\nZiraat Bankas�\n�NG Bank\nVak�f Bank");

		System.out.println("\nAnaparan�z� giriniz:");
		int a=scan.nextInt();
		System.out.println("Vade giriniz(G�n cinsinden):");
		int v=scan.nextInt();
		
			baseMevduat kuveytturk=new kuveytTurk();
			System.out.print("Kuveyt t�rk mevduat getirisi: ");
			kuveytturk.mevduathesapla(a,13.67,v);
			baseMevduat isbankasi =new isBankasi();
			System.out.print("\n�sbankasi mevduat getirisi: ");
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
			System.out.print("\nZiraat Bankas� mevduat getirisi: ");
			ziraatbank.mevduathesapla(a,14.5,v);
			baseMevduat ingbank=new baseMevduat();
			System.out.print("\n�NG Bank Bankas� mevduat getirisi: ");
			ingbank.mevduathesapla(a,21.00,v);
			baseMevduat vakifbank=new baseMevduat();
			System.out.print("\nVak�f Bank mevduat getirisi: ");
			vakifbank.mevduathesapla(a,18.5,v);
			
	}

	}
