package Practice_Methods;
public class method9 {
	static void showList(String...s) {
		for(int i=0;i<s.length;i++) {
			System.out.println(i+1+". "+s[i]);
		}
	}
	public static void main(String[] args) {
		showList("Ashim","Abinash","Saachika Shreya");
	}
}
