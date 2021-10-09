package Chapter5_OC;

abstract class PairMap{
    protected String keyArray[];
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);

    abstract String delete(String key);

    abstract int length();
}

class Dictionary extends PairMap{
    protected int size=0;

    Dictionary(int size){
        super.keyArray=new String[10];
        super.valueArray=new String[10];
        this.size=size;
    }

    @Override
    public String get(String key){
        for(int i=0;i<this.size;i++){
            if(key.equals(super.keyArray[i])){
                return super.valueArray[i];
            }
        }
        return null;
    }

    @Override
    public void put(String key, String value){
        boolean res = true;
        for(int i=0;i<this.size;i++){
            if(key.equals(super.keyArray[i])){
                super.valueArray[i]=value;
                res = false;
                break;
            }
            else if(super.keyArray[i]==null){
                super.keyArray[i] = key;
                super.valueArray[i] = value;
                break;
            }

        }
    }

    @Override
    public String delete(String key){
        int num=0;
        for(int i=0;i<size;i++){
            if(key.equals(super.keyArray[i])){
                keyArray[i]=null;
                valueArray[i]=null;
                num=i;
                break;
            }
        }
        return valueArray[num];
    }

    @Override
    public int length(){
        int count=0;
        for(int i=0; i<this.size; i++) {
            if(super.keyArray[i]!=null)
                count++;
        }
        return count;
    }
}

public class OC_10 {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태","자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "C++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}
