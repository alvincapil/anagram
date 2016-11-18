package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.Test;

public class TestAnagram extends TestCase{

	public TestAnagram(String testName){
		super(testName);
	}
	
	@Test
	public void testWord() {
        ReadFile rf = new ReadFile();
        rf.sort("pinkish");
        rf.sort("kinship");
        assertEquals(Arrays.asList("pinkish", "kinship"), rf.readWordList());
	}

}
