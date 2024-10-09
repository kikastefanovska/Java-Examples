package mk.iwec.genericsExamples;

public class GenericsClass<T> {
	private T value;

	public GenericsClass(T value) {
		this.value = value;
	}

	public void showType() {
		System.out.println("Types  " + value.getClass().getSimpleName());
		System.out.println("Values " + value);
	}

	static <T> void genericDisplay(T element) {
		System.out.println(element.getClass().getSimpleName() + " = " + element);
	}

	public static void main(String[] args) {
		GenericsClass<String> str = new GenericsClass<String>(" Generics ");

		GenericsClass<Integer> integer = new GenericsClass<Integer>(10);

		// str.showType();
		// integer.showType();
		genericDisplay(10);
		genericDisplay("Kika");
	}

}
