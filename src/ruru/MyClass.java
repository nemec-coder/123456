package ruru;

import java.util.Arrays;

public class MyClass {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};
      reverse(arr);
      System.out.println(Arrays.toString(arr)); // [5, 4, 3, 2, 1]
      reverse(arr);
      System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]
   }
   public static void reverse(int[] arr) {
      int tmp = 0;
      for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
         tmp = arr[i];
         arr[i] = arr[j];
         arr[j] = tmp;
      }
   }
}

