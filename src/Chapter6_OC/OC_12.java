package Chapter6_OC;

import java.util.Scanner;

class Person_12{
    private String name;

    public Person_12(String name){
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

public class OC_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt();
        boolean res=true;
        Person_12 [] p = new Person_12[num];
        for(int i=0;i<num;i++){
            System.out.print((i+1)+"번째 선수 이름>>");
            String name = sc.next();
            p[i] = new Person_12(name);
        }

        while(res){
            for(int i=0;i<num;i++)
                res = p[i].game();
            if(res == false)
                break;
        }
    }
}
