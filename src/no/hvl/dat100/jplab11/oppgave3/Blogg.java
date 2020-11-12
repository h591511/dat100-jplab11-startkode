package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggtabell;
	private int nesteledig; 

	public Blogg() {
		innleggtabell = new Innlegg[20];
		
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell; 

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int indeks = -1;
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return indeks = i;
            }
        }
        return indeks;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
        for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
                return finnes = true;
            }
        }
        return finnes;
	}

	public boolean ledigPlass() {
		if (nesteledig < innleggtabell.length) {
			return true;
		}	else {
			return false;
		}
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg) == false && ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig ++;
            return true;
        } else {
            return false;
        }
	}
	
	public String toString() {
		String str = ""+ getAntall() + "\n";
        for (Innlegg element: innleggtabell) {
            str += element.toString();
        }
        return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}