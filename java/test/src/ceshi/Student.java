package ceshi;

public class Student {
	
	
	private String name;
	private int id;
	private String banji;
	private static int count;
	public Student() {
		this("s1",17101,"171");
	}
	public Student(String name, int id, String banji) {
		super();
		this.name = name;
		this.id = id;
		this.banji = banji;
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBanji() {
		return banji;
	}
	public void setBanji(String banji) {
		this.banji = banji;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.print(s.getName()+", "+s.getId()+", "+s.getBanji()+"; ");
		
		
		Student s1 = new Student("s2",17102,"171");
		System.out.print(s1.getName()+", "+s1.getId()+", "+s1.getBanji()+"; "+"count="+s1.getCount());
	}
	
	
	
	
}
