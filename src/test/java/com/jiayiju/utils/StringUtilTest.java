package com.jiayiju.utils;

import org.junit.Test;

public class StringUtilTest {
	/**
	 * 
	 * @Title: testToHtml
	 * @Description: 测试ToHtml()方法
	 * @return: void
	 */
	@Test
	public void testToHtml() {
		String str = "哈哈哈哈";
		String newStr = StringUtil.toHtml(str);
		System.out.println(newStr);
	}

	/**
	 * 
	 * @Title: testIsPhone
	 * @Description: 测试是否是个手机号
	 * @return: void
	 */
	@Test
	public void testIsPhone() {
		String str = "18360170519";
		boolean flag = StringUtil.isPhoneNumber(str);
		System.out.println("是否是一个合法的手机号：" + flag);
	}

	/**
	 * 
	 * @Title: testIsEmail
	 * @Description: 测试是否是合法邮箱
	 * @return: void
	 */
	@Test
	public void testIsEmail() {
		String str = "jiayiju@qq.com";
		boolean flag = StringUtil.isEmail(str);
		System.out.println("是否是一个合法的邮箱：" + flag);
	}

	@Test
	public void testHasText() {
		String str = "1";
		System.out.println("是否是一个合法的字符串：" + StringUtil.hasText(str));
	}
}
