/**
 * Created by Yehia830 on 9/21/16.
 */
public class logic2 {
    public static void main(String[] args) {
        System.out.println(loneSum(3,3,3));
        closeFar(1,2,3);
    }

    public static int loneSum(int a, int b, int c){
       int sum = 0;

        if(a != b && b != c && a!=c) {
           return sum = a + b + c;
       }else if (a == b && a != c)
           sum = c;
        else if (a == c && a != b){
            sum = b;
        }
        else if(b == c && a != c){
            sum = a;
        }
        else if(a == b && b == c && a == c){
           sum = 0;
        }
       return sum;
    }
    public static boolean closeFar(int a, int b , int c){
        boolean closeFarFlag = false;

        if(Math.abs(a - b) == 0 || Math.abs(a - b) == 1) {
            if(Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
                return closeFarFlag = true;

            } else {
                return closeFarFlag;
            }
        } else if(Math.abs(a - c) == 0 || Math.abs(a - c) == 1) {
            if(Math.abs(a - b) >= 2 && Math.abs(c - b) >= 2) {
                return closeFarFlag = true;
            } else {
                return closeFarFlag;
            }
        } else {
            return  closeFarFlag;
        }

    }

    public static int luckySum(int a, int b, int c){
      int sum = 0;

        if(a == 13) {
            return sum = 0;
        } else if(b == 13) {
            return sum = a;
        } else if(c == 13) {
            return sum = a + b;
        } else {
            return sum = a + b + c;
        }
    }


}
