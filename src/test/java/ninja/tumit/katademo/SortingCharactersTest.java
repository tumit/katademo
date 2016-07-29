package ninja.tumit.katademo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SortingCharactersTest {

	Rack rack = new Rack();
	
	@Test
	public void lower_case() {

		// arrange		
		String value = "Wh";
		
		// action
		String result = rack.getSortString(value);
		
		// assert
		assertThat(result, is("hw"));
	}
	
	@Test
	public void letter_only() {

		// arrange
		String value = " Ab.,c";
		
		// action
		String result = rack.getSortString(value);
		
		// assert
		assertThat(result, is("abc"));
	}	
	
	@Test
	public void simple_sort() {

		// arrange
		String value = " Bca";
		
		// action
		String result = rack.getSortString(value);
		
		// assert
		assertThat(result, is("abc"));
	}	
	
}
