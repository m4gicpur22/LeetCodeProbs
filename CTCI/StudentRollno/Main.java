import java.util*;
import java.io.*;

public class Main {

	public static void main(String [] args) {
		HashTable HashTable = new HashTable();
		
		Student std1 = new Student("Affy", "15-123", 3.5);
		Student std2 = new Student("Drake", "15-124", 3.1);	
		Student std3 = new Student("Bosh", "15-125", 3.3);
		Student std3 = new Student("Charles", "15-321", 3.9);

		int std1key = hashtable.toHashCode(std1.getRollno());
		int std2key = hashtable.toHashCode(std2.getRollno());
		int std3key = hashtable.toHashCode(std3.getRollno());
		int std4key = hashtable.toHashCode(std3.getRollno());

		hashtable.insert(std1key, std1);
		hashtable.insert(std2key, std2);
		hashtable.insert(std3key, std3);
		hashtable.insert(std3key, std4);

		hashtable.deleteStd(std3.getRollno());

		Student new_std2 = hashtable.fetchStdInfo(std2.getRollno());
		if(new_std2.getName().equals(std2.getName())) {
			System.out.println("Equal");
		}

		hashtable.showData();	
	}
}