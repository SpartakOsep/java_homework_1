package homework1;


import java.util.*;
public class task1 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
        int snum = 1;
        int faktоr = 1;
        for (int i = 2; i <= num; i++){
            snum = snum + i;
            faktоr = faktоr*i;  
            }    
         
        System.out.println ("Введенное число " + num);
        System.out.println ("n-ое треугольного число = " + snum);
        System.out.println ("Факториал = " + faktоr);
    }
    
}
