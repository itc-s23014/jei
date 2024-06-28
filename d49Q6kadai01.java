//s23014
//与えられた引数を連携
import java.lang.StringBuilder;
public class d49Q6kadai01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
        }
        System.err.println(sb.toString());
    }
}
