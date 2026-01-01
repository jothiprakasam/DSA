package test;
class Name{
	public String name;
	public Name(String name) {
		this.name=name;
	}
	public String toString() {
		return this.name;
	}
}
public class ref {
	public static void main(String args[]) {
		Name n = new Name("jothi");
		System.out.print(n);
	}
}
