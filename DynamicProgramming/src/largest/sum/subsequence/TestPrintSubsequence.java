package largest.sum.subsequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestPrintSubsequence {

	public static void main(String[] args) {
		int a[]= {-2, -3, 4, -1, -2, 1, 5, -3};
		printLargestSumSubsequence(a);
	}

	private static void printLargestSumSubsequence(int[] a) {
	int max_so_far=0, max_ending_here=0;
	int start=0,s=0,e=0;
	for(int i=0;i<a.length;i++)
			{
		max_ending_here=max_ending_here+=a[i];	
		if(max_so_far<max_ending_here)
		{	max_so_far=max_ending_here;
		start=s;
		e=i;
		s++;
		}
			}
	
	
	File f=new File("C:/text");
	try {
		FileInputStream fis=new FileInputStream(f);
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	}

}
