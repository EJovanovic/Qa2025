package domaci4;

public enum TipNapitaka {
    ESSPRESO(150),
    KAPUCINO(200),
    LATTE(220),
    CAJ(120);

    private int osnovnaCena;

    TipNapitaka(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    private int getCena(){
            return osnovnaCena;
        }
        private double cenaSaPopustom(double procenat){
        return osnovnaCena-(osnovnaCena*(procenat/100));

    }
}
