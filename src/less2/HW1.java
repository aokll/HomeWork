package less2;
/*Написать метод, возвращающий количество чётных
 элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0*/
public class HW1 {
public void evenElements(int[] arr){
    int j = 0;
    int[] res = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]%2==0){
            res[j] = arr[i];
            j++;
        }
    }
    print(res);
}
public void print(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

}
