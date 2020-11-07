import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class Ausgabe extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
// Anfang Attribute
  // Ende Attribute
  private MainCode mainCode = new MainCode();
  public Ausgabe() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 590; 
    int frameHeight = 459;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = ((d.width - getSize().width)) / 2;
    int y = ((d.height - getSize().height) / 2) ;
    setLocation(x, y);
    setTitle("Ausgabe");
    setResizable(true);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    // Ende Komponenten

    setVisible(true);
  } // end of public Ausgabe
  
  // Anfang Methoden
  public ArrayList<JButton> spielerHand = new ArrayList<>(); 
  public ArrayList<ArrayList<JLabel>> reihen = new ArrayList<ArrayList<JLabel>>();
  
  public void refreshSpieler(){
    System.out.println("YEET");
    Container cp = getContentPane();
    for (int i = 0; i < spielerHand.size(); i++) {
      cp.remove(spielerHand.get(i));
    } 
    
    spielerHand.clear();
    
    for (int j = 0; j < mainCode.spieler1.stapel.size(); j++) {
   
      JButton addButton = new JButton();
      addButton.setBounds(j*50+35, this.getHeight() - 120, 50,50);
      addButton.setText(Integer.toString(mainCode.spieler1.stapel.get(j).getWert()));
      addButton.setMargin(new Insets(2, 2, 2, 2));
      addButton.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent evt) {
          addButton_ActionPerformed(evt);
        }
      });
      spielerHand.add(addButton);
      cp.add(addButton);
    }
    cp.repaint();
  }
   
  public void addButton_ActionPerformed(ActionEvent evt) {
    if (spielerHand.contains(evt.getSource())) {
      int btnIndex = spielerHand.indexOf(evt.getSource());
      System.out.println(btnIndex);
      mainCode.gewKarte = mainCode.spieler1.karteZiehen(btnIndex);
      mainCode.karteGew�hlt = true;
    }  
  } // end of jButton1_ActionPerformed

  public void refreshReihen(){
      System.out.println("yeah");
      Container cp = getContentPane();
      
      System.out.println(reihen.size());
      int l�nge = reihen.size();
      for (int i = 0; i < l�nge; i++) {
        System.out.println("reihen l�schen"+i);
        System.out.println(reihen.size());
        for (int j = 0; j < reihen.get(0).size(); j++) {
          cp.remove(reihen.get(0).get(j));
        }
      reihen.remove(reihen.get(0));    
      }
      
      for (int i = 0; i < 4; i++) {
        ArrayList<JLabel> reihe = new ArrayList<JLabel>();
        reihen.add(reihe);
        System.out.println("Reihe hinzugef�gt "+i);
        for (int j = 0; j < mainCode.reihen.get(i).stapel.size(); j++) {
          JLabel addLabel = new JLabel();
          addLabel.setBounds(j*50+35, this.getHeight()/2 -i*50, 50,50);
          addLabel.setText(Integer.toString(mainCode.reihen.get(i).stapel.get(j).getWert()));
          reihen.get(i).add(addLabel);
          cp.add(addLabel);
          System.out.println(Integer.toString(mainCode.reihen.get(i).stapel.get(j).getWert())+" Label hinzugef�gt "+j);
        }  
     }
      cp.repaint();
  }
  
  public int karteZuKlein() {
    Object[] options = {"1", "2", "3", "4"};
    int n = JOptionPane.showOptionDialog(this, "Karte zu klein, welche Reihe soll ersetzt werden?",
    		"Karte zu klein!",
    		JOptionPane.YES_NO_CANCEL_OPTION,
    		JOptionPane.QUESTION_MESSAGE,
    		null,
    		options,
    		options[2]);
    return n;
    
  }
  
  // Ende Methoden
} // end of class Ausgabe

