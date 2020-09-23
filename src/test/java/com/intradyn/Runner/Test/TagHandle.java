package com.intradyn.Runner.Test;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.JUnitCore;

import pages.ExcelOperation;

public class TagHandle {
public static void main (String []arg) throws InvalidFormatException, IOException {
	StringBuilder sb=new StringBuilder();
	sb.append("--tags");
	ExcelOperation eo=new ExcelOperation("HandleRunningTags.xlsx");
	
	
	for(int i=1;i<=eo.getAllNumberOfRow();i++) {
	String c=eo.getExcelCellValueOf(i, 3);
	if(c.equalsIgnoreCase("yes")) {
		sb.append(eo.getExcelCellValueOf(i, 2)+",");
	}
	}

	String withoutLastComma = sb.substring( 0, sb.length( ) - ",".length( )+1 );
	System.out.println("<<<<"+withoutLastComma);
	JUnitCore junit=new JUnitCore();
	System.setProperty("cucumber.options",withoutLastComma);
	junit.run(IntradynSanityRunner.class);
}
}
