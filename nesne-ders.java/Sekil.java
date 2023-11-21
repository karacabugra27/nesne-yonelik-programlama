abstract class Sekil {
        String renk;
    
    
        public Sekil(String renk) {
            this.renk = renk;
            System.out.println("Rengi : " + renk);
        }
    
        abstract int alanHesap();
        abstract void print();
    
}
