package pack1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class testmain {

	@Test
	public void testconvert() {
		Lettercombo lettercombolength3 = new Lettercombo();
		assert (lettercombolength3.convert() != null);
		assert (lettercombolength3.convert().equals("AAA"));
	}

	@Test
	public void testfill() {
		Lettercombo lettercombolength3 = new Lettercombo();
		lettercombolength3.fill();
		assert (lettercombolength3.convert() != null);
		assert (lettercombolength3.convert().equals("ABC"));
		Lettercombo lettercombolength4 = new Lettercombo(4);
		lettercombolength4.fill();
		assert (lettercombolength4.convert().equals("ABCD"));

	}

	@Test
	public void testans() {
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill();
		assert (Runner.computation() != 512);
	}

}
