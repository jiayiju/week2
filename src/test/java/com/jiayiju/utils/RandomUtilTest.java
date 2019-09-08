package com.jiayiju.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int num = RandomUtil.random(1, 10);
			System.out.print(num + " ");
		}
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 3);
		for (int i : subRandom) {
			System.out.print(i + " ");
		}
	}

	@Test
	public void testRandomCharacter() {
		String str = "";
		for (int i = 0; i < 4; i++) {
			str+=RandomUtil.randomCharacter();
		}
		System.out.println(str);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(5);
		System.out.println(str);
	}

}
