package pack1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class testmain {

	@Test
	public void testconvert() {
		Lettercombo lettercombo = new Lettercombo();
		assert(lettercombo.convert() != null);
		assert(lettercombo.convert().equals("AAA"));
	}
	@Test
	public void testfill() {
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill(1);
		assert(lettercombo.convert() != null);
		assert(lettercombo.convert().equals("BCD"));
		lettercombo.fill(0);
		assert(lettercombo.convert().equals("ABC"));
	}
/*
	@Test
	public void testincremtn() {
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill(1);
		assert(lettercombo.increment() == true);
		assert(lettercombo.increment() == true);
		lettercombo.fill(99);
		assert(lettercombo.increment() != true);
		lettercombo.fill(9);
		assert(lettercombo.increment() != true);
	}
	
	
	@Test
	public void testcomparecurrent() {
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill(1);
		assert(lettercombo.comparecurrent() != true);
	}
	

	
	@Test
	public void testans() {
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill(0);
		assert(Runner.computation() != 512 );
	}
	*/
}

