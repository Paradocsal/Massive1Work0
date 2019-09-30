import static java.lang.Math.*;
public class Okay {
    public static void main(String args[]) {
        short[] h = new short[10];
        System.out.println(h.length);
        short ch = 6;
        for (short j = 0; j < h.length; j++) {
            h[j] = ch;
            ch += 2;
            System.out.println(h[j]);


        }
        System.out.println();

        double[] x = new double[15];
        for (int i = 0; i < x.length; i++) {
            x[i] = ((double) (Math.random() * 15 - 3));
            System.out.println(x[i]);
        }
        System.out.println();

        double[][] f = new double[10][15];
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[i].length; j++) {


                switch ((int) h[i]){
                    case 22:
                            f[i][j] = (double) log(pow(tan(log(acos((x[j]+4.5)/15))), 2));
                        break;

                    case 10:
                        case 16:
                             case 18:
                                case 20:
                                    case 24:
                                        f[i][j] = (double) tan(asin(1 / exp( abs(x[j])) ));
                                         break;



                    default:
                        f[i][j] = (double) log(pow(sin(pow(tan(cos(x[j])),3*pow(pow((x[j]/2),2)/2,pow((0.5/x[j]),2)))),2));
                        break;
                }

                System.out.print(f[i][j] + "\t");
            }
            System.out.println();


        }
    }
}
