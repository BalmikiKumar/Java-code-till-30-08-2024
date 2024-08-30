  public class DuplicateElement {
      public static void main(String[] args) {
          int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 55, 2};
          int n = arr.length;
          System.out.println("Length of arr =" + n);

          for (int i = 0; i < n; i++) {
              for (int j = i + 1; j < n; j++) {
                  if (arr[i] == arr[j]) {
                      System.out.println("Duplicate elements are :" + arr[j]);
                  }
              }
          }

      }

  }