package domains.brighton.mf600.lesson1;

public class Arrays {
    public static void main(String[] args) {
        // There are two ways to declare an array
        // 1. Declare the array and then allocate memory for it
        int[] arr = new int[5];
        arr[0] = 1;
        // 2. Declare the array and allocate memory for it in the same line
        int[] arr2 = {1, 2, 3, 4, 5};

        //To access an element in an array, use the index of the element
        System.out.println(arr2[0]); //An array's index starts at 0

        // To access the last element in an array, use the length and subtract 1
        System.out.println(arr2[arr2.length - 1]);


    }
}
