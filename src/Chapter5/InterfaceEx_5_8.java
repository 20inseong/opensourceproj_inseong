package Chapter5;

interface PhoneInterface{
    final int TIMTEOUT = 10000;
    void sendCall();
    void receiveCall();
    default void pirntLogo(){
        System.out.println("** Phone **");
    }
}
class SamsungPhone implements PhoneInterface{
    @Override
    public void sendCall(){
        System.out.println("띠리리리링");
    }
    @Override
    public void receiveCall(){
        System.out.println("전화가 왔습니다.");
    }
    public void flash() {
        System.out.println("전화기에 불이 켜졌습니다.");
    }
}
public class InterfaceEx_5_8 {
    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.pirntLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
    }
}
