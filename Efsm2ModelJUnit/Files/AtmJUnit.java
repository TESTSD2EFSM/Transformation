import static org.junit.Assert.*;

import org.junit.Test;

public class AtmJUnit {

	@Test
	public void testvalidadeCard01() {
		Bank bank = new Bank();
		boolean output = bank.validadeCard("111");
		assertTrue(output);
	}
	@Test
	public void testvalidadeCard()02 {
		Bank bank = new Bank();
		boolean output = bank.validadeCard("222");
	  	assertFalse(output);
	}
	@Test
	public void testvalidadePassword01() {
		Bank bank = new Bank();
		boolean output = bank.validadePassword("123");
		assertTrue(output);
	}
	@Test
	public void testvalidadePassword02() {
		Bank bank = new Bank();
		boolean output = bank.validadePassword("246");
	  	assertFalse(output);
	}
	@Test
	public void testvalidadeBalance01() {
		Bank bank = new Bank();
		boolean output = bank.validadeBalance(50.0f);
		assertTrue(output);
	}
	@Test
	public void testvalidadeBalance02() {
		Bank bank = new Bank();
		boolean output = bank.validadeBalance(200f);
	  	assertFalse(output);
	}

