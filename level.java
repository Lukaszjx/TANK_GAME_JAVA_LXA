
public class level {
	 Player player= new Player(150,50);
     GameObjects.creatInstance(player);
     
     Basement B = new Basement(450,50);
     
     WoodCrate wood1 = new WoodCrate(300,50);
     WoodCrate wood2 = new WoodCrate(600,50);
     WoodCrate wood3 = new WoodCrate(450,150);
     WoodCrate wood4 = new WoodCrate(300,150);
     WoodCrate wood5 = new WoodCrate(600,150);
    
    MetalCrate metal1 = new MetalCrate(150,750);
    MetalCrate metal2 = new MetalCrate(450,650);
    MetalCrate metal3 = new MetalCrate(250,450);
    MetalCrate metal4 = new MetalCrate(550,450);
    MetalCrate metal5 = new MetalCrate(750,350);
     
     NormalBot tR1 = new NormalBot(350,850);
     NormalBot tR2 = new NormalBot(650,850);
     NormalBot tR3 = new NormalBot(850,550);
     NormalBot tR4 = new NormalBot(100,600);
     
     
     
     GameObjects.getInstance().addBase(B);
     
     GameObjects.getInstance().addBot(tR1);
     GameObjects.getInstance().addBot(tR2);
     GameObjects.getInstance().addBot(tR3);
     GameObjects.getInstance().addBot(tR4);
     
     GameObjects.getInstance().addObs(wood1);
     GameObjects.getInstance().addObs(wood2);
     GameObjects.getInstance().addObs(wood3);
     GameObjects.getInstance().addObs(wood4);
     GameObjects.getInstance().addObs(wood5);
     
     GameObjects.getInstance().addObs(metal1);
     GameObjects.getInstance().addObs(metal2);
     GameObjects.getInstance().addObs(metal3);
     GameObjects.getInstance().addObs(metal4);
     GameObjects.getInstance().addObs(metal5);

      }
