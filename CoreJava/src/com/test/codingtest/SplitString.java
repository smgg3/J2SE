package com.test.codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitString {



public static class WordSplitWithDict {

    private static  String[] dict = {"i","like","the","blue","sky"};

    public static void main(String[] args) {

        Arrays.parallelSort(dict);
        List splitWords = splitWord("ilikethebluesky");
        System.out.println(splitWords.toString());

    }

    private static boolean doesWordExist(String[] dict, String key){
        int index = 0;

        index = Arrays.binarySearch(dict, key.toLowerCase());
        if(index>= 0) {
            return true;
        }
        return false;
    }

    private static List splitWord(String phrase) {
        char[] cArray = phrase.toCharArray();
        String word = "";
        List splitwords = new ArrayList();

        for(int i=0; i< cArray.length; i++){
            word+=cArray[i];
            if(doesWordExist(dict, word)) {
                splitwords.add(word);
                word = "";
            }
        }
        return splitwords;
    }

}

}
