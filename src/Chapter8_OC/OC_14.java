package Chapter8_OC;
import java.io.*;
import java.util.*;
public class OC_14 {
    private File currentDir = null;
    private File subFiles [] = null;

    public OC_14(String dirName) {
        currentDir = new File(dirName);
    }

    private void showSubDirtories() {
        System.out.println("\t[" + currentDir.getPath() + "]");
        subFiles = currentDir.listFiles();
        for(File f : subFiles) {
            System.out.print(((f.isFile())?"file":"dir"));
            System.out.printf("%-15s", "\t\t" + f.length() + "바이트");
            System.out.println("\t\t" + f.getName());
        }
    }

    private boolean contains(String filename) {
        for(File f : subFiles) {
            if(f.getName().equalsIgnoreCase(filename))
                return true;
        }
        return false;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st;
        System.out.println("***** 파일 탐색기입니다. *****");
        showSubDirtories();

        while(true) {
            System.out.print(">>");
            st = new StringTokenizer(scanner.nextLine().trim(), " ");
            String command = st.nextToken();
            if(command.equals("그만"))
                break;
            if(command.equals("..")) {
                String s = currentDir.getParent();
                if(s == null)
                    continue;
                else {
                    currentDir = new File(currentDir.getParent());
                    showSubDirtories();
                }
            }
            else if(command.equals("rename")){
                try{
                    String src = st.nextToken();
                    String dst = st.nextToken();
                    File f = new File(currentDir.getPath() + "\\" + src);
                    if(!f.exists()){
                        System.out.println("존재 하지 않는 파일입니다.");
                    }
                    else{
                        f.renameTo(new File(currentDir.getPath() + "\\" + dst));
                        System.out.println(src + "를 " + dst + "로 이름을 변경하였습니다.");
                    }
                    showSubDirtories();
                }catch(NoSuchElementException e){
                    //e.printStackTrace();
                    System.out.println("두 개의 파일명이 주어지지 않았습니다!");
                }
            }
            else if(command.equals("mkdir")){
                String dirName = st.nextToken();
                File f = new File(currentDir.getPath() + "\\" + dirName);
                if(!f.exists()){
                    f.mkdir();
                    System.out.println(dirName + " 디렉터리를 생성하였습니다.");
                }
                showSubDirtories();
            }
            else {
                if(contains(command)) {
                    if(new File(currentDir, command).isDirectory()) {
                        currentDir = new File(currentDir, command);
                        showSubDirtories();
                    }
                    else {
                        System.out.println("\t디렉터리가 아닙니다.!");
                    }
                }
            }
        }
        scanner.close();
    }
    public static void main(String[] args) {
        OC_14 fe = new OC_14("c:\\");
        fe.run();
    }
}
