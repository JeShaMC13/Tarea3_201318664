import java.util.Scanner;
public class Ingrese {
public static void main(String[]args){
Scanner en=new Scanner(System.in);
System.out.println("Ingrese numero:");
int num=en.nextInt();
if (num%2==0){
System.out.println("El numero es par");
}else
System.out.println("numero es impar");

}
}
