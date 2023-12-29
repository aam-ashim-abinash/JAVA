package Student_Challenge;
public class Sum {
	public static void main(String[] args) {
		int []A= {1,2,3,4,5,6,7,8,9};
		int sum=0, sum2=0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		for(int x:A) {
			sum2+=x;
		}
		System.out.println("The sum of all of the elements(traditional for) is "+sum);
		System.out.println("The sum of all of the element is(for each) "+sum2);
	}

}
