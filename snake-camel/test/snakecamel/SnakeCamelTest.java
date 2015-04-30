package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import snakecamel.SnakeCamelUtil;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelTest() {
		SnakeCamelUtil s = new SnakeCamelUtil();
		String expected = "SoFtWaRe";
		String actual = s.snakeToCamelcase("so_ft_wa_re");
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void camelToSnakeTest() {
		SnakeCamelUtil s = new SnakeCamelUtil();
		String expected = "so_ft_wa_re";
		String actual = s.camelToSnakecase("SoFtWaRe");
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}

	@Test
	public void capitalizeTest() {
		SnakeCamelUtil s = new SnakeCamelUtil();
		String expected = "Hello";
		String actual = s.capitalize("hello");
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
	
	@Test
	public void uncapitalizeTest() {
		SnakeCamelUtil s = new SnakeCamelUtil();
		String expected = "hello";
		String actual = s.uncapitalize("Hello");
		assertThat(actual, is(expected));
		//fail("Not yet implemented");
	}
}
