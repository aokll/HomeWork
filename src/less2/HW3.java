package less2;
/*Написать функцию,
возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.*/
public class HW3 {
    public boolean  elementArr(int[][] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        if (arr[i + 1][j] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                        if (arr[i + 1][j + 1] == 0){return true;}
                    } else if (i != 0 && j == 0) {
                        if (arr[i - 1][j] == 0){return true;}
                        if (arr[i - 1][j + 1] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                        if (arr[i + 1][j + 1] == 0){return true;}
                        if (arr[i + 1][j] == 0){return true;}
                    } else if (i == arr[0].length && j == 0) {
                        if (arr[i - 1][j] == 0){return true;}
                        if (arr[i - 1][j + 1] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                    } else if (i == arr[0].length && j != 0) {
                        if (arr[i][j -1] == 0){return true;}
                        if (arr[i - 1][j - 1] == 0){return true;}
                        if (arr[i - 1][j] == 0){return true;}
                        if (arr[i - 1][j + 1] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                    } else if (i == arr[0].length && j == arr.length) {
                        if (arr[i][j - 1] == 0){return true;}
                        if (arr[i - 1][j - 1] == 0){return true;}
                        if (arr[i - 1][j] == 0){return true;}
                    } else if (i != 0 && j == arr.length) {
                        if (arr[i - 1][j] == 0){return true;}
                        if (arr[i - 1][j - 1] == 0){return true;}
                        if (arr[i][j - 1] == 0){return true;}
                        if (arr[i + 1][j - 1] == 0){return true;}
                        if (arr[i + 1][j] == 0){return true;}
                    } else if (i == 0 && j == arr.length) {
                        if (arr[i][j - 1] == 0){return true;}
                        if (arr[i + 1][j - 1] == 0){return true;}
                        if (arr[i + 1][j] == 0){return true;}
                    } else if (i == 0 && j != 0) {
                        if (arr[i][j - 1] == 0){return true;}
                        if (arr[i + 1][j - 1] == 0){return true;}
                        if (arr[i + 1][j] == 0){return true;}
                        if (arr[i + 1][j + 1] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                    } else if (i != 0 && j != 0) {
                        if (arr[i - 1][j - 1] == 0){return true;}
                        if (arr[i][j - 1] == 0){return true;}
                        if (arr[i + 1][j - 1] == 0){return true;}
                        if (arr[i + 1][j] == 0){return true;}
                        if (arr[i + 1][j + 1] == 0){return true;}
                        if (arr[i][j + 1] == 0){return true;}
                        if (arr[i - 1][j + 1] == 0){return true;}
                        if (arr[i - 1][j] == 0){return true;}
                    }
                }

            }
        }
        return flag;
    }
}
