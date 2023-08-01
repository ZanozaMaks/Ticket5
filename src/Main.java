public class Main {


    public static void main(String[] args) {

        int[] weights = {1, 6, 2, 3, 7, 9, 22, 13};
        System.out.println("Увеличиваем чётные числа на +1");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 == 0) {
                weights[i]++;
            }
            System.out.println(weights[i]);
        }
        System.out.println("Вывод чисел с 3 по 7");
        sumWeights(weights);
    }


    public static int sumWeights(int[] weights) {
        for (int i = 3; i <= 7; i++) {
            if (i < weights.length);
            System.out.println(weights[i]);

        }

        return weights.length;

    }
}
