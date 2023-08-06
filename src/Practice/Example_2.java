package Practice;

public class Example_2 {
	public static void main (String[] args) {
		//Print uppercase as lowercase vice versa
		String s= "Welcome to Java Program";
		String[] split =s.split(" ");
//		String sub = s.substring(split[0].length(), split[3].length());
							
			for(int i=0; i<s.length(); i++) {
				if(i%2==0) {
					int ch =s.charAt(i);
					if(ch>64&&ch<91) {
					ch=ch+32;
					System.out.print((char)ch); 	
					}
					else if(ch>96&&ch<123) {
					ch=ch-32;
					System.out.print((char)ch); 
					}
					if(ch==32)
					System.out.print(" ");

			}
				else if (i%2==1) {
					int ch =s.charAt(i);
					if(ch>64&&ch<91) {
					System.out.print((char)ch); 	
					}
					else if(ch>96&&ch<123) {
					System.out.print((char)ch); 
					}
					if(ch==32)
					System.out.print(" ");
				}
	
		
//			for(int i=split[0].length()-1;i>=0;i--) {
//				rev+=split[0].charAt(i);
//		
//		}
//			for(int j=split[2].length()-1;j>=0;j--) {
//				rev1+=split[2].charAt(j);
//			}
//	
//		
//		System.out.println(rev+split[1]+rev1+split[3]);
//		
		
		
	
	}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private int rollNum;
//	private String name;
//	private long phNo;
//	
//	public int getRollNum() {
//		return rollNum;
//	}
//	public void setRollNum(int rollNumber) {
//		this.rollNum = rollNumber;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String Name) {
//		this.name = Name;
//	}
//	public long getPhNo() {
//		return phNo;
//	}
//	public void setPhNo(long phoneNumber) {
//		this.phNo = phoneNumber;
//	}
	


