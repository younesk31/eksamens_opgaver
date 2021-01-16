
public class Terning {
    private int terning1;
    private int terning2;

    public void kast() throws Exception {
        Terningspil nytkast = new Terningspil();
        nytkast.terningProdukt();
    }

    public void setTerning1(int terning1) {
        this.terning1 = terning1;
    }
    public void setTerning2(int terning2) {
        this.terning2 = terning2;
    }
    public int getTerning1() {
        return terning1;
    }
    public int getTerning2() {
        return terning2;
    }
}
