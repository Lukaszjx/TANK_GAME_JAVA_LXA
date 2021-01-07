package GUI;

import Characters.*;
import Characters.Base.Base;
import Characters.BotTanks.NormalBot;
import Characters.PlayerTank.*;
import Characters.Props.MetalCrate;
import Characters.Props.WoodCrate;
public class level2 {
    public static void upload() {
                //Adding player
                Player player = new Player(430, 700);
                
                // Adding Base
                Base base = new Base(444, 785);

                GameObjects.createInstance(player, base);
        
                // NormalBot bot1 = new NormalBot(0,0);
                // NormalBot bot2 = new NormalBot(750,0);
                // NormalBot bot3 = new NormalBot(482, 0);
                // NormalBot bot4 = new 
                // GameObjects.getInstance().addBot(bot1);
                // GameObjects.getInstance().addBot(bot2);
                // GameObjects.getInstance().addBot(bot3);
        
                //Adding metalcrate surrond the base
                MetalCrate metal = new MetalCrate(362,750);
                MetalCrate metal0 = new MetalCrate(391,750);
                MetalCrate metal1 = new MetalCrate(420,750);
                MetalCrate metal2 = new MetalCrate(449,750);
                MetalCrate metal3 = new MetalCrate(478,750);
                MetalCrate metal4 = new MetalCrate(507,750);
                MetalCrate metal5 = new MetalCrate(536,750);
        
                MetalCrate metal6 = new MetalCrate(362,779);
                MetalCrate metal7 = new MetalCrate(362,808);
                MetalCrate metal8 = new MetalCrate(362,837);
        
                MetalCrate metal9 = new MetalCrate(536,779);
                MetalCrate metal10 = new MetalCrate(536,808);
                MetalCrate metal11= new MetalCrate(536,837);
                
                GameObjects.getInstance().addObs(metal);
                GameObjects.getInstance().addObs(metal0);
                GameObjects.getInstance().addObs(metal1);
                GameObjects.getInstance().addObs(metal2);
                GameObjects.getInstance().addObs(metal3);
                GameObjects.getInstance().addObs(metal4);
                GameObjects.getInstance().addObs(metal5);
                GameObjects.getInstance().addObs(metal6);
                GameObjects.getInstance().addObs(metal7);
                GameObjects.getInstance().addObs(metal8);
                GameObjects.getInstance().addObs(metal9);
                GameObjects.getInstance().addObs(metal10);
                GameObjects.getInstance().addObs(metal11);
        
            
                //29 unit different
                //Base should be in the middle with the heigt and width different 29 unit
        
                //Adding Woodcrate to the left of the base
                WoodCrate wood1=  new WoodCrate(236,808);
                WoodCrate wood2 = new WoodCrate(236,779);
                WoodCrate wood3 = new WoodCrate(236,750);
                WoodCrate wood4= new WoodCrate(236, 721);
                WoodCrate wood5= new WoodCrate(236,692);
                WoodCrate wood6 = new WoodCrate(236,663);
        
                GameObjects.getInstance().addObs(wood1);
                GameObjects.getInstance().addObs(wood2);
                GameObjects.getInstance().addObs(wood3);
                GameObjects.getInstance().addObs(wood4);
                GameObjects.getInstance().addObs(wood5);
                GameObjects.getInstance().addObs(wood6);
        
                WoodCrate wood7 = new WoodCrate(120,808);
                WoodCrate wood8 = new WoodCrate(120,779);
                WoodCrate wood9 = new WoodCrate(120,750);
                WoodCrate wood10 = new WoodCrate(120,721);
                WoodCrate wood11 = new WoodCrate(120,692);
                WoodCrate wood12 = new WoodCrate(120,663);
        
                GameObjects.getInstance().addObs(wood7);
                GameObjects.getInstance().addObs(wood8);
                GameObjects.getInstance().addObs(wood9);
                GameObjects.getInstance().addObs(wood10);
                GameObjects.getInstance().addObs(wood11);
                GameObjects.getInstance().addObs(wood12);
        
                //Adding Woodcrate to the right of the base
                WoodCrate wood13 = new WoodCrate(652,808);
                WoodCrate wood14 = new WoodCrate(652, 779);
                WoodCrate wood15 = new WoodCrate(652,750);
                WoodCrate wood16 = new WoodCrate(652,721);
                WoodCrate wood17 = new WoodCrate(652,692);
                WoodCrate wood18 = new WoodCrate(652,663);
        
                GameObjects.getInstance().addObs(wood13);
                GameObjects.getInstance().addObs(wood14);
                GameObjects.getInstance().addObs(wood15);
                GameObjects.getInstance().addObs(wood16);
                GameObjects.getInstance().addObs(wood17);
                GameObjects.getInstance().addObs(wood18);
        
                WoodCrate wood19 = new WoodCrate(768, 808);
                WoodCrate wood20 = new WoodCrate(768, 779);
                WoodCrate wood21 = new WoodCrate(768,750);
                WoodCrate wood22 = new WoodCrate(768, 721);
                WoodCrate wood23 = new WoodCrate(768, 692);
                WoodCrate wood24 = new WoodCrate(768, 663);
        
                GameObjects.getInstance().addObs(wood19);
                GameObjects.getInstance().addObs(wood20);
                GameObjects.getInstance().addObs(wood21);
                GameObjects.getInstance().addObs(wood22);
                GameObjects.getInstance().addObs(wood23);
                GameObjects.getInstance().addObs(wood24);
        
                //Adding walls to the right ayy
                WoodCrate wall1 = new WoodCrate(600,576);
                WoodCrate wall2 = new WoodCrate(629,576);
                WoodCrate wall3 = new WoodCrate(658,576);
                WoodCrate wall4 = new WoodCrate(687,576);
                WoodCrate wall5 = new WoodCrate(716,576);
                WoodCrate wall6 =new WoodCrate(745,576);
                WoodCrate wall7= new WoodCrate(774,576);
                WoodCrate wall8 = new WoodCrate(803,576);
        
                GameObjects.getInstance().addObs(wall1);
                GameObjects.getInstance().addObs(wall2);
                GameObjects.getInstance().addObs(wall3);
                GameObjects.getInstance().addObs(wall4);
                GameObjects.getInstance().addObs(wall5);
                GameObjects.getInstance().addObs(wall6);
                GameObjects.getInstance().addObs(wall7);
                GameObjects.getInstance().addObs(wall8);
        
                //Adiing more walls to the left ayy
                WoodCrate wall9 = new WoodCrate(280,580);
                WoodCrate wall10 = new WoodCrate(251,580);
                WoodCrate wall11 = new WoodCrate(222,580);
                WoodCrate wall12 = new WoodCrate(193,580);
                WoodCrate wall13 = new WoodCrate(164,580);
                WoodCrate wall14 = new WoodCrate(135,580);
                WoodCrate wall15 =new WoodCrate(106,580);
                WoodCrate wall16 = new WoodCrate(77,580);
        
                GameObjects.getInstance().addObs(wall9);
                GameObjects.getInstance().addObs(wall10);
                GameObjects.getInstance().addObs(wall11);
                GameObjects.getInstance().addObs(wall12);
                GameObjects.getInstance().addObs(wall13);
                GameObjects.getInstance().addObs(wall14);
                GameObjects.getInstance().addObs(wall15);
                GameObjects.getInstance().addObs(wall16);
        
                //Adding right side wall
                MetalCrate side1 = new MetalCrate(0,400);
                MetalCrate side2 = new MetalCrate(0,429);
                WoodCrate side3= new WoodCrate(29, 400);
                WoodCrate side4 = new WoodCrate(29,429);
            
                GameObjects.getInstance().addObs(side1);
                GameObjects.getInstance().addObs(side2);
                GameObjects.getInstance().addObs(side3);
                GameObjects.getInstance().addObs(side4);
                
                //Adding left side walls
                MetalCrate side5 = new MetalCrate(870,400);
                MetalCrate side6 = new MetalCrate(870,429);
                WoodCrate side7 = new WoodCrate(841,400);
                WoodCrate side8 = new WoodCrate(841,429);
                
                GameObjects.getInstance().addObs(side5);
                GameObjects.getInstance().addObs(side6);
                GameObjects.getInstance().addObs(side7);
                GameObjects.getInstance().addObs(side8);
        
                //Adding Barrel but it's wall opposite (on the left)
                WoodCrate barrel1 = new WoodCrate(600,220);
                WoodCrate barrel2 =new WoodCrate(629,220);
                WoodCrate barrel3 = new WoodCrate(658,220);
                WoodCrate barrel4 = new WoodCrate(687,220);
                WoodCrate barrel5 = new WoodCrate(716,220);
                WoodCrate barrel6 = new WoodCrate(745,220);
                WoodCrate barrel7 = new WoodCrate(774,220);
                WoodCrate barrel8= new WoodCrate(803,220);
        
                GameObjects.getInstance().addObs(barrel1);
                GameObjects.getInstance().addObs(barrel2);
                GameObjects.getInstance().addObs(barrel3);
                GameObjects.getInstance().addObs(barrel4);
                GameObjects.getInstance().addObs(barrel5);
                GameObjects.getInstance().addObs(barrel6);
                GameObjects.getInstance().addObs(barrel7);
                GameObjects.getInstance().addObs(barrel8);
        
                //Adding Barrel but it's wall opposite (on the right)
                WoodCrate barrel9 = new WoodCrate(280,220);
                WoodCrate barrel10 = new WoodCrate(251,220);
                WoodCrate barrel11 = new WoodCrate(222,220);
                WoodCrate barrel12 = new WoodCrate(193,220);
                WoodCrate barrel13 = new WoodCrate(164,220);
                WoodCrate barrel14 = new WoodCrate(135, 220);
                WoodCrate barrel15 = new WoodCrate(106,220);
                WoodCrate barrel16 =new WoodCrate(77,220);
        
                GameObjects.getInstance().addObs(barrel9);
                GameObjects.getInstance().addObs(barrel10);
                GameObjects.getInstance().addObs(barrel11);
                GameObjects.getInstance().addObs(barrel12);
                GameObjects.getInstance().addObs(barrel13);
                GameObjects.getInstance().addObs(barrel14);
                GameObjects.getInstance().addObs(barrel15);
                GameObjects.getInstance().addObs(barrel16);
        
                //Adding more woods to the opposite of the base(on the left)
                WoodCrate wood25 = new WoodCrate(236,140);
                WoodCrate wood26 = new WoodCrate(236,111);
                WoodCrate wood27 = new WoodCrate(236,82);
                WoodCrate wood29 = new WoodCrate(207,82);
                WoodCrate wood30 = new WoodCrate(207,111);
        
                WoodCrate wood31 = new WoodCrate(120,140);
                WoodCrate wood32 = new WoodCrate(120,111);
                WoodCrate wood33 = new WoodCrate(120,82);
        
        
                GameObjects.getInstance().addObs(wood25);
                GameObjects.getInstance().addObs(wood26);
                GameObjects.getInstance().addObs(wood27);
                GameObjects.getInstance().addObs(wood29);
                GameObjects.getInstance().addObs(wood30);
                GameObjects.getInstance().addObs(wood31);
                GameObjects.getInstance().addObs(wood32);
                GameObjects.getInstance().addObs(wood33);
        
                //Adding more woods to the opposite(on the right)
                WoodCrate wood35 = new WoodCrate(650,140);
                WoodCrate wood36 = new WoodCrate(650,111);
                WoodCrate wood37 = new WoodCrate(650,82);
                WoodCrate wood39 = new WoodCrate(679,82);
                WoodCrate wood40 = new WoodCrate(679,111);
        
                WoodCrate wood41 = new WoodCrate(766,140);
                WoodCrate wood42 = new WoodCrate(766,111);
                WoodCrate wood43 = new WoodCrate(766,82);
        
                GameObjects.getInstance().addObs(wood35);
                GameObjects.getInstance().addObs(wood36);
                GameObjects.getInstance().addObs(wood37);
                GameObjects.getInstance().addObs(wood39);
                GameObjects.getInstance().addObs(wood40);
                GameObjects.getInstance().addObs(wood41);
                GameObjects.getInstance().addObs(wood42);
                GameObjects.getInstance().addObs(wood43);
        
                //ADDING CENTER OBS
                MetalCrate center1 = new MetalCrate(221, 400);
                MetalCrate center2 = new MetalCrate(250,400);
                WoodCrate center3 = new WoodCrate(221, 429);
                WoodCrate center4 = new WoodCrate(250,429);
        
                WoodCrate center5 = new WoodCrate(279,400);
                WoodCrate center6 = new WoodCrate(279,429);
                WoodCrate center7 = new WoodCrate(308,400);
                WoodCrate center8 = new WoodCrate(308,429);
                WoodCrate center9 = new WoodCrate(337,400);
                WoodCrate center10 = new WoodCrate(337, 429);
                
                WoodCrate center11 =new WoodCrate(337,371);
                WoodCrate center12 = new WoodCrate(337,342);
                WoodCrate center13 = new WoodCrate(337,313);
        
                WoodCrate center14 = new WoodCrate(366,371);
                WoodCrate center15= new WoodCrate(366,342);
                WoodCrate center16 = new WoodCrate(366,313);
        
                WoodCrate center17 = new WoodCrate(366,400);
                WoodCrate center18 = new WoodCrate(366,429);
                MetalCrate center19 = new MetalCrate(395,400);
                MetalCrate center20 = new MetalCrate(395, 429);
                MetalCrate center21 = new MetalCrate(424,400);
                MetalCrate center22 = new MetalCrate(424,429);
                MetalCrate center23 = new MetalCrate(453,400);
                MetalCrate center24 = new MetalCrate(453, 429);
                WoodCrate center25 = new WoodCrate(482, 400);
                WoodCrate center26 = new WoodCrate(482,429);
                MetalCrate center27 = new MetalCrate(511,400);
                MetalCrate center28 = new MetalCrate(511,429);
                MetalCrate center29 = new MetalCrate(540,400);
                MetalCrate center30 = new MetalCrate (540,429);
                MetalCrate center31 = new MetalCrate(569,400);
                MetalCrate center32 = new MetalCrate(569,429);
                WoodCrate center33 = new WoodCrate(598,400);
                WoodCrate center34 = new WoodCrate(598,429);
                WoodCrate center35 = new WoodCrate(627,400);
                WoodCrate center36 = new WoodCrate(627, 429);
                WoodCrate center37 = new WoodCrate(656, 400);
                WoodCrate center38 = new WoodCrate(656,429);
                WoodCrate center39 = new WoodCrate(685,400);
                WoodCrate center40 = new WoodCrate(685,429);
                MetalCrate center41 = new MetalCrate(714, 400);
                MetalCrate center42 = new MetalCrate(743, 400);
                WoodCrate center43= new WoodCrate(714,429);
                WoodCrate center44= new WoodCrate(743,429);
        
                WoodCrate center45 = new WoodCrate(598,371);
                WoodCrate center46 = new WoodCrate(598,342);
                WoodCrate center47 = new WoodCrate(598,313);
                WoodCrate center48 = new WoodCrate(627,371);
                WoodCrate center49 = new WoodCrate(627,342);
                WoodCrate center50 = new WoodCrate(627,313);
        
                WoodCrate center51= new WoodCrate(598,458);
                WoodCrate center52 = new WoodCrate(627,458);
        
                WoodCrate center53 = new WoodCrate(337,458);
                WoodCrate center54 = new WoodCrate(366,458);
        
        
                GameObjects.getInstance().addObs(center1);
                GameObjects.getInstance().addObs(center2);
                GameObjects.getInstance().addObs(center3);
                GameObjects.getInstance().addObs(center4);
                GameObjects.getInstance().addObs(center5);
                GameObjects.getInstance().addObs(center6);
                GameObjects.getInstance().addObs(center7);
                GameObjects.getInstance().addObs(center8);
                GameObjects.getInstance().addObs(center9);
                GameObjects.getInstance().addObs(center10);
                GameObjects.getInstance().addObs(center11);
                GameObjects.getInstance().addObs(center12);
                GameObjects.getInstance().addObs(center13);
                GameObjects.getInstance().addObs(center14);
                GameObjects.getInstance().addObs(center15);
                GameObjects.getInstance().addObs(center16);
                GameObjects.getInstance().addObs(center17);
                GameObjects.getInstance().addObs(center18);
                GameObjects.getInstance().addObs(center19);
                GameObjects.getInstance().addObs(center20);
                GameObjects.getInstance().addObs(center21);
                GameObjects.getInstance().addObs(center22);
                GameObjects.getInstance().addObs(center23);
                GameObjects.getInstance().addObs(center24);
                GameObjects.getInstance().addObs(center25);
                GameObjects.getInstance().addObs(center26);
                GameObjects.getInstance().addObs(center27);
                GameObjects.getInstance().addObs(center28);
                GameObjects.getInstance().addObs(center29);
                GameObjects.getInstance().addObs(center30);
                GameObjects.getInstance().addObs(center31);
                GameObjects.getInstance().addObs(center32);
                GameObjects.getInstance().addObs(center33);
                GameObjects.getInstance().addObs(center34);
                GameObjects.getInstance().addObs(center35);
                GameObjects.getInstance().addObs(center36);
                GameObjects.getInstance().addObs(center37);
                GameObjects.getInstance().addObs(center38);
                GameObjects.getInstance().addObs(center39);
                GameObjects.getInstance().addObs(center40);
                GameObjects.getInstance().addObs(center41);
                GameObjects.getInstance().addObs(center42);
                GameObjects.getInstance().addObs(center43);
                GameObjects.getInstance().addObs(center44);
                GameObjects.getInstance().addObs(center45);
                GameObjects.getInstance().addObs(center46);
                GameObjects.getInstance().addObs(center47);
                GameObjects.getInstance().addObs(center48);
                GameObjects.getInstance().addObs(center49);
                GameObjects.getInstance().addObs(center50);
                GameObjects.getInstance().addObs(center51);
                GameObjects.getInstance().addObs(center52);
                GameObjects.getInstance().addObs(center53);
                GameObjects.getInstance().addObs(center54);
        
                //Adding bots
                //NormalBot bot1 = new NormalBot(0,0);
                NormalBot bot2 = new NormalBot(750,0);
                NormalBot bot3 = new NormalBot(482, 0);
                NormalBot bot4 = new NormalBot(0, 600);
                NormalBot bot5 = new NormalBot(600, 250);
                // GameObjects.getInstance().addBot(bot1);
                GameObjects.getInstance().addBot(bot2);
                GameObjects.getInstance().addBot(bot3);
                GameObjects.getInstance().addBot(bot4);
                GameObjects.getInstance().addBot(bot5);

        
    }
}
