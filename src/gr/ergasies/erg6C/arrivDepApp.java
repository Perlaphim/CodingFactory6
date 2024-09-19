package gr.ergasies.erg6C;

public class arrivDepApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int carNum;

        int[][] carT = arrDep(arr);
        for (int i = 0; i < carT.length; i++) {
            for (int j = 0; j < carT[i].length; j++) {
                if (j==1) {
                    System.out.print(carT[i][j] + " \n");
                } else {
                    System.out.print(carT[i][j] + " ");
                }
            }
        }
        System.out.println("The max number of cars was: " + count(carT));;
    }

    public static int[][] arrDep(int[][] arr) {
        int[][] arrDep = new int[arr.length*2][arr[0].length];
        int y = 0;
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==1) {
                    arrDep[y][1] = 1;
                } else if (j==0) {
                    arrDep[y][1] = 0;
                }
                arrDep[y][0] = arr[i][j];
                y++;
            }
        }
        sort(arrDep);
        return arrDep;
    }

    public static void sort(int[][] arrDev) {
        for (int j = 0; j < arrDev.length-1; j++) {
            for (int i = 0; i < arrDev.length-1-j; i++) {
                if (arrDev[i][0] > arrDev[i+1][0]) {
                    swap(arrDev,i,i+1);
                }
            }
        }
        return;
    }

    public static void swap(int[][] arr, int a, int b) {
        int[] tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        return;
    }

    public static int count(int[][] arr) {
        int maxCar = 1;
        int numCar = 1;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][1] == 0 && arr[i+1][1] == 0) {
                    numCar++;
                    maxCar = Math.max(maxCar, numCar);
                } else {
                    numCar = 1;
                }
        }

        return maxCar;
    }
}