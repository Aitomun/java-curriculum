package class_activity_13A;

public class MinimumArray {
    //java program to return minimum array

    public static  int min (int[] arr) {
        // step 1 : this line assumes that the array is not empty
        int min = arr[0];

        //step 2: here we are looping over the arrays
        for (int i = 1; i < arr.length; i++) {
            //step 3 : ths line check if the current element arr[i] being iterations
            //over in the array is less than the current minimum value
            //if the current element  is smaller, it updates the value of min to be value of the
            //current element
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[] num = {33, 6, 2, 18};
        System.out.println(min(num));
    }
    }


