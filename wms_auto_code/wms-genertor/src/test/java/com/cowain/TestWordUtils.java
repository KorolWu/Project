package com.cowain;

import org.apache.commons.lang.WordUtils;

public class TestWordUtils {

	public static void main(String[] args) {
		String str = WordUtils.capitalizeFully("tb_area", new char[]{'_'});
        System.out.println(str);
	}
}
