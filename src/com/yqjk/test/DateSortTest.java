package com.yqjk.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.DateTools.Resolution;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.LongField;

public class DateSortTest {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date1 = sdf.parse("2014/6/10 20:21:39");
		LongField releasetime1 = new LongField("releasetime",
				DateTools.stringToTime(DateTools.dateToString(
						date1, Resolution.MILLISECOND)),
				Store.YES);
		System.out.println(releasetime1);
		
		Date date2 = sdf.parse("2014/6/10 17:14:23");
		LongField releasetime2 = new LongField("releasetime",
				DateTools.stringToTime(DateTools.dateToString(
						date2, Resolution.MILLISECOND)),
						Store.YES);
		System.out.println(releasetime2);
		
		Date date3 = sdf.parse("2014/6/10 11:51:36");
		LongField releasetime3 = new LongField("releasetime",
				DateTools.stringToTime(DateTools.dateToString(
						date3, Resolution.MILLISECOND)),
						Store.YES);
		System.out.println(releasetime3);
		
		
		

	}

}
