package ex;

public class AA {

	String name;
	int age;
	String school;
	String hobby;

	public void selfIntroduce(String n, int a, String s, String h) {
		this.name = n;
		this.age = a;
		this.school = s;
		this.hobby = h;
		System.out.println("안녕하세요! 저는 " + school + "에 다니고 있는" + age +"살 "+ name + "입니다. 취미는 " + hobby + "입니다");
	}

	

}
