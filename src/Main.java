import less2.HW1;
import less2.HW2;
import less2.HW3;

public class Main {
    public static void main(String[] args) {
        HW1 hw1 = new HW1();
        //hw1.evenElements(new int[]{1,3,4,5,2,5,5,5,5});

        HW2 hw2 = new HW2();
        //System.out.println(hw2.min(new int[][]{{1,3,1,4,5},{56,57,100,-1,2},{12,13,14,145,0}}));

        HW3 hw3 = new HW3();
        System.out.println(hw3.elementArr(new int[][]{
                {4,6,7,2,0},
                {3,4,5,0,7},
                {1,1,2,2,2},
                {1,1,1,1,1},
                {1,1,1,1,1}}));
    }
}