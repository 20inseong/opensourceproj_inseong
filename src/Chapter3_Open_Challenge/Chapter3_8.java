import java.util.Scanner;
public class Chapter3_8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?>>");
        int num = scanner.nextInt();
        int arr[];
        arr = new int[num];
        for(int i=0;i < num;i++) {
            while (true) {
                int jud = 0;
                int itg = (int) (Math.random() * 100);
                for (int j = 0; j < i; j++) {
                    if (arr[j] == itg) {
                        jud = 1;
                        break;
                    }
                }
                if (jud == 0) {
                    arr[i] = itg;
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
