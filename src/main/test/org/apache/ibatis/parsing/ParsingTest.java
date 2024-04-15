package org.apache.ibatis.parsing;


import org.junit.jupiter.api.Test;

import java.io.InputStream;

public class ParsingTest {

    @Test
    public void test() {
        InputStream resourceAsStream = this.getClass().getResourceAsStream("InspectionLedgerDao.xml");
        XPathParser xPathParser = new XPathParser(resourceAsStream);
        String s = xPathParser.evalString("//sql");
        System.out.println(s);
    }
}
