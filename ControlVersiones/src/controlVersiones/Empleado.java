
package controlVersiones;

/**
 * 
 * @author Zeeshan
 * @version 1, 2011
 * @since 24-05-2021
 *
 */
public class Empleado {
	/**
	 * 
	 * 1st attribute is a type of String and named as "nombre"
	 * 2nd attribute is a type of String and named as "apellido"
	 * 3rd attribute is a type of double and named as "salario"
	 * 
	 */
	private String nombre;
	private String apellidos;
	private double salario;

	/**
	 * 
	 * @param nombre   is a String variable that is used to get name of employee
	 * @param apellido is a String variable that is used to get surname of employeee
	 * @param salario  is a double variable that is used to get salary of employee
	 */
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * 
	 * @param this method will calculate the increament in salary which would sum of
	 *             actual salary and the increament amount
	 */
	public void subirsalario(double subida) {
		salario = salario + subida;
	}

}