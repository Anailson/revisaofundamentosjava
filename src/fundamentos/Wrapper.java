package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		

		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		long L = 100000;
		
		
		System.out.println(b.byteValue());
		System.out.println(s. toString());
		System.out.println(i* 3 );
		System.out.println(L / 3 );
		
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1232.444;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		
		Character c = '#';//char
		System.out.println(c + "....");
		
		
		
		
		
		
	}

}
