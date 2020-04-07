package app;

public class PenggunaHP {
    private Handphone phone;

    public PenggunaHP(Handphone phone) {
        this.phone = phone;
    }
    
    void nyalakanHP(){
        this.phone.nyalakan();
    }
    
    void matikanHP(){
        this.phone.matikan();
    }
    
    void besarkanSuaraHP(){
        this.phone.besarkanSuara();
    }
    
    void kecilkanSuaraHP(){
        this.phone.kecilkanSuara();
    }
}