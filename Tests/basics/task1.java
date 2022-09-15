package Tests.basics;

public class task1 {
    public static void main(String[] args) {
        int lengthArray = 50;
        int min, max, average, sum;
        int[] ints = new int[lengthArray];

        for(int i = 0; i < lengthArray; i++) {
            ints[i] = (int) (Math.random()*100);
            System.out.print(ints[i] + " ");
        }

        min = ints[0];
        max = ints[0];
        sum = 0;

        for ( int x : ints ) {
            if (min > x) min = x;
            if (max < x) max = x;
            sum += x;
        }

        average = (int) (sum / lengthArray);

        System.out.println();
        System.out.println("Минимальное - " + min);
        System.out.println("Максимальное - " + max);
        System.out.println("Среднее - " + average);
    }
}
