import java.io.*; 
import java.util.Arrays; 
import java.util.Collection;

//For unit testing
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class Test1 { 

    // fields used together with @Parameter must be public
    @Parameter(0)
    public String s1;
    @Parameter(1)
    public String s2;
    @Parameter(2)
    public boolean result;


    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] { { "test" , "east", false }, { "table", "bleat", true }, { "eat", "tar", false } };
        return Arrays.asList(data);
    }

    @Test
    public void testAreAnagram() {
        Test1 tester = new Test1();
        assertEquals("Result", result, tester.areAnagram(s1, s2));
    }

	/* function to check whether two strings are 
	anagram of each other */
	static boolean areAnagram(String str1, String str2) 
	{ 
        // Get lenghts of both strings 
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

		int n1 = chars1.length; 
		int n2 = chars2.length; 

		// Anagram must have same length
		if (n1 != n2) 
			return false; 

		// Sort both strings 
		Arrays.sort(chars1); 
		Arrays.sort(chars2); 

		// Compare sorted strings 
		for (int i = 0; i < n1; i++) 
			if (chars1[i] != chars2[i]) 
				return false; 

		return true; 
	} 

	public static void main(String args[]) 
	{ 
		if (areAnagram(args[0], args[1])) 
			System.out.println("The two strings are"
							+ " anagram of each other"); 
		else
			System.out.println("The two strings are not"
							+ " anagram of each other"); 
	} 
} 
