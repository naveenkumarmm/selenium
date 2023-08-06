package Title_Holder;

public class Champions extends Master_Champions {
	
	public void csk(int TitleNo, String FranchiseName) {
		System.out.println("Number of Titles : "+ TitleNo);
		System.out.println("Successful Franchise : "+ FranchiseName);
	}
	public void kkr () {
		System.out.println("Kolkata Knignt Riders");
	}
		public void srh () {
			System.out.println("Sun Riser Hydrabad");
		
	}
 public static void main (String[] args)  {
	 Champions b = new Champions();
			 b.csk(2,"KKR");
	 Master_Champions a = new Master_Champions();
			 a.csk(5, "CSK");
 }
 
}
