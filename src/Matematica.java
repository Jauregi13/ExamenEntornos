import java.util.ArrayList;

/**
 * 
 * @author Jon Jauregi
 *
 */
public class Matematica {
	
	private int a;
	private int b;
	private ArrayList<Integer> sumas;
	
	
	public Matematica(){
		this.sumas = new ArrayList<Integer>();
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	
	/**
	 * El metodo suma, suma 2 numeros enteros que se introducen como parametro y ese resultado de la suma se guardara en un arrayList sumas
	 * Tambien se devolvera el resultado de la suma realizada
	 * @param a numero entero
	 * @param b numero entero
	 * @return resultado El resultado de la suma
	 */
	public int suma(int a, int b){
		
		int resultado = a + b;
		
		this.sumas.add(resultado);
		
		return resultado;
		
	}
	
	/**
	 * El metodo mayor compara los dos numeros que se introduciran como parametro
	 * Si el numero "a" es mayor que el numero "b", se devolvera true, y sino se devolvera false
	 * @param a numero entero
	 * @param b numero entero
	 * @return boolean un true o false
	 */
	
	public boolean mayor(int a, int b){
		
		if(a > b){
			return true;
		}
		else{
			return false;
		}
		
	}
	/**
	 * El metodo sumas solamente devuelve el arrayList sumas que tendra almacenadas todas las sumas que se han realizado anteriormente
	 * con el metodo suma
	 * @return arrayList sumas 
	 */
	public ArrayList<Integer> sumas(){
		return this.sumas;
	}
	
	
	
	

}
