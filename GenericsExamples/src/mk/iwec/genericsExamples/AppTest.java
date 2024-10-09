package mk.iwec.genericsExamples;

public class AppTest {

	public static void main(String[] args) {

		SingleObjectBox box = new SingleObjectBox();
		box.set("18");
		Integer integer = (Integer) box.get();
		System.out.println(integer);

		GenericsObjectBox<Integer> box2 = new GenericsObjectBox<>();
		box2.set(10);
		Integer genericsInt = box2.get();
		System.out.println(genericsInt);

	}

}
