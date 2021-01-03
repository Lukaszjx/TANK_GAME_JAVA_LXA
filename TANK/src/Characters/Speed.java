package Characters;

public enum Speed {
    //higer figure -> slower
    LOW(150), NORMAL(90), FAST(30);
    private int delta;
    private Speed(int x){
        delta = x;
    }
    public int getDelta(){
        return delta;
    }
    
}
