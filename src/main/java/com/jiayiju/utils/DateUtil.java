package com.jiayiju.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil
 * @Description: 日期工具类
 * @author:jyj
 * @date: 2019年9月5日 下午4:02:32
 */
public class DateUtil {

	// 返回一个在某个时间段的随机日期
	public static Date randomDate(Date minDate, Date maxDate) {
		// 从1970年到minDate的毫米数
		long l1 = minDate.getTime();
		// 从1970年到maxDate的毫米数
		long l2 = maxDate.getTime();

		Calendar c = Calendar.getInstance();

		long l3 = (long) (Math.random() * (l2 - l1 + 1) + l1);
		c.setTimeInMillis(l3);

		return c.getTime();

	}

	/**
	 * 
	 * @Title: getDateByMonthSub
	 * @Description: 用传入的日期减去对应的月份
	 * @param date
	 * @param month
	 * @return
	 * @return: Date
	 */
	public static Date getDateByMonthSub(Date date, Integer month) {
		Calendar c = Calendar.getInstance();
		// 用传入的日期,初始化日历类
		c.setTime(date);
		// 用日历类减去month
		c.add(Calendar.MONTH, -month);
		return c.getTime();
	}

	/*
	 * 方法1： 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	/**
	 * 
	 * @Title: getDateByInitMonth
	 * @Description: 返回当月的月初0时0分0秒
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByInitMonth(Date src) {
		// 日历类
		Calendar c = Calendar.getInstance();
		// 根据时间创建日历
		c.setTime(src);
		// 设置日、时、分、秒
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		return c.getTime();

	}

	/*
	 * 方法2： 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。 例如一个Date对象的值是2019-05-18
	 * 11:37:22，则返回的时间为2019-05-31 23:59:59 例如一个Date对象的值是2019-02-05
	 * 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	/**
	 * 
	 * @Title: getDateByFullMonth
	 * @Description: 返回当月的月末23时59分59秒
	 * @param src
	 * @return
	 * @return: Date
	 */
	public static Date getDateByFullMonth(Date src) {
		// 日历类
		Calendar c = Calendar.getInstance();
		// 根据时间创建日历
		c.setTime(src);
		// 让月份加1，再变为月初，再减1秒

		// 月份加1
		c.add(Calendar.MONTH, 1);
		// 变为月初
		Date date = getDateByInitMonth(src);
		// 再初始化日历
		c.setTime(date);
		// 秒数-1
		c.add(Calendar.SECOND, -1);
		return c.getTime();

	}

}
