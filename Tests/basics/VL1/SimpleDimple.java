package Tests.basics.VL1;

public class SimpleDimple {
    public static void main(String[] args) {
        int n = 100;


        double[] array = new double[n];


        for (int i = 2; i < 100; i++) {

            array[i] = i;
            boolean simple = true;

            for (int j =2; j<i;j++){

                if( i%j == 0){
                    simple = false;
                    break;

                }
            }

            if(simple) {
                System.out.println(array[i]);
            }

            }
        }

    }

