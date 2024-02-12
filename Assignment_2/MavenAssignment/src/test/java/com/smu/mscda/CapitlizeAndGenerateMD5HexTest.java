package com.smu.mscda;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CapitlizeAndGenerateMD5HexTest {

    private String INPUT = "smu";
    @Test
    public void testCapitalized() {
        Assertions.assertEquals("Smu", App.Capitalize(INPUT));
    }

    @Test
    public void testMD5Hex() {
        Assertions.assertEquals("3773300c2f413cc7136f8d74b305519c", App.GenerateMD5hex(INPUT));
    }
}
