package org.utils;

import groovyjarjarantlr.StringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringUtils {
    @Before
    public void setup() {

    }
    @Test
    public void testNormal() {
        assertNotEquals(StringUtils.levinshteinDistance());
    }
}
