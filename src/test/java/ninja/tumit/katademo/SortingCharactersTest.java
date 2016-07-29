package ninja.tumit.katademo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SortingCharactersTest {

	@Test
	public void lower_case() {

		// arrange
		Rack rack = new Rack();
		String value = "Wh";
		
		// action
		String result = rack.getSortString(value);
		
		// assert
		assertThat(result, is("wh"));
	}
	
	@Test
	public void letter_only() {

		// arrange
		Rack rack = new Rack();
		String value = " Ab.,c";
		
		// action
		String result = rack.getSortString(value);
		
		// assert
		assertThat(result, is("abc"));
	}	
	
}
