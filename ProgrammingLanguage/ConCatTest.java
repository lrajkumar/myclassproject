package ProgrammingLanguage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConCatTest {

	@Test
	public void Concattest() {
		MyJUnitClass junit =new MyJUnitClass();
		String result =junit.concat("Hello", "World");
		assertEquals("HelloWorld",result);
		
		
	}

}
