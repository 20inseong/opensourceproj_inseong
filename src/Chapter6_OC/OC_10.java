package Chapter6_OC;
import java.util.Scanner;
class Person_10{
    private String name;

    public Person_10(String name){
        this.name = name;
    }

    public boolean game(){
        Scanner sc = new Scanner(System.in);
        int [] res = new int[3];

        System.out.print("["+name+"]:<Enter>");
        String enter = sc.nextLine();
        for(int i=0;i<res.length;i++){
            res[i] = (int)(Math.random()*3+1);
        }
        if(res[0]==res[1] && res[1]==res[2]){
            System.out.println("\t"+res[0]+"   "+res[1]+"   "+res[2]+"   "+name+"님이 이겼습니다!");
            return false;
        }
        else{
            System.out.println("\t"+res[0]+"   "+res[1]+"   "+res[2]+"   아쉽군요!");
            return true;
        }
    }
}

public class OC_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1,name2;
        boolean res=true;
        System.out.print("1번째 선수 이름>>");
        name1 = sc.next();
        System.out.print("2번째 선수 이름>>");
        name2 = sc.next();
        Person_10 p1 = new Person_10(name1);
        Person_10 p2 = new Person_10(name2);

        while(res){
            res = p1.game();
            res = p2.game();
        }
    }
}
