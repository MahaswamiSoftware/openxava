package org.openxava.test.tests.byfeature;

import org.openqa.selenium.*;

public class CollectionTest extends WebDriverTestBase {
	
	public void testChangeSectionNotLoadCollection() throws Exception {
		goModule("Invoice");
		execute("CRUD.new");
		setValue("year", "2002");
		setValue("number", "1");
		execute("Sections.change", "activeSection=1");
		assertCollectionRowCount("details", (0+2));
		execute("CRUD.refresh");
		assertCollectionRowCount("details", (2+2));
		
		goModule("CustomerWithSection");
		execute("CRUD.new");
		setValue("number", "43");
		execute("Sections.change", "activeSection=1");
		assertCollectionRowCount("states", 0);
		execute("CRUD.refresh");
		assertCollectionRowCount("states", 1);
		
		goModule("Office"); 
		execute("CRUD.new");
		setValue("defaultCarrier.number","1");
		WebElement label = getDriver().findElement(By.id("ox_openxavatest_Office__label_defaultCarrier___number"));
		label.click();
		wait(getDriver());
		assertCollectionRowCount("defaultCarrier___fellowCarriers", (3+2));
		assertCollectionRowCount("defaultCarrier___fellowCarriersCalculated", (3+1));
	}

}
