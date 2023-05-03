package studyjava._03_abstract_factory._02_after;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
