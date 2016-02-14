package stage02;

/**
 * Pass arguments for provider logic
 * @author snewnham
 *
 */

public class Hello_World_02 {

	public static void main(String[] args) {
		if(args.length > 0)
			System.out.println(args[0]);
		else 
			System.out.println("Hello World");
	}

}
