package eighth;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book1 = new Books(100001, "Java", 137.0, "机械工业出版社");
		Books book2 = new Books(100002, "活着", 48.0, "作家出版社");
		Books book3 = new Books(100003, "红与黑", 21.0, "人民文学出版社");
		Books book4 = new Books(100004, "摆渡人", 38.0, "百花洲文艺出版社");
		
		HashMap<Integer, Books> booksHashMap = new HashMap<>();
		booksHashMap.put(book1.getNum(), book1);
		booksHashMap.put(book2.getNum(), book2);
		booksHashMap.put(book3.getNum(), book3);
		booksHashMap.put(book4.getNum(), book4);
		
		List<HashMap<Integer, Books>> booksList = new ArrayList<>();
		booksList.add(booksHashMap);
		
		System.out.println("编号\t\t名称\t\t单价\t\t出版社");
		for(HashMap<Integer, Books> h : booksList) {
			Set<Integer> key = h.keySet();
			for(Integer i : key) {
				System.out.println(i + "\t\t" + h.get(i).getName()
						+ "\t\t" + h.get(i).getPrice()
						+ "\t\t" + h.get(i).getPress());
			}
		}
	}
}

