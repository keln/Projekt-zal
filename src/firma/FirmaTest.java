package firma;
import static org.junit.Assert.*;

import java.util.List;

import firma.Firma;
//import static org.junit.Assert.*;






import org.junit.Assert;
import org.junit.Test;

import packageModel.Usl;
import packageModel.Uslugi;

public class FirmaTest {

	@Test
	public void testInsertKlient() {
		Firma f = new Firma();
		f.insertKlient("Jan","Kowalski","92121201222");
		Assert.assertNotNull(f);
	}

	@Test
	public void testInsertUsl() {
		Firma f = new Firma();
		f.insertUsl("Tynkowanie");
		Assert.assertNotNull(f);
		
	}

	@Test
	public void testInsertUslugi() {
		Firma f = new Firma();
		f.insertUslugi("30","10/07/2005","Krakow");
		Assert.assertNotNull(f);
	}
	
	@Test
	public void testSelectUsl() {
		Firma f = new Firma();
		String x="";
		
		List<Usl> usl = f.selectUsl();
		for (Usl s : usl)
		 {
			x+= s;
		     break;
		 }
		if(x=="")
			assertEquals("", x);
		else
			assertEquals("-Tynkowanie-", x);
	}
	
	@Test
	public void testSelectUslugi() {
		Firma f = new Firma();
		String x="";
		
		List<Uslugi> uslugi = f.selectUslugi();
		for (Uslugi s : uslugi)
		 {
			x+= s;
		     break;
		 }
		if(x=="")
			assertEquals("", x);
		else
			assertEquals("30 - Krakow - 10/07/2005", x);
	}

}
