import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = Integer.parseInt(tec.next());
        String patron= "#";
        for(int i=0; i<num; i++){
            System.out.println(patron);
            patron = patron + "#";
            if(i==num-1){
                for (i=num; i>=0; i--){ //cambio de i>0 a i>=0
                    System.out.println(patron);
                }
            }
        }
	System.out.println("cambio desde la pc")
    }
}
