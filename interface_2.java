package practice_JFSD_1;

import java.util.Scanner;

interface client {
	void input();

	void output();
}

class developer implements client {
	int age;
	String name;
	double salary;

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		name = sc.nextLine();
		System.out.println("Enter your age :");
		age = sc.nextInt();
		System.out.println("Enter your Salary :");
		salary = sc.nextDouble();
		sc.close();
	}

	public void output() {
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("Your name is " + salary);
	}
}

class interface_2 {
	public static void main(String[] args) {
		developer obj = new developer();
		obj.input();
		obj.output();
	}
}
