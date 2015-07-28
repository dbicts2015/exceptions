package oeftijdstip;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Tijdstip {

	public static final int MAX_UUR = 23;
	public static final int MAX_MINUUT = 59;

	private final int uren;
	private final int minuten;

	public Tijdstip(int uren, int minuten) {
		if (uren < 0 || uren > MAX_UUR) {
			throw new IllegalArgumentException("uur moet binnen 0-23 liggen");
		}
		if (minuten < 0 || minuten > MAX_MINUUT) {
			throw new IllegalArgumentException("minuut moet binnen 0-59 liggen");
		}
		this.uren = uren;
		this.minuten = minuten;
	}

	public Tijdstip subtract(Tijdstip tijdstip) {
		if (this.toLocalTime().isBefore(tijdstip.toLocalTime())) {
			throw new DateTimeException("argument moet na begin tijd liggen");
		}
		LocalTime time = toLocalTime().minusHours(tijdstip.uren).minusMinutes(tijdstip.minuten);
		return new Tijdstip(time.getHour(), time.getMinute());
	}

	public int getUren() {
		return uren;
	}

	public int getMinuten() {
		return minuten;
	}

	public String toString() {
		return toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm"));
	}

	public LocalTime toLocalTime() {
		return LocalTime.of(uren, minuten);
	}

}