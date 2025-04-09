//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            int number = scanner.nextInt();
//            array[i] = number;
//        }
//
//        //thực hiện sắp xếp mảng và in ra
//        doQuickSort(array, 0, array.length - 1, new Comparator() {
//            @Override
//            public boolean canDoiChoHayKhong(int o1, int o2) {
//
//                return o1 < o2;
//            }
//        });
//        for (int j : array) {
//            System.out.println(j);
//        }
//    }
//
//    public static int partition(int[] array, int low, int high, Comparator comparator) {
//
//        // choose the rightmost element as pivot
//        int pivot = array[high];
//
//        // pointer for greater element
//        int i = (low - 1);
//
//        // traverse through all elements
//        // compare each element with pivot
//        for (int j = low; j < high; j++) {
//            if (comparator.canDoiChoHayKhong(array[j], pivot)) {
//
//                // if element smaller than pivot is found
//                // swap it with the greater element pointed by i
//                i++;
//
//                // swapping element at i with element at j
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//
//        }
//
//        // swap the pivot element with the greater element specified by i
//        int temp = array[i + 1];
//        array[i + 1] = array[high];
//        array[high] = temp;
//
//        // return the position from where partition is done
//        return (i + 1);
//    }
//
//    public static void doQuickSort(int[] array, int low, int high, Comparator comparator) {
//        if (low < high) {
//
//            // find pivot element such that
//            // elements smaller than pivot are on the left
//            // elements greater than pivot are on the right
//            int pi = partition(array, low, high, comparator);
//
//            // recursive call on the left of pivot
//            doQuickSort(array, low, pi - 1, comparator);
//
//            // recursive call on the right of pivot
//            doQuickSort(array, pi + 1, high, comparator);
//        }
//    }
//
//    interface Comparator {
//        boolean canDoiChoHayKhong(int o1, int o2);
//    }
//}