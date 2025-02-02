package com.bettingground.kill._common;

import org.apache.commons.lang3.*;

public class TokenGenerator {

    private static final int TOKEN_LENGTH = 20;

    public static String randomCharacter(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String randomCharacterWithPrefix(String prefix) {
        return prefix + randomCharacter(TOKEN_LENGTH - prefix.length());
    }

}
