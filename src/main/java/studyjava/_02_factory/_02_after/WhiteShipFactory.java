package studyjava._02_factory._02_after;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        //추가 적인 화이트 쉽 공정이 추가 될 수도 있어.
        return new WhiteShip();
    }
}
