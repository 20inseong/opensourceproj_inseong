public class Chapter3_10 {
    public static void main(String[] args){
        int arr[][] ={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int count = 0;
        int i, j;
        while(count < 8){
            i = (int) (Math.random() * 4);
            j = (int) (Math.random() * 4);
            if(arr[i][j] == 0){
                arr[i][j] = (int) (Math.random() * 10 + 1);
                count++;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.printf("%2d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
