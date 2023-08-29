/*Проанализировать и описать персонажей: 
Маг, монах, разбойник, копейщик, снайпер, арбалетчик, крестьянин.
peaceful
armed 
Mage, Monk, Rogue, Spearman, Sniper, Crossbowman, Peasant.
На базе описания персонажей описать простейшую иерархию классов. В основной программе создать по одному экземпляру каждого класса. */

public class Main {

    public static void main(String[] args) {
    Mage mage = new Mage(8);
    Sniper sniper = new Sniper(8);
    System.out.println(mage.MageGentle);
    System.out.println(sniper.SniperArm);

    }
}