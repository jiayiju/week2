package com.jiayiju.utils;

public class StringUtil {
	/*
	 * 方法功能：将字符串转换成html文本，如果遇到“\n”换行换符，则要将这一段文本使用<p></p>标签
	 * 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
	 * 使用场景：网页文本框传到后台的字符串就可能就会回车换行
	 */
	public static String toHtml(String src) {
		if (!hasText(src)) {
			return "字符串不能为空";
		}
		// System.getProperty("line.separator")
		String str = src.replaceAll(System.getProperty("line.separator"), "|");
		String newStr = "";
		String[] split = str.split("\\|");
		for (String string : split) {
			newStr += "<p>" + string + "</p>";
		}
		return newStr;
	}

	public static boolean isPhone(String number) {
		// 如果为空则返回false
		if (!hasText(number))
			return false;
		// 规则
		String regsex = "[1][3578]\\d{9}";
		return number.matches(regsex);

	}

	public static boolean isEmail(String email) {
		// 如果为空则返回false
		if (!hasText(email))
			return false;
		String regsex = "[A-z]+[A-z0-9_-]*\\@[A-z0-9]+\\.[A-z]+";
		return email.matches(regsex);

	}

	// 方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src) {
		if (null != src && "".equals(src)) {
			return true;
		}
		return false;
	}

	// 方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src) {
		if (src.length() > 0 && !"".equals(src)) {
			return true;
		} else {
			return false;
		}
	}

	// 方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	public static String randomChineseString(int length) {
		return null;
		// TODO 实现代码
	}

	// 方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	public static String generateChineseName() {
		return null;
		// TODO 实现代码
	}

}
