/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jsjf;

import java.util.Comparator;

/**
 *
 * @author zgarciag
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        return s1.length()-s2.length();
    }

    
}
