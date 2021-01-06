public class Main {
    public static void main(String[]args){
        SplashScreen ss = new SplashScreen();
        try{
            Thread.sleep(5000);
            ss.dispose();
        } catch (Exception e){
            e.printStackTrace();
        }
        new Menu_v2();
    } 
}
