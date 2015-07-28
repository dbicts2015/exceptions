package oef04;

import java.awt.geom.Line2D;
import java.util.Arrays;
import java.util.Collections;


public class TVZender {

	private final TVProgramma[] programmas = new TVProgramma[10];

	public void addProgramma(TVProgramma programma) throws TVException {
		for (int i = 0; i < programmas.length; i++) {
			if (programmas[i] != null && Line2D.linesIntersect(programma.getBeginUur(), 0, programma.getEindUur(), 0,
					programmas[i].getBeginUur()+0.001, 0, programmas[i].getEindUur()-0.001, 0)) {
				throw new TVException(programma.getNaam() + " overlapt met " + programmas[i].getNaam());
			}
			else if (programmas[i] == null) {
				programmas[i] = programma;
				return;
			}
		}
		throw new TVException("Er zijn geen plaatsen meer in de zender");
	}

	public String geefProgrammas() {
		Collections.sort(Arrays.asList(programmas), (o1, o2) ->  {
			if (o1 == null) {
				return Integer.MAX_VALUE;
			}
			if (o2 == null) {
				return Integer.MIN_VALUE;
			}
			return o1.getBeginUur() - o2.getBeginUur();
		});
//		Collections.sort(Arrays.asList(programmas), new Comparator<TVProgramma>() {
//		
//			@Override
//			public int compare(TVProgramma o1, TVProgramma o2) {
//				if (o1 == null) {
//					return Integer.MAX_VALUE;
//				}
//				if (o2 == null) {
//					return Integer.MIN_VALUE;
//				}
//				return o1.getBeginUur() - o2.getBeginUur();
//			}
//		
//		});
		StringBuilder bldr = new StringBuilder();
		for (TVProgramma programma : programmas) {
			if (programma != null) {
				bldr.append(programma.toString()).append("\n");
			}
		}
		return bldr.toString();
	}

}
