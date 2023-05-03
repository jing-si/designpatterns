package studyjava._03_abstract_factory._02_after;



public class ShipInventory {

    public static void main(String[] args) {
        //어떤 구현체를 넣어 주느냐에 따라서 틀려짐
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());

        Ship ship = shipFactory.createShip();

    }
}
