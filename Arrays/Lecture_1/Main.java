package Lecture_1;
class ArrayExample {
    void singledimArrays() {
        int[] ages = new int[3]; // ages[0],ages[1],ages[2]
        float[] weights = new float[3];
        String[] names = { "vinod", "garg", "corporation" };

        ages[0] = 31;
        ages[1] = 32;
        ages[2] = 33;
        // ages[5]=45; // out of bounds error
        // ages[-2]=45; // out of bounds error

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        weights[0] = 28.3f;
        weights[1] = 38.3f;
        weights[2] = 48.3f;

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        //Length of an array
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Length of an array");
        System.out.println(" ");
        System.out.println(ages.length);
        System.out.println(weights.length);
        System.out.println(names.length);

        // loop to traverse array

        for (int i = 0 ; i<3 ; i++){
            System.out.println(ages[i]);
        }

        for(int age:ages){
            System.out.println(age);
        }

        int i = 0;
        while (i<3) {
            System.out.println(ages[i]);
            i++;
            
        }

    }

    void multidimArrays() {

        // 2-D Array
        // int[][] arr_1 = new int[5][3];
        int[][] arr = { { 56, 43, 6 }, { 34, 7, 8 }, { 12, 56, 8 } };

        System.out.println(arr[0][0]);// 56
        System.out.println(arr[0][1]);// 43
        System.out.println(arr[0][2]);// 6

        System.out.println(arr[1][0]);// 34
        System.out.println(arr[1][1]);// 7
        System.out.println(arr[1][2]);// 8

        System.out.println(arr[2][0]);// 12
        System.out.println(arr[2][1]);// 56
        System.out.println(arr[2][2]);// 8

        // 3-D Array
        int[][][] arr_3d = new int[5][3][2];//5*3*2=30

        for(int i = 0 ; i<2;i++){
            for(int j = 0; j<3;j++){
                System.out.println(arr[i][j]);
            }
        }

        // loop using length function
         for(int i = 0 ; i<arr.length;i++){
            //arr[0] and arr[1]
            for(int j = 0; j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        // obj.singledimArrays();
        // obj.multidimArrays();
    }

}