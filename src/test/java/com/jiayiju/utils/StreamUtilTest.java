package com.jiayiju.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadTextFileInputStream() {
		try {
			FileInputStream fis = new FileInputStream(new File("E:/test.txt"));
			String str = StreamUtil.readTextFile(fis);
			System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testReadTextFileFile() {
		String str = StreamUtil.readTextFile(new File("E:/test.txt"));
		System.out.println(str);
	}

}
