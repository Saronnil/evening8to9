import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = arr1;
        arr2[2] = 10;
        System.out.println(Arrays.toString(arr1));

        int[] arr = {1, 2, 3, 4};
        for (int val : arr) {
            val = val * 2;
        }
        System.out.println(Arrays.toString(arr));

        int[] brr = {1, 2, 3, 4, 5, 6};
        for (int i = 0, j = brr.length - 1; i < j; i += 2, j -= 2) {
            int temp = brr[i];
            brr[i] = brr[j];
            brr[j] = temp;
            System.out.println(Arrays.toString(brr));
        }
        System.out.println(Arrays.toString(brr));

        int[] crr = {1, 2, 3, 4,};
        int[] preFixSum = new int[crr.length];
        preFixSum[0] = crr[0];
        for (int i = 1; i < crr.length; i++) {
            preFixSum[i] = preFixSum[i - 1] + crr[i];
        }
        System.out.println(Arrays.toString(preFixSum));

        int[] arr13 = {1, 1, -2, 0, -1, 1};
        int[] brr13 = new int[6];
        for (int m = 0; m < arr13.length; m++) {
            int temp = 0;
            temp = temp + arr13[m];
            brr13[m] = temp;
            if (temp == 0)
                System.out.println(Arrays.toString(brr13));
        }

        int[] arr23 = {8, 5, 8, 8, 0};
        int x = 0;
        for (int n = 0; n < arr23.length - 1; n++) {
            for (int f = n + 1; f < arr2.length; f++) {
                if (arr2[n] == arr2[f]) {
                    System.out.println(" Value is same " + arr2[n]);
                    x = x += 1;
                    System.out.println("Count of duplicate value in array is " + x);
                }

                int[] arr3 = {1, 2, 3, 4, 5};
                int temp = arr3[arr3.length - 1];
                int count = 2;
                for (int jv = 0; jv < count; jv++) {
                    for (int iv = arr3.length - 2; iv > -1; iv--) {
                        arr3[iv + 1] = arr3[iv];
                    }
                    arr[0] = temp;
                    System.out.println(Arrays.toString(arr3));


                }
            }


        }
    }
}



