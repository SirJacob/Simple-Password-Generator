package com.github.sirjacob.passwordgenerator;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Sir Jacob <https://github.com/SirJacob>
 */
public class Gen {

    static String alphabetic(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    static String alphanumeric(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    static String ascii(int length) {
        return RandomStringUtils.randomAscii(length);
    }

    static String numeric(int length) {
        return RandomStringUtils.randomNumeric(length);
    }
}
