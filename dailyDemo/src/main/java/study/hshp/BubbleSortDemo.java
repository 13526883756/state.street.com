package study.hshp;


public class BubbleSortDemo {

    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {12, 43, 22, 11, 67, 88, 67, 3};
        System.out.println(arr.length);
        //将多轮排序使用一个外层循环包裹起来即可
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println("==第" + j + "轮==");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }

        }
        System.out.println();
        System.out.println("==第一轮==");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}