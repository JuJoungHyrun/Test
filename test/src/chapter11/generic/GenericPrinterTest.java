package chapter11.generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> genericPowder = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		genericPowder.setMaterial(powder);
		System.out.println(genericPowder.toString());
		genericPowder.printing();
		
		GenericPrinter<Plastic> genericplastic = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		genericplastic.setMaterial(plastic);
		System.out.println(genericplastic.toString());
		genericplastic.printing();
		
		//제약 조건이 필요하다 아무거나 막 쓸수 없게 -> 상위 클래스를 선언한ㄷ다. 
		//GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
	}

}
