package eighth;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book1 = new Books(100001, "Java", 137.0, "��е��ҵ������");
		Books book2 = new Books(100002, "����", 48.0, "���ҳ�����");
		Books book3 = new Books(100003, "�����", 21.0, "������ѧ������");
		Books book4 = new Books(100004, "�ڶ���", 38.0, "�ٻ������ճ�����");
		
		HashMap<Integer, Books> booksHashMap = new HashMap<>();
		booksHashMap.put(book1.getNum(), book1);
		booksHashMap.put(book2.getNum(), book2);
		booksHashMap.put(book3.getNum(), book3);
		booksHashMap.put(book4.getNum(), book4);
		
		List<HashMap<Integer, Books>> booksList = new ArrayList<>();
		booksList.add(booksHashMap);
		
		System.out.println("���\t\t����\t\t����\t\t������");
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

