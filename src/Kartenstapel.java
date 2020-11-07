import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kartenstapel {
	private static Random rnd = new Random();

	public List<Karte> stapel = new ArrayList<>();

	public void addKarte(int wert, int punkte) {
		Karte karte= new Karte();
		karte.setPunkte(punkte);
		karte.setWert(wert);
		stapel.add(karte);
	}
	
	public Karte karteZiehen(int index) {
		Karte gezKarte;
		if (index == -1) {
			gezKarte = stapel.get(stapel.size()-1);
			stapel.remove(stapel.size()-1);
		}
		else{
			gezKarte = stapel.get(index);
			stapel.remove(index);
		}
		//System.out.println(gezKarte.getWert()+":"+gezKarte.getPunkte());
		return gezKarte;
	}
	public Karte karteZiehen() {
		return karteZiehen(-1);
	}
	public Karte randomKarte() {
		int i = rnd.nextInt(stapel.size());
		Karte gezKarte = karteZiehen(i);
		return gezKarte;
	}
	
}
