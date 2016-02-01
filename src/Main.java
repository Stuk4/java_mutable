import java.util.Date;

/**
 * 
 * @author clarico stuk4
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		Entidad ent = new Entidad();
		
		
		// para fecha mutante
		Date date1 =  new Date();
		ent.setDate_mutante(date1);
		date1.setMonth(3);
		
		System.out.println("d1 "+date1.toLocaleString());
		System.out.println("d1 "+ ent.getDate_mutante().toLocaleString());
		
		// para la fecha no mutante
		Date date2 =  new Date();
		ent.setDate_no_mutante(date2);
		date2.setMonth(4);
		
		System.out.println("d2 "+date2.toLocaleString());
		System.out.println("d2 "+ ent.getDate_no_mutante().toLocaleString());
		
		String cadena = "Eduardo";
		ent.setCadena(cadena);
		cadena = "Pirulo";
		
		System.out.println("c2 "+cadena);
		System.out.println("c2 "+ent.getCadena());
		
	}
}
