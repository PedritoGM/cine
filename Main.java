package ejercicio1;

public class Main 
{
	public static void main(String [] args)
	{
		Cuenta c=new Cuenta("Juanma",5000);
		System.out.println(c);
		c.ingresar(3000);
		System.out.println(c);
		c.ingresar(-200);
		System.out.println(c);
		c.retirar(1000);
		System.out.println(c);
		c.retirar(-1000);
		System.out.println(c);
		c.retirar(8000);
		System.out.println(c);
		
	}
}
