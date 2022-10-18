package investmentearnings;

import java.util.Scanner;

public class Driver {

public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
System.out.println("Alýþ fiyatýný giriniz:");
double buyingprice= scan.nextDouble();
int day=1;
double closingprice = 0.1;	
while(true) {
System.out.println("Kapanýþ fiyatýný giriniz gün:" 
+ day + "(any negative value to leave:) ");
closingprice=scan.nextDouble();
if(closingprice<0.0) break;
double earnings	= closingprice-buyingprice;
if(earnings > 0.0) {
	System.out.println(+day+". günün sonunda yatýrým baþýna "+earnings+" kazandýnýz.");
	
}
else if (earnings <0.0) {
	System.out.println(+day+". günün sonunda yatýrým baþýna "+(-earnings)+" kaybettiniz.");
}
else{
	System.out.println(+day+". günün sonunda yatýrým baþýna hiçbir þey kazanmadýnýz.");
	
}
day+=1;
		}

scan.close();	
}

}
