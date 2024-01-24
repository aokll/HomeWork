package less2;
/*Написать функцию,
возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.*/
public class HW2 {
    public int min(int[][] arr){
        int bufMin = arr[0][0];
        int bufMax = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > bufMax){
                    bufMax = arr[i][j];
                }
                if (arr[i][j] < bufMin){
                    bufMin = arr[i][j];
                }


            }
        }
        return bufMax - bufMin;
    }

    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
