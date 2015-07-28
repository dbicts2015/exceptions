package oeftijdstip;

import java.time.DateTimeException;

public class Periode {

	private final Tijdstip begin;
	private final Tijdstip einde;

	public Periode(Tijdstip begin, Tijdstip einde) {
		if (begin.toLocalTime().isAfter(einde.toLocalTime())) {
			throw new DateTimeException("Begin is na einde");
		}
		this.begin = begin;
		this.einde = einde;
	}

	public boolean overlapt(Periode p2) {
		return begin.toLocalTime().isBefore(p2.einde.toLocalTime())
				&& p2.begin.toLocalTime().isBefore(einde.toLocalTime());
	}
	
	public Tijdsduur getDuurtijd() {
		return new Tijdsduur(begin, einde);
	}

}
