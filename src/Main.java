import java.util.Arrays;

/*
Создать двухмерный квадратный массив и заполнить его «бабочкой», то есть таким образом:

1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[5];

        int[][] arrayInit = new int[][]{{1, 1, 1, 1, 1, 0, 0, 1, 0, 0}, {0, 1, 1, 1, 0}};
        for (int i = 0; i < 5; i++) {
            array1[i] = arrayInit[0][i];
            for (int j = 0; j < 5; j++) {
                array2[i] = arrayInit[1][i];
                for (int k = 5; k < 10; k++) {
                    array3[k - 5] = arrayInit[0][k];
                }
            }
        }
        System.out.println(Arrays.toString(arrayInit));
        System.out.println(getString(array1) + "\n" + getString(array2) + "\n" + getString(array3) + "\n"
                + getString(array2) + "\n" + getString(array1));
    }

    private static String getString(int[] array) {
        String result = Arrays.toString(array)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
        return result;
    }
}