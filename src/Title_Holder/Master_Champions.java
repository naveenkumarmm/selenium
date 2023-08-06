package Title_Holder;
import Non_Title_Holder.Non_Champions;
public class Master_Champions extends Non_Champions {
	public void csk () {
		System.out.println("Chennai Super Kings");
	}
		public void mi () {
			System.out.println("Mumbai Indians");
		}	
		@Override
		public void Non_titler() {
		System.out.println("RCB");
		}
			public void csk (int TitleNo, String FranchiseName) {
				System.out.println("Number of Titles : "+ TitleNo);
				System.out.println("Most Successful Franchise : "+ FranchiseName);
			}
				public void csk (int iplseason) {
				System.out.println("Maximum IPL Sesons Played : "+ iplseason);
	}
 public static void main (String[] args)  {
	 Master_Champions a = new Master_Champions();
//			 a.csk(5, "CSK");
//			 a.csk(14);
			 a.Non_titler();
			 a.rcb();
			 
 }
}
