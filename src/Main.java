/*
@ Shkarin Konstantin
*/
public class Main {
    public static void main(String[] args) {
        invertArray();
        System.out.println(" ");
        fillArray();
        System.out.println(" ");
        changeArray();
        System.out.println(" ");
        fullDiagonal();
    }

    public static void invertArray() {
        int[] arr = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }

    }
    public static void fillArray(){
        int[] arr = new int[8];
        for(int i=0; i<arr.length;i++){
            arr[i] = i*3;
            System.out.println("arr["+i+"] = "+ arr[i]);
    }
}

public static void changeArray(){
    int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
    for(int i=0; i<arr.length;i++){
        if (arr[i]<6){
            arr[i]*=2;
        }
        System.out.println(arr[i]);
    }
}

public static void fullDiagonal(){
    int[][] arr = new int[3][3];
    for(int i=0; i<arr.length;i++){
        for(int j=0; j<arr[i].length;j++){
            if(i==j){
               arr[i][j] = 1;
            } else arr[i][j] = 0;
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println("  ");
        }
    }
}

