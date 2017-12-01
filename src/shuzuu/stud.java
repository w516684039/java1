package shuzuu;

import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;

public class stud {
	public static void main(String[] args) {
		Scanner scanner =new  Scanner(System.in );
		System.out.println("请输入学生个数：");
		int count = scanner.nextInt();
		Student[] students = new Student[count ];
		for (int i = 0; i < students.length; i++){
			System.out.println("请输入学生姓名：");
			String name = scanner.next();
			System.out.println("请输入学生年龄：");
			int age = scanner.nextInt();
			System.out.println("请输入学生性别：");
			String gender = scanner.next();
			System.out.println("请输入学生班级：");
			String classname = scanner.next();
			Student student = new Student(name,age,gender,classname);
			students[i] = student ;
		}
		for (int i = 0; i < students.length; i++){
			Student student = students [i];
			System.out.println(student.toString());
		}
		while (true){
			System.out.println("根据条件查询");
			System.out.println("根据姓名来查询：1");
			System.out.println("根据年龄来查询：2");
			System.out.println("根据性别来查询：3");
			System.out.println("按0退出程序");
			int num = scanner.nextInt();
			if (num == 0){
				System.out.println("退出程序");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("请输入姓名：");
				String nameSearch = scanner.next();
				boolean isNameSearchFound = false;
				for (int i = 0;i < students.length; i++){
					Student student = students[i];
					String name1 = student.name;
					if(nameSearch.equals(name1)){
						System.err.println(student);
						isNameSearchFound = true;
					    }
					}
				if(isNameSearchFound = false){
					System.out.println("没有该姓名的学生");
				}
				break;
			
			case 2:	
				System.out.println("请输入年龄：");
				int ageSearch = scanner.nextInt();
				boolean isAgeSearchFound = false;
				for (int i = 0;i < students.length; i++){
					Student student = students[i];
					int age1 = student.age;
					if(ageSearch == age1){
						System.err.println(student);
						isAgeSearchFound = true;
					    }
					}
				if(isAgeSearchFound = false){
					System.out.println("没有该年龄的学生");
				}
				break;
			case 3:
				System.out.println("请输入性别：");
				String genderSearch = scanner.next();
				boolean isGenderSearchFound = false;
				for (int i = 0;i < students.length; i++){
					Student student = students[i];
					String gender = student.gender;
					if(genderSearch.equals(gender)){
						System.err.println(student);
						isGenderSearchFound = true;
					    }
					}
				if(isGenderSearchFound = false){
					System.out.println("没有该性别的学生");
				}
				break;

			default:
				System.out.println("非法的输入");
				break;
		
		
		    }
		
	
	    }
	}
}
