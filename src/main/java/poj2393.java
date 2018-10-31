import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created By xfj on 2018/10/31
 */
public class poj2393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split(" ");
        int n=Integer.parseInt(split[0]);
        int s=Integer.parseInt(split[1]);
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            line = sc.nextLine();
            split = line.split(" ");
            assert (split.length == 2);
            c.add(i,Integer.parseInt(split[0]));
            y.add(i,Integer.parseInt(split[1]));
        }
        System.out.println(Calculate.solve(c,y,s));
    }
}
