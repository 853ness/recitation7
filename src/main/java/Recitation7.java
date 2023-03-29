/**
 * Recitation7 is a class for completing
 *  Reciation 7 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class Recitation7
{
    // define your constants after this comment
    private static String replicate(char ch, int ntimes){
        String str = "";
        for (int i =0; i < ntimes; i++){
            str += ch;
        }
        return str;
    }


    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int row = 0; row < height; row++){
            str += replicate('*', row+1) + "\n";
        }
        //add your code here
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for (int row = 0; row < height; row++) {
            for (int space = 0; space < height - row - 1; space++) {
                str += " ";
            }
            for (int col = 0; col <= row; col++) {
                str += "*";
            }
            str += "\n";
        }
        //add your code here
        return str;
    }

    public static String circle(int radius){
        String str = "";
        for(int row = radius; row>= -(radius -1); row--){
            int col = (int) Math.sqrt(radius*radius- row * row);
            int side = col * 2;
            int oSide = (radius *2 - side);
            if (oSide == radius*2) {
                str += "";
            }else {
                for (int space = 0; space < radius-col; space++) {
                    str += " ";
                }
                for (int b = side; b > 0; b--) {
                    str += "*";
                }
                str += "\n";
            }
        }
        return str;
    }
}
