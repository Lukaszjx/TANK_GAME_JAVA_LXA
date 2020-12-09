package Characters;

public enum Speed {
    LOW(100), NORMAL(50), FAST(30);
    private int delta;
    private Speed(int x){
        delta = x;
    }
    public int getDelta(){
        return delta;
    }
    
}
