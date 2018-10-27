package largest.sum.subsequence;

public class TestSimple {

	public static void main(String[] args) {
int a[]= {-2, -3, 4, -1, -2, 1, 5, -3};
findLargestSumSubsequence(a);

	}

	private static void findLargestSumSubsequence(int[] a) {
int max_So_far = 0,max_ending_here=0;
for(int i=0;i<a.length;i++)
{
max_ending_here=max_ending_here+a[i];
if(max_So_far<max_ending_here)
	max_So_far=max_ending_here;
if(max_So_far<=0)
	max_So_far=0;
}

	}

}
