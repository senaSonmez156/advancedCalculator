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
		System.out.print("��karma: "+ result);
		return result;
	}
	
	
	static int times(int a ,int b) {
		int result=(a*b);
		System.out.print("�arpma: "+ result);
		return result;
	}
	static int divided(int a,int b) {
		if(b==0) {
			System.out.print("B�len 0 olamaz.");
			return 0;
		}
	     int result=(a/b);
	     System.out.print("B�lme:"+result);
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
		System.out.print("�evresi: "+ (2* (a+b)));
		System.out.print("Alan:"+ (a*b));
	}
	
	
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String menu="1.Toplama:\n"+
		            "2.��karma:\n"+
		            "3.�arpma:\n"+
		            "4.B�lme:\n"+
		            "5.�s alma:\n"+
		            "6.Mod alma:\n"+
		            "7.Dikd�rtgen alan ve �evre hesaplama:\n"+
		            "0.��k�� yap";
		
			while(true) {
				System.out.println("Bir i�lem se�iniz: ");
				System.out.print(menu);
				int select=scan.nextInt();
				if(select==0) {
					break;
				}
				
				
				System.out.print("�lk say�y� giriniz: ");
				int a=scan.nextInt();
				System.out.print("�kinci say�y� giriniz:");
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
					System.out.print("�s i�lemi: "+ power(a,b));
					break;
				case 6:	
					System.out.print("Mod: "+ mod(a,b));
					break;
				case 7:
					calc(a,b);
					break;
					
					default:
						System.out.print("Ge�ersiz bir i�lem girdiniz.");
				}
				
				
			}
			
			
			System.out.print("G�le g�le ");
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
				
		

	}

}
