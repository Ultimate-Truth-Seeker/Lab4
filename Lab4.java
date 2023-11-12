package Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        List<UsuarioBase> users = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        boolean menu = true;
        while (menu) {
            int op = num(s);
            switch (op) {
                case 1:
                    menu = false;
                    break;
            
                default:
                    break;
            }
        }
        s.close();
    }
    public static int num(Scanner s) {
        boolean number = true; int nn = 0;
        while (number){
            String n = s.nextLine();
            try {
                nn = Integer.parseInt(n);
                number = false;
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        return nn;
    }
}
