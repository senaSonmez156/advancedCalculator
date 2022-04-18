package advancedCalculator;
import java.util.Scanner;
public class Main {
	static int sum(int a,int b) {
		int result=(a+b);
		System.out.print("Toplam: "+ result);
		return result ;
	}
	
	
	
	static int minus(int a,int b) {
		int result=(a*b);
		System.out.print("Çıkarma: "+ result);
		return result;
	}
	
	
	static int times(int a ,int b) {
		int result=(a*b);
		System.out.print("Çarpma: "+ result);
		return result;
	}
	static int divided(int a,int b) {
		if(b==0) {
			System.out.print("Bölen 0 olamaz.");
			return 0;
		}
	     int result=(a/b);
	     System.out.print("Bölme:"+result);
		return result;
	}
	
	static int power(int a, int b) {
		int result=1;
		for(int i=0; i<=b; i++) {
			result*=a;
		}
		return result;
	}
	
	static int mod(int a, int b) {
		int result=(a%b);
		return result;
	}
	
	static void calc( int a,int b) {
		System.out.print("Çevresi: "+ (2* (a+b)));
		System.out.print("Alan:"+ (a*b));
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String menu="1.Toplama:\n"+
		            "2.Çıkarma:\n"+
		            "3.Çarpma:\n"+
		            "4.Bölme:\n"+
		            "5.Üs alma:\n"+
		            "6.Mod alma:\n"+
		            "7.Dikdörtgen alan ve çevre hesaplama:\n"+
		            "0.Çıkış yap";
		
			while(true) {
				System.out.println("Bir işlem seçiniz: ");
				System.out.print(menu);
				int select=scan.nextInt();
				if(select==0) {
					break;
				}
				
				
				System.out.print("İlk sayıyı giriniz: ");
				int a=scan.nextInt();
				System.out.print("İkinci sayıyı giriniz:");
				int b=scan.nextInt();
				
				
				
				switch(select) {
				case 1:
					sum(a,b);
					break;
				case 2:
					minus(a,b);
					break;
				case 3:
					times(a,b);
					break;
				case 4:
					divided(a,b);
					break;
				case 5:
					System.out.print("Üs işlemi: "+ power(a,b));
					break;
				case 6:	
					System.out.print("Mod: "+ mod(a,b));
					break;
				case 7:
					calc(a,b);
					break;
					
					default:
						System.out.print("Geçersiz bir işlem girdiniz.");
				}
				
				
			}
			
			
			System.out.print("Güle güle ");
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
		

	}

}
