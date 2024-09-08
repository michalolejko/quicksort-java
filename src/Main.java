//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] array = {8, 2, 3, 4, 1, 7, 9, 5, 6};

        quicksort(array, 0, array.length-1);

        System.out.println(arrayToString(array));
    }

    private static void quicksort(int[] array, int start, int end) {
        if (end <= start) return;

        int pivot = partition(array, start, end);
        quicksort(array, start, pivot - 1);
        quicksort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }

    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (true) {
            result.append(i++);
            if (i > array.length) {
                break;
            }
            result.append(", ");
        }

        return result.toString();
    }
}