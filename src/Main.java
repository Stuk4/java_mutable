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
		
		System.out.println("d1 "+date1.toLocaleString()); //output -> d1 01/04/2016 10:30:39 AM
		System.out.println("d1 "+ ent.getDate_mutante().toLocaleString()); // output -> d1 01/04/2016 10:30:39 AM
		
		// para la fecha no mutante
		Date date2 =  new Date();
		ent.setDate_no_mutante(date2);
		date2.setMonth(4);
		
		System.out.println("d2 "+date2.toLocaleString()); //output -> d2 01/05/2016 10:30:39 AM
		System.out.println("d2 "+ ent.getDate_no_mutante().toLocaleString());//output --> d2 01/02/2016 10:30:39 AM
		
		String cadena = "Eduardo";
		ent.setCadena(cadena);
		cadena = "Pirulo";
		
		System.out.println("c2 "+cadena);//output -> c2 Pirulo
		System.out.println("c2 "+ent.getCadena());//output --> c2 Eduardo

		
	}
}
