package studyjava._03_abstract_factory._02_after;


public class WhiteshipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    //어떤 객체를 받느냐에 따라서 생성되는 것이 틀려짐
    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();

        //구체적인 클래스 파일을 직접 사용하고 는 것을 펙로리로 변경
        //ship.setAnchor(new WhiteAnchor());
        //ship.setWheel(new WhiteWheel());

        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
