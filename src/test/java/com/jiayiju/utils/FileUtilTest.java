package com.jiayiju.utils;


import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String str = FileUtil.getExtendName("FileUtil.java");
		System.out.println(str);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

}
