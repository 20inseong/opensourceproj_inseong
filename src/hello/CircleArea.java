package hello;

public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.14; //원주율 상수로 정의
		
		double radius = 10.0; //반지름 정의
		double circleArea = radius*radius*PI; //원면적 계산
		System.out.println("원의 면적 = " + circleArea); //화면출력
	}
}
