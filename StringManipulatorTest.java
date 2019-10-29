public class StringManipulatorTest {
	public static void main(String[] args){
		StringManipulator manipulator = new StringManipulator();
		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		Integer a = manipulator.getIndexOrNull("Coding", "o");
		Integer b = manipulator.getIndexOrNull("Hello World", "o");
		Integer c = manipulator.getIndexOrNull("Hi", "re 3");
		String substring = manipulator.concatSubstring("Java is awful", 0, 8, "fun");
		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer z = manipulator.getIndexOrNull(word, subString);
		Integer y = manipulator.getIndexOrNull(word, notSubString);
		String concat = manipulator.concatSubstring("Hello", 1, 2, "world");

		System.out.println(str); // HelloWorld 
		System.out.println(a); // 1
		System.out.println(b); // 4
		System.out.println(c); // null
		System.out.println(z); // 2
		System.out.println(y); // null
		System.out.println(substring); // Java is fun
		System.out.println(concat); // eworld
	}
}