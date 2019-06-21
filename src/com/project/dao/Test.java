package com.project.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Calendar;
import java.util.TimeZone;


public class Test extends User{
	Test(int i){
		System.out.println(i);
	}
	Test(String s){
		System.out.println(s);
	}
	Test(int i, String s){
		this(1);
	}
	Test(){
		System.out.println("test");
	}
	public static void main(String[]args) throws ParseException{
		String string = "1 & ";
		string.replace("& ", "");
		System.out.println(string);
//		TimeZone timeZone = TimeZone.getTimeZone("EST");
//		System.out.println(timeZone);
//		Calendar localCalendar = Calendar.getInstance();
//		Calendar calendar = Calendar.getInstance(timeZone);
//		calendar.set(Calendar.HOUR_OF_DAY, 0);
//        calendar.set(Calendar.SECOND, 0);
//        calendar.set(Calendar.MILLISECOND, 0);
//        calendar.set(Calendar.MINUTE, 217);
//        System.out.println(calendar.getTimeInMillis());
//        System.out.println(localCalendar.get(Calendar.ZONE_OFFSET) + localCalendar.get(Calendar.DST_OFFSET));
//        System.out.println(calendar.getTimeInMillis() - (localCalendar.get(Calendar.ZONE_OFFSET) + localCalendar.get(Calendar.DST_OFFSET)));
		Test test = new Test();
		System.out.println(test instanceof Test);
		System.out.println(test instanceof Object);
		Method[] methods = Test.class.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		Constructor<?>[] constructors = User.InnerUser.class.getConstructors();
		System.out.println(constructors[0].getName());
	}
	
	private static void test1() {
		int i = 2147483647;
		System.out.println(i+1);
		do {
			System.out.println("test");
		} while (false);
		
		User user1 = new User();
		User user2 = new User();
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		
		Test test = new Test();
		
		String s = "msg201904011445_b,msg201904011446_b,msg201904011447_b,msg201904011448_b,msg201904011449_b,msg201904011450_b,msg201904011451_b,msg201904011452_b,msg201904011453_b,msg201904011454_b,msg201904011455_b,msg201904011456_b,msg201904011457_b,msg201904011834_b,msg201904011835_b,msg201904011836_b,msg201904011837_b,msg201904011838_b,msg201904011839_b,msg201904011840_b,msg201904011841_b,msg201904011842_b,msg201904011843_b,msg201904011844_b,msg201904011845_b,msg201904011846_b,msg201904011847_b,msg201904011848_b,msg201904011849_b,msg201904011850_b,msg201904011851_b,msg201904011852_b,msg201904011853_b,msg201904011854_b,msg201904011855_b,msg201904011856_b,msg201904011857_b,msg201904011858_b,msg201904011859_b,msg201904011860_b,msg201904011861_b,msg201904011862_b,msg201904011863_b,msg201904011864_b,msg201904011865_b,msg201904011866_b,msg201904011867_b,msg201904011868_b";
		String[] split = s.split(",");
		System.out.println(split.length);
	}
	private static void test2() {
		Class intClass = double.class;
	}
	
	
}
