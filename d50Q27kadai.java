//s23014
//標準入力を使って値を入力してもらうようにした
import java.util.Scanner;
class d50Q27kadai {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              int control = scanner.nextInt();
              String mode = "";

        switch (control) {
            case 1:
                mode = "Warm";
            case 2:
                mode = "Cool";
            case 3:
                mode = "Wind";
                break;
           }
            System.out.print(mode);
    }
  }
