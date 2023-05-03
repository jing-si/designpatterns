package studyjava._03_abstract_factory._02_after;

public interface ShipFactory {

    //하던 일 정리
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);

        //배를 만드는 공정만 재정의 할 수 있도록 만들어 둠
        Ship ship = createShip();

        sendEmailTo(email,ship);
        return ship;
    }

    Ship createShip();

    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }
    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
