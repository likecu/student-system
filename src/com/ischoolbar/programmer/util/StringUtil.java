package com.ischoolbar.programmer.util;
/**
 * 
 * @author 周杨
 *String类的一些公用操作方法
 */
public class StringUtil {
	public static boolean isEmpty(String str) {
		if(str == null||"".equals(str))return true;
		return false;
	}

}
