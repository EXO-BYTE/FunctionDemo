package com.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;


public class EvaluateFeedback {

	ArrayList<CallQualityFeedBack> itemlist = new ArrayList<>();
     
	EvaluateFeedback()
	{
		itemlist.add(new CallQualityFeedBack(11,"4563782736","Average",4));
		itemlist.add(new CallQualityFeedBack(21,"5678782736","Good",3));
		itemlist.add(new CallQualityFeedBack(31,"4534562736","Poor",1));
	}
	
	public void forEach(Consumer<CallQualityFeedBack> c)
	{
		for(CallQualityFeedBack i:itemlist)		{
			c.accept(i);
		}
	}
	public void forEachItem(Predicate<CallQualityFeedBack> c) {
		for(CallQualityFeedBack i:itemlist)	{
			if(c.test(i))
			{
				System.out.println(i+"is good quality");
			}
			else
			{
				System.out.println(i+"is bad quality");
			}
			
		}
	}
	public static void main(String[] args) {
		EvaluateFeedback obj = new EvaluateFeedback();
		obj.forEach((c)->System.out.println(c));
		obj.forEachItem((c)->c.getRating()>3);
	}

	

}
