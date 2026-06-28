package Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {5, 0, 8, 0, 3, 0, 9, 1};

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("Array after moving zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
