package com.abhidesikan.interviewprep.neetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {

    public static String encodeString(List<String> stringList) {
        String result = "";
        for (String s : stringList) {
            int length = s.length();
            result += length + "#" + s;
        }
        return result;
    }

    public static List<String> decodeString(String decodeString) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < decodeString.length(); i++) {
            int j = i;
            while (decodeString.charAt(j) != '#') {
                j += 1;
            }
            int length = Integer.parseInt((decodeString.substring(i, j)));
            result.add(decodeString.substring(j + 1, j + 1 + length));
            i = j + length;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Abhi2906*");
        stringList.add("Navya1505*");
        String encoded = encodeString(stringList);
        System.out.println(encoded);
        List<String> decoded = decodeString(encoded);
        System.out.println(decoded);
    }
}


