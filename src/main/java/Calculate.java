import java.util.List;

/**
 * Created By xfj on 2018/10/31
 */
public class Calculate {
    public static int solve(List<Integer> c, List<Integer>y,int s){
        for(int i=1;i<c.size();i++){
            c.set(i,Math.min(c.get(i-1)+s,c.get(i)));
        }
        int sum=0;
        for(int i=0;i<c.size();i++){
            sum+=c.get(i)*y.get(i);
        }
        return sum;
    }
}
