/*
 * Lab
 * version 1.2
 * T-double-U
 */
import java.lang.reflect.*;
public class Main {

	public static void main(String[] args) {
		try {
			 Class<?> c = Class.forName("basic");
			 c.getConstructor();
			 c.newInstance();
			 Method[] m = new Method[c.getDeclaredMethods().length];
			 m = c.getDeclaredMethods();
			 System.out.println(m[1]);
			 System.out.println("lala");
		}catch(Exception e) {}
	}
}
