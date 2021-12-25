package eighth;

import java.util.*;
import java.io.*;

public class Test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("请输入: 学号 姓名 年龄");
		Scanner input = new Scanner(System.in);
		String number = input.next();
		
		Map<Integer,Student> student = new TreeMap<Integer,Student>();
		
		while(!number.equals("exit")) {
			String name = input.next();
			int age = input.nextInt();
			student.put(age,new Student(number,name,age));
			number=input.next();
		}
		
		File file = new File("students.txt");
		PrintWriter output = new PrintWriter(file);
		
		Iterator iter = student.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry entry = (Map.Entry)iter.next();
			output.print(entry.getValue() + "\n");
			System.out.println(entry.getValue());
		}
		output.close();
	}

}
