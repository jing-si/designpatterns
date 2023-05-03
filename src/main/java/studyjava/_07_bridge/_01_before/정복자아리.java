package studyjava._07_bridge._01_before;

public class 정복자아리 implements Champion{

    //이런 상황에서 새로운 스킨을 추가 해야 하면 새로운 클래스를 추가 해야 한다.
    //하나의 계층 구조로 다양한 특징들을 표현하려다 보니깐 계층 구조가 커지고
    //비슷한 내용의 코드가 많아진다.


    @Override
    public void move() {
        System.out.println("정복자아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("정복자아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("정복자아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("정복자아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("정복자아리 R");
    }
}
