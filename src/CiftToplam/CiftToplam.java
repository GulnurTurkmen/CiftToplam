package CiftToplam;
import java.util.Scanner;
public class CiftToplam {
	public static void main(String[] args) {
        int n;
        int total = 0;

        Scanner scan = new Scanner(System.in);
        do{
        	System.out.print("Sayı giriniz: ");
        	n = scan.nextInt();
        }while(n%2==1);
        for(int i=0; i<=n; i++) {
        	if(i%2==0 && i%4==0) {
        		total+=i;
        	}
        }
        System.out.print("toplam: "+total);
        }
	}
