package mk.iwec.genericsExamples;

public class GenericsObjectBox<T> {
	 
		private T t;

		  public void set(T t) {
		    this.t = t;
		  }

		  public T get() {
		    return t;
		  }
}


