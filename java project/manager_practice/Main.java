package manager_practice;

import java.util.Scanner;

public class Main {

static Scanner sc = new Scanner(System.in);
static EMPManager emp = new EMPManager();
static DEPTManager dept = new DEPTManager();


	public static void main(String[] args) {
		
		System.out.println("Select Menu");
		System.out.println("----------------");
		System.out.println("1. EMP,  2. DEPT");
		System.out.println("----------------");
		
		int select = sc.nextInt();
		
		switch (select) {
		case 1:
			emp.empManager();
			break;
		case 2:
			dept.deptManager1();
			break;
		}

	}
	
}
