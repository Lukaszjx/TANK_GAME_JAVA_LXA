package Characters;

import java.util.ArrayList;

import Characters.BotTanks.Bot;
import Characters.Bullet.Bullet;
import Characters.PlayerTank.Player;
import Characters.Props.Obstacles;
import java.awt.Graphics;

public class GameObjects {
    private ArrayList<Bot> bots;
    private ArrayList<Obstacles> obs;
    private Player player;
    private static GameObjects instance = null;

    private GameObjects() {
        bots = new ArrayList<Bot>();
        obs = new ArrayList<Obstacles>();

    }

    public static GameObjects getInstance() {
        return instance;
    }
    public static GameObjects createInstance(Player player){
        if (getInstance() == null)
        {
            instance = new GameObjects();
            instance.player = player;
        }
        return instance;
    }

    public void addBot(Bot b){
        instance.bots.add(b);
    }
    public void removeBot(Bot b){
        instance.bots.remove(b);
    }
    public void addObs(Obstacles o){
        instance.obs.add(o);
    }
    public void removeObs(Obstacles o){
        instance.obs.remove(o);
    } 

    public void drawBots(Graphics g){
        for (Bot b: bots)
            b.draw(g);
    }
    public void drawObs(Graphics g){
        for (Obstacles o: obs){
            o.draw(g);
        }
    }

    public void drawBullets(Graphics g){
        for (Bot bot: bots)
        {
            //System.out.println(bot.getBullets());
            for (Bullet bullet: bot.getBullets())
                    bullet.draw(g);
        }
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<Obstacles> getObs() {
        return obs;
    }

    public ArrayList<Bot> getBots() {
        return bots;
    }

}
