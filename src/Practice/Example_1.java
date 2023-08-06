package Practice;
import java.util.AbstractList;
import java.io.File;
import Practice.Example_2;
import java.util.*;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Collection;
public class Example_1 {
	public static void main (String[] args) {
		File f = new File("C:\\Users\\91959\\Desktop\\New XLSX Worksheet.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook
		File f = new File("C:\\Users\\HP\\Desktop\\ExcelRead.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(f1);
		Sheet s = w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				// 1 -- String 0 -- Numbers & Date
				if (cellType==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (cellType==0) {
					if (DateUtil.isCellDateFormatted(c)) {
						Date d = c.getDateCellValue();
						SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
						String value = sd.format(d);
						System.out.println(value);
					}
					else {
						double d = c.getNumericCellValue();
						long l =(long)d;
						String value = String.valueOf(l);
					    System.out.println(value);
					}
				}
			}
		}

		
//	public static void main (String[] args) {           
//	Map<Integer,Example_2> m1=new HashMap<>();              // 
//	Example_2 p1 = new Example_2();
//	p1.setRollNum(10);
//	p1.setName("Naveen");
//	p1.setPhNo(51551814);
//	
//	Example_2 q1 = new Example_2();
//	q1.setRollNum(12);
//	q1.setName("Kumar");
//	q1.setPhNo(51501814);
//	
//	Example_2 r1 = new Example_2();
//	r1.setRollNum(15);
//	r1.setName("Pradeep");
//	r1.setPhNo(51501814);
//	
//	m1.put(1,p1);                                    //
//	m1.put(2,q1);
//	m1.put(3,r1);
//	
//	Set<Entry<Integer, Example_2>>entrySet =m1.entrySet();         // entryset 
//	for(Entry<Integer, Example_2> x : entrySet)	{
//		System.out.println(x.getValue().getRollNum());
//		System.out.println(x.getValue().getName());
//		System.out.println(x.getValue().getPhNo());
//	}
//	
//	public static void main (String[] args) {
//		String s="Welcome to Java Program Welcome to Java Program";
//		String unique="";
//		Map<String, Integer> mp = new TreeMap<>();
//		String[] cs =s.split(" ");
//		for(String c : cs) {
//			if(mp.containsKey(c)) {
//				Integer x= mp.get(c);
//				mp.put(c, x+1);
//			}
//			else
//				mp.put(c, 1);			
//		}
//		System.out.println(mp);
//		
//		Set<Entry<String,Integer>> entryset=mp.entrySet();
//		for (Entry<String,Integer> entry: entryset) {
//			unique+=entry.getKey();	
//		}
//		System.out.println(unique);
//		Map <String, Integer> mc = new HashMap<>();
//		mp.put("Redmi", 1000);
//		mp.put("Redmi", 2000);
//		mp.put("Sony", 1000);
//		mp.put("Nokia", 1000);
//		mp.put(null, null);
//		mp.put(null, null);
//		mp.put("vivo", null);
//		System.out.println(mp);
//		
//		Set <String> keyset = mp.keySet();
//				System.out.println(keyset);
//		Collection<Integer> values= mp.values();
//				System.out.println(values);
//				
//	Set<Entry<String, Integer>> entryset = mp.entrySet();
//		for(Entry<String, Integer> entry: entryset) {
//			System.out.println(entry);
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
//	List <Integer>li = new LinkedList ();	
//		li.add(120);
//		li.add(110);
//		li.add(120);
//		li.add(140);
//		li.add(150);
//			System.out.println(li);
//	Set <Integer> st = new LinkedHashSet ();
//			st.addAll(li);
//			st.add(455);
//		     st.add(415);
//			 st.add(120);
//			System.out.println(st);
//		List <Integer>l2 = new LinkedList ();
//		 l2.addAll(li);
//		 l2.add(455);
//	     l2.add(415);
//		 l2.add(120);
//		 l2.add(150);
//			System.out.println(l2);
//		//l2.retainAll(li);
//			//System.out.println(l2);
//		l2.removeAll(li);	
//			System.out.println(l2);
//		int size =li.size();
//			System.out.println(size);
//		li.add(170);
//		int size1 =li.size();
//		   	System.out.println(size1);
//		li.add(2,140);
//			System.out.println(li);
//		li.set(2,170);
//			System.out.println(li);
//		Integer i = li.get(3);
//			System.out.println(i);
//		for (int j=0; j<li.size(); j++) {
//			System.out.print(li.get(j));
//		}
//		for(int x:li) {
//			System.out.println(x);
//		}
//		int indexof = li.indexOf(170);
//			System.out.println(indexof);
//		int lastindexof = li.lastIndexOf(170);
//			System.out.println(lastindexof);
//		//li.clear();
//			System.out.println(li);
//		li.remove(2);
//		 	System.out.println(li);	
//		String s= "Welcome to Java Program";
//		String rev1="";
//		String rev2="";
//		
//		String[] split= s.split(" ");
//		for (int i=split[1].length()-1; i>=0; i--) {
//			rev1+=split[1].charAt(i);
//	}
//		for (int i=split[3].length()-1; i>=0; i--) {
//			rev2+=split[3].charAt(i);
//		}
//		System.out.println(split[0]+" "+rev1+" "+split[2]+" "+rev2);
		//		String s= "Welcome to Java Program @123";
//		int lowerCase=0;
//		int upperCase=0;
//		int specialChar=0;
//		int number=0;
//		
//		for (int i=0; i< s.length(); i++) {
//			char ch = s.charAt(i);
//			if (ch>='a' && ch<='z')
//				lowerCase++;
//			else if (ch>='A' && ch<='Z')
//				upperCase++;
//			else if (ch>='0' && ch<='9')
//				number++;
//			else 
//				specialChar++;
//		}
//		System.out.println(lowerCase);
//		System.out.println(upperCase);
//		System.out.println(number);
//		System.out.println(specialChar);
		
//		String s= "Welcome to Java Program";
//		int vowelCount=0;
//		int nonVowelCount=0;
//		String cs="";
//		
//		for(int i=0; i<s.length(); i++) {
//			char ch=s.charAt(i);
//			if( ch=='a' || ch== 'A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' 
//					|| ch=='o' || ch== 'O' ||ch=='u' || ch== 'U' ) {
//				vowelCount++;
//				cs+=s.charAt(i);
//			
//			}
//			else
//				nonVowelCount++;
//		}		
//		System.out.println(cs);
//		System.out.println(vowelCount);
//		System.out.println(nonVowelCount);
		
//		String s= "Welcome to Java Program";
//				String reverse="";
//		for (int i=s.length()-1; i>=0; i--) {
//			reverse+=s.charAt(i);
//		}
//		System.out.println(reverse);
//		if (s.equals(reverse)) 
//			System.out.println("Palindrome String");
//		else 
//			System.out.println("Not a Palindrome String");
//		String s = "Welcome to Java Program";
//				int length = s.length();
//		System.out.println(length);
//		
//		char c = s.charAt(9);
//		System.out.println(c);
////		for(int i=20; i<s.length();i++) {
////			System.out.println(s.charAt(i));
////		}
//		char[] cs = s.toCharArray();
//			for(int i=20; i<cs.length;i++) {
//			System.out.println(cs[i]);
//		}
//		
//		String uppercase = s.toUpperCase();
//		System.out.println(uppercase);
//		
//		String lowercase = s.toLowerCase();
//		System.out.println(lowercase);
//		
//		int indexOf = s.indexOf("e");
//		System.out.println(indexOf);
//		
//		int lastindex = s.lastIndexOf("e");
//		System.out.println(lastindex);
//		
//		String s1 = "   Naveen Kumar    ";
//		String trim = s1.trim();
//				System.out.println(trim);
//				
//				String s2= " ";
//				String s_2= "hi";
//				boolean empty = s_2.isEmpty();
//				System.out.println(empty);
//				
//				boolean startsWith = s.startsWith("Wcm");
//				System.out.println(startsWith);
//				
//				boolean endwith = s.endsWith("m");
//				System.out.println(endwith);
//				
//				boolean contains = s.contains("Java");
//				System.out.println(contains);
//				
//				String substring = s.substring(0,s.indexOf("P"));
//				System.out.println(substring);
//				
//				String[] split = s.split(" ");
//				for (String x: split) {
//				System.out.println(x);
//				}
	//		int a[] = {120,100,130,110,110,120};
//		int temp;
//		for (int i=0; i<a.length; i++) {
//			for (int j=i+1; j<a.length; j++) {
//				if (a[i]==a[j]) {
//					System.out.println(a[j]);
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//			}
//			}
//		}
//		System.out.println("Descending Order");
//		for (int i=0; i<a.length; i++) {
//			System.out.println(a[i]);
//		}
//		System.out.println ("Second max value: "+a[a.length-3]);
//		
		
		
//		int count=0;
//		for (int n=1;n<=1000; n++) {
//		
//		int i,j=0;
//		int a=n;
//		while (a>0) {
//			i=a%10;
//			j=(i*i*i)+j;
//			a=a/10;
//					}
////		System.out.println(j);	
//		if (n==j) {
//			System.out.println("Palindrome number: " +j);
//			count++;
//		}
//			}
//		System.out.println(count);
//		int a=0,b=1,c=0;
//		System.out.println(a);
//		System.out.println(b);
//		for (int i=0; i<10;i++) {
//			c=a+b; //13
//			System.out.println(c);
//			a=b; //5
//			b=c;//8
//		}
		//		int a=40, b=20;
//		System.out.println(a);	
//		System.out.println(b);
//				a=a+b; //60
//				b=a-b; //40
//				a=a-b; //20				
//		System.out.println(a);	
//		System.out.println(b);
	//		int factorial=1;
//		for (int i=1;i<=5;i++) {
//			factorial=factorial*i;
//		}
//		System.out.println(factorial);
	//	  int evencount=0;
//	  int oddcount=0;
	  //		for(int i=1; i<=100; i++) {
//			if (i%2==0) {
//			System.out.println("Even number: "+i);
//			evencount=evencount+i;
//		}
//		else {
//			System.out.println("Odd number: "+i);
//			oddcount=oddcount+i;
//		}
//		}
//		System.out.println(evencount);
//		System.out.println(oddcount);
		
		//	int i = 31;
//			if (i<=21) {
//			System.out.println("Minor age : "+ i);
//			}
//			else {
//				System.out.println("Major age : "+ i);
//							}
//		int age = 60;
//				if (age<18) {
//					System.out.println("Not eligible for voting : "+ age);
//		}
//					else if (age>18) {
//						System.out.println("Eligible for voting : "+ age);
//						}
//						else if (age >60){
//					System.out.println("Senior citizen: "+ age);
//				}
//						else {
//							System.out.println("Not Matched: "+ age);
				
}
	}
