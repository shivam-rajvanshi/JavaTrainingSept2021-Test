import java.util.Scanner;
import java.util.ArrayList;

class Student {
	private String Name;
	private String Phone;
	private int age;

	public Student(String Name, String Phone, int age) {
		this.Name = Name;
		this.Phone = Phone;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return Name;
	}

	public String getPhone() {
		return Phone;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setPhoneNum(String phone) {
		Phone = phone;
	}

	public String toString() {
		return " Student Name is " + this.Name;
	}
}

class Entry_2 {

	public static void main(String[] args) {

		System.out.println("Enter Number of students: ");

		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		src.nextLine();

		ArrayList<Student> arrayList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name: ");
			String name = src.nextLine();
			System.out.println("Enter phone:");
			String phone = src.nextLine();
			System.out.println("Enter age: ");
			int age = src.nextInt();
			src.nextLine();
			Student st = new Student(name, phone, age);
			arrayList.add(st);
		}

		for (int i = 0; i < n; i++) {
			Student student = arrayList.get(i);
			if (student.getAge() > 18) {
				System.out.println(student.toString());
			}
		}
	}
}