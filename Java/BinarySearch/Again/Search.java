public class Search {
    public static void main(String[] args) {
        // System.out.println(
        int[] arr = { -4, -1, 0, 14, 15, 18, 36, 60 };
        int target = 30;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

}