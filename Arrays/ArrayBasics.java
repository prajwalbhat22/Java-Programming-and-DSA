package Arrays;

public class ArrayBasics {
     public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
    
}
