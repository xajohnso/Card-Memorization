package cm.deck;

import java.util.ArrayList;

public class Sets {
	public ArrayList<String> set13 = new ArrayList<String>();
	public ArrayList<String> set01 = new ArrayList<String>();
	public ArrayList<String> set02 = new ArrayList<String>();
	public ArrayList<String> set03 = new ArrayList<String>();
	public ArrayList<String> set04 = new ArrayList<String>();
	public ArrayList<String> set05 = new ArrayList<String>();
	public ArrayList<String> set06 = new ArrayList<String>();
	public ArrayList<String> set07 = new ArrayList<String>();
	public ArrayList<String> set08 = new ArrayList<String>();
	public ArrayList<String> set09 = new ArrayList<String>();
	public ArrayList<String> set10 = new ArrayList<String>();
	public ArrayList<String> set11 = new ArrayList<String>();
	public ArrayList<String> set12 = new ArrayList<String>();
	
	public void setCheck(Deck deck) {
		if (set01.size() < 4){
			set01.add(deck.deck.pollFirst());
		} else if (set01.size() == 4 & set02.size() < 4) {
			set02.add(deck.deck.pollFirst());
		} else if (set02.size() == 4 & set03.size() < 4) {
			set03.add(deck.deck.pollFirst());
		} else if (set03.size() == 4 & set04.size() < 4) {
			set04.add(deck.deck.pollFirst());
		} else if (set04.size() == 4 & set05.size() < 4) {
			set05.add(deck.deck.pollFirst());
		} else if (set05.size() == 4 & set06.size() < 4) {
			set06.add(deck.deck.pollFirst());
		} else if (set06.size() == 4 & set07.size() < 4) {
			set07.add(deck.deck.pollFirst());
		} else if (set07.size() == 4 & set08.size() < 4) {
			set08.add(deck.deck.pollFirst());
		} else if (set08.size() == 4 & set09.size() < 4) {
			set09.add(deck.deck.pollFirst());
		} else if (set09.size() == 4 & set10.size() < 4) {
			set10.add(deck.deck.pollFirst());
		} else if (set10.size() == 4 & set11.size() < 4) {
			set11.add(deck.deck.pollFirst());
		} else if (set11.size() == 4 & set12.size() < 4) {
			set12.add(deck.deck.pollFirst());
		} else if (set12.size() == 4 & set13.size() < 4) {
			set13.add(deck.deck.pollFirst());
		}
	}
	
}
