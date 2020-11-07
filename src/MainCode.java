import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainCode {
  public static Kartenstapel Ziehstapel = new Kartenstapel();
  public static int kartenProSpieler = 10;
  public static int anzReihen = 4;
  public static Scanner input = new Scanner(System.in);
  public static List<Kartenstapel> reihen = new ArrayList<>();
  public static Kartenstapel spieler1;
  public static Kartenstapel stapel1;
  public static Karte gewKarte = new Karte();
  public static boolean karteGewählt = false;
  static Ausgabe ausgabe = new Ausgabe();
  
  public static void main(String[] args) throws InterruptedException {
    
    stapelErstellen();
//    System.out.println(Ziehstapel.stapel.size());
    spieler1 = spielerErstellen(kartenProSpieler);
    stapel1 = new Kartenstapel();
    System.out.println("spieler erstellt");   
    
    System.out.println("reihen: ");
    
    for (int i = 0; i < anzReihen; i++) {
      Kartenstapel reihe = new Kartenstapel();
      Karte gezKarte = Ziehstapel.randomKarte();
      reihe.stapel.add(gezKarte);
      reihen.add(reihe);
      System.out.println(gezKarte.getWert()+" "+gezKarte.getPunkte());
    }
    ausgabe.refreshReihen();

    
    
    
    for (int i = 0; i < kartenProSpieler; i++) {
    	
      ausgabe.refreshSpieler();
      
      for ( int j = 0; j < ausgabe.spielerHand.size(); j++) {
        	ausgabe.spielerHand.get(j).setEnabled(true);
      }
      karteGewählt = false;
      while (karteGewählt == false) {
    	  System.out.println("wait");
    	  Thread.sleep(1000);
      }
      for ( int j = 0; j < ausgabe.spielerHand.size(); j++) {
      	ausgabe.spielerHand.get(j).setEnabled(false);
      }
      karteLegen(gewKarte);
      System.out.println("karte abgelgt");
      
      
      
      System.out.println("Reihen: ");
      for (int j = 0; j < reihen.size(); j++) {
        for (int k = 0; k < reihen.get(j).stapel.size(); k++) {
          System.out.print(reihen.get(j).stapel.get(k).getWert()+":"+reihen.get(j).stapel.get(k).getPunkte()+" ");
        }
        System.out.println();
      }
      ausgabe.refreshReihen();
      for (int j = 0; j < reihen.size(); j++) {
        if (reihen.get(j).stapel.size() == 5) {
          System.out.println("Stapel "+ (j+1) +"ist zu voll");
          for (int k = 0; k < reihen.get(j).stapel.size(); k++) {
            Karte verschobeneKarte = reihen.get(j).karteZiehen(0);
//            System.out.println(verschobeneKarte.getWert()+" : "+verschobeneKarte.getPunkte());
            stapel1.stapel.add(verschobeneKarte);
          }
        }
        
      }
      ausgabe.refreshReihen();
      int punkte = 0;
      for (int j = 0; j < stapel1.stapel.size(); j++) {
        punkte += stapel1.stapel.get(j).getPunkte();
      }
      System.out.print("Punkte: "+ punkte);
    }
   
  }
  
  public static void stapelErstellen() {
    for (int i = 1; i <= 104; i++) {
      int wert = i;
      int punkte = 0;
      if (i%5 != 0 || i%11 != 0 || i%10 != 0) {
        punkte = 1;
      }
      if(i%10 == 0 ) {
        punkte = 3;
      }
      else if(i%5 ==0 && i%10 != 0) {
        punkte = 5;
      }
      if (i%11 ==0) {
        punkte = 2;
      }
      if (i == 55) {
        punkte = 7;
      }
      Ziehstapel.addKarte(wert, punkte);
//      System.out.print(Ziehstapel.stapel.get(i-1).getWert()+" ");
//      System.out.println(Ziehstapel.stapel.get(i-1).getPunkte()+" ");     
    }
    
  }
  
  private static Kartenstapel spielerErstellen(int kartenProSpieler) {
    Kartenstapel hand = new Kartenstapel();
    for (int i = 0; i < kartenProSpieler; i++) {
      Karte gezKarte = Ziehstapel.randomKarte();
      hand.stapel.add(gezKarte);
//      System.out.println(gezKarte.getWert()+" "+gezKarte.getPunkte());
    }
    return hand;
  }
  
  
  public static void karteLegen(Karte addedKarte) {
	System.out.println("Karte gelegt");
    List<List<Integer>> differenzen = new ArrayList<>();
    
    for (int j = 0; j < reihen.size(); j++) {
      Karte letzteKarte = reihen.get(j).stapel.get(reihen.get(j).stapel.size() -1);
      int differenz = addedKarte.getWert() - letzteKarte.getWert();
      List<Integer> index = new ArrayList<>();
      
      if (differenz > 0) {
        index.add(differenz);
        index.add(j);
        differenzen.add(index);
      }
    }
    if (differenzen.size() > 0) {
      System.out.println(differenzen);
      reihen.get(kleinste(differenzen)).stapel.add(addedKarte);
      
    }
    else if (differenzen.size() <= 0) {
            System.out.println("Karte zu klein");
            System.out.print("welche Reihe soll ersetzt werden?");
            int ersetzteReihe = ausgabe.karteZuKlein();
            int länge = reihen.get(ersetzteReihe).stapel.size();
            for (int j = 0; j < länge; j++) {
              Karte verschobeneKarte = reihen.get(ersetzteReihe).stapel.get(0);
//              System.out.println(verschobeneKarte.getWert()+" : "+verschobeneKarte.getPunkte());
              stapel1.stapel.add(verschobeneKarte);
              reihen.get(ersetzteReihe).stapel.remove(verschobeneKarte);
            }
            reihen.get(ersetzteReihe).stapel.add(gewKarte);
          
    
    }
  }
  public static int kleinste(List<List<Integer>> zahlen){
    List<Integer> kleinste = zahlen.get(0);
    int kleinsteIndex = kleinste.get(1);
    for(int i=1; i<zahlen.size(); i++){
      if((int)zahlen.get(i).get(0) < (int)kleinste.get(0)){
        kleinste = zahlen.get(i);
        kleinsteIndex = kleinste.get(1);
        System.out.println(kleinsteIndex);
      }
    }
    
    return kleinsteIndex;
  }
}
