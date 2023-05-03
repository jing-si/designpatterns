package studyjava._02_factory._02_after;

public class Client {
    //의존성 주입을 이용하여 Client 코드도 변경되지 않도록 고정 시킬 수 있다.

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "Whiteship", "keesun@mail.com");
        client.print(new BlackShipFactory(),"Blackship", "keesun@mail.com");

    }

    //이런 식으로 메서드를 하나 빼서 Client 코드도 변경이 되지 않도록 고정 시킬 수 있다.
    //이것도 일종의
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name,email));
    }


}
