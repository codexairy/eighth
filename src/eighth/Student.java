package eighth;

public class Student {
	public String number;
	public String name;
	public int age;
	public Student(String number,String name,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return this.number+" "+this.name+" "+this.age;
	}
}
