package studyjava._07_bridge._02_after;

import javax.swing.plaf.PanelUI;

public class DefaultChampion implements Champion{
    //이런식으로 만들면 스킨과 상관없이 챔피언을 늘릴 수 있다.

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move/n",skin.getName(),this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q/n",skin.getName(),this.name);
    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W/n",skin.getName(),this.name);
    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E/n",skin.getName(),this.name);
    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R/n",skin.getName(),this.name);
    }
}
