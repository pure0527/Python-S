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
            /*if(i==num-1){
                for (i=num; i>0; i--){
                    System.out.println(patron);
                }
            }*/
        }
    }
}