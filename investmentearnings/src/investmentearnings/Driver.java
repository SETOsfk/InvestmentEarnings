package investmentearnings;

import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("Al�� fiyat�n� giriniz:");
double buyingprice= scan.nextDouble();
int day=1;
double closingprice = 0.1;	
while(true) {
System.out.println("Kapan�� fiyat�n� giriniz g�n:" 
+ day + "(any negative value to leave:) ");
closingprice=scan.nextDouble();
if(closingprice<0.0) break;
double earnings	= closingprice-buyingprice;
if(earnings > 0.0) {
	System.out.println(+day+". g�n�n sonunda yat�r�m ba��na "+earnings+" kazand�n�z.");
	
}
else if (earnings <0.0) {
	System.out.println(+day+". g�n�n sonunda yat�r�m ba��na "+(-earnings)+" kaybettiniz.");
}
else{
	System.out.println(+day+". g�n�n sonunda yat�r�m ba��na hi�bir �ey kazanmad�n�z.");
	
}
day+=1;
		}

scan.close();	
}

}
