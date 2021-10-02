public class AscendingSort {
    public static void main(String[] args) {
        int[] array = { 13, 12, 33, 64, 5 };
        int i, j, temp;

        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("The array in ascending order is:");
        for (i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
    }

}
