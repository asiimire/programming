public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] integerArray = new int[5];

        // Assign values to the array
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = i * 2;
        }

        // Print the elements of the array
        System.out.print("Integer Array: ");
        for (int i = 0; i < integerArray.length; i++) {
            System.out.print(integerArray[i] + " ");
        }
        System.out.println();

        // Declare and initialize an array of strings
        String[] stringArray = {"apple", "banana", "orange", "grape"};

        // Print the elements of the array
        System.out.print("String Array: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println();

        // Multidimensional array example (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the elements of the 2D array
        System.out.println("2D Array (Matrix): ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

