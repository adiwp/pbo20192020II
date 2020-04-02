package app;

class Mesin {
    private final TipeMesin tipeMesin;
    
    public Mesin(TipeMesin tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public TipeMesin getTipeMesin() {
        return this.tipeMesin;
    }
}