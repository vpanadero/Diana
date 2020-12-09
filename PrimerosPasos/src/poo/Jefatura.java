package poo;

public class Jefatura extends Empleado implements Jefes {
	
	private double incentivo;
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}

	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la dirección ha tomado la decision de: " + decision;
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	
	
	public void establece_incentivo(double b) {
		
		incentivo=b;
	}
	
	public double dame_sueldo() {
		
		double sueldoJefe=super.dame_sueldo();
		
		return sueldoJefe + incentivo;
	}
	
		
}
