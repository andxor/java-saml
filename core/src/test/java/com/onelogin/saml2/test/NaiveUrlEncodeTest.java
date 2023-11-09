package com.onelogin.saml2.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Test;

import com.onelogin.saml2.util.Util;

public class NaiveUrlEncodeTest {

    @Test
    public void testDemonstratingUrlEncodingNotCanonical () throws UnsupportedEncodingException {
        String theString = "Hello World!";

        String naiveEncoded = NaiveUrlEncoder.encode(theString);
        String propperEncoded = Util.urlEncoder(theString);

        Assert.assertNotEquals("Encoded versions should differ", naiveEncoded, propperEncoded);
        Assert.assertEquals("Decoded versions equal", URLDecoder.decode(naiveEncoded, StandardCharsets.UTF_8), URLDecoder.decode(propperEncoded, StandardCharsets.UTF_8));
    }

}
