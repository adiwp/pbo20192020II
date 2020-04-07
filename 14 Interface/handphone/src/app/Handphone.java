package app;

public interface Handphone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void nyalakan();
    void matikan();
    void besarkanSuara();
    void kecilkanSuara();
}