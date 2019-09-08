package com.jiayiju.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	/**
	 * 
	 * @Title: testGetDateByInitMonth
	 * @Description: 让时间变为月初
	 * @return: void
	 */
	@Test
	public void testGetDateByInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 12);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
	}

	/**
	 * 
	 * @Title: testGetDateByFullMonth
	 * @Description: 让时间变为月末
	 * @return: void
	 */
	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2018, 9, 12);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(date);
		System.out.println(str);
	}

}
