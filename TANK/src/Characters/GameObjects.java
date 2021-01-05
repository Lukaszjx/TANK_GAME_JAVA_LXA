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
            for (Bullet bullet: bot.getBullets())
                    bullet.draw(g);
        }
        for (Bullet bullet: player.getBullets())
            bullet.draw(g);
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

    public void bulletCollision() {
        // bullet of player hit others
        ArrayList<Bullet> removeBullets = new ArrayList<Bullet>();
        ArrayList<Bot> removeBots = new ArrayList<Bot>();
        ArrayList<Obstacles> removeObs = new ArrayList<Obstacles>();
        ArrayList<Bullet> list = player.getBullets();
        for (Bullet i: list) 
        {
            for (Bot b: bots) 
                if (i.isHit(b)) 
                {
                    removeBullets.add(i);
                    System.out.println(i.getDamage());
                    b.setHp(b.getHp() - i.getDamage());
                    if (b.getHp() < 1) removeBots.add(b);
                }
            for (Obstacles ob: obs) 
                if (i.isHit(ob))
                {
                    if (!removeBullets.contains(i)) removeBullets.add(i);
                    ob.setHp(ob.getHp() - i.getDamage());
                    if (ob.getHp() < 1) removeObs.add(ob);
                }
        }

        bots.removeAll(removeBots);
        obs.removeAll(removeObs);
        list.removeAll(removeBullets);
        player.setBullets(list);

        removeBots.clear();
        removeObs.clear();
        removeBullets.clear();


        // bullet of bots hit others


        for (Bot b: bots)
        {
            list = b.getBullets();
            for (Bullet i: list) 
            {
                if (i.isHit(player))
                {
                    removeBullets.add(i);
                    player.setHp(player.getHp() - i.getDamage());
                    if (player.getHp() < 1) System.exit(0);
                }
                for (Obstacles ob: obs) 
                    if (i.isHit(ob))
                    {
                        if (!removeBullets.contains(i)) removeBullets.add(i);
                        ob.setHp(ob.getHp() - i.getDamage());
                        if (ob.getHp() < 1) removeObs.add(ob);
                    }
            }
            obs.removeAll(removeObs);
            list.removeAll(removeBullets);
            b.setBullets(list);
    
            removeObs.clear();
            removeBullets.clear();
    
        }

        
    }

}
