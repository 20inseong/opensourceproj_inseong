package Chapter4;
import java.util.Scanner;

class Grade{
    private int Math;
    private int Sci;
    private int Eng;

    public Grade(int Math, int Sci, int Eng){
        this.Math = Math;
        this.Sci = Sci;
        this.Eng = Eng;
    }

    public int Average(){
        return (Math+Sci+Eng)/3;
    }
}

public class OC4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수학, 과학 영어 순으로 3개의 점수 입력>>");
        int math = sc.nextInt();
        int sci = sc.nextInt();
        int eng = sc.nextInt();
        Grade grade = new Grade(math, sci, eng);
        System.out.println("평균은 " + grade.Average());

        sc.close();
    }
}
