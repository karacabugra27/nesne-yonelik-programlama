class Ucgen extends Sekil {
    int h;
    int altTaban;
    int alan;

    public Ucgen(String renk, int h, int altTaban) {
        super(renk);
        this.h = h;
        this.altTaban = altTaban;
    }

    @Override
    public int alanHesap() {
        alan = (h * altTaban) / 2;
        return alan;
    }

    @Override
    void print() {
        System.out.println("Alan : " + alan);
    }

}
