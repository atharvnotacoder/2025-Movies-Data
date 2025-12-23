package com.tka.dec22.list;

import java.util.ArrayList;
import java.util.List;

import com.tka.dev23.actorInfo.Actor;

public class ActorList {
	
	public List<Actor> pathanCast(){
		List<Actor> pathanCast=new ArrayList<Actor>();
			pathanCast.add(new Actor("Shah Rukh Khan", 58, 90, 7700.50, "1992-06-25"));
			pathanCast.add(new Actor("Deepika Padukone", 38, 35, 500.75, "2006-11-10"));
			pathanCast.add(new Actor("John Abraham", 51, 50, 400.60, "2003-05-09"));
		return pathanCast;
	}
	
	public List<Actor> threeidiotsCast(){
		List<Actor> threeidiotsCast=new ArrayList<Actor>();
		threeidiotsCast.add(new Actor("Aamir Khan", 59, 60, 1800.25, "1984-04-20"));
		threeidiotsCast.add(new Actor("R. Madhavan", 54, 55, 350.40, "1996-08-23")); 
		threeidiotsCast.add(new Actor("Sharman Joshi", 45, 40, 200.10, "1999-07-09"));
		return threeidiotsCast;
	}
	
	public List<Actor> padmavatCast(){
		List<Actor> padmavatCast=new ArrayList<Actor>();
		padmavatCast.add(new Actor("Deepika Padukone", 38, 35, 500.75, "2006-11-10"));
		padmavatCast.add(new Actor("Ranveer Singh", 38, 30, 950.40, "2010-12-10")); 
		padmavatCast.add(new Actor("Shahid Kapoor", 43, 45, 700.80, "2003-10-03"));
		return padmavatCast;
	}
	
	public List<Actor> chennaiExpressCast(){
		List<Actor> chennaiExpressCast=new ArrayList<Actor>();
		chennaiExpressCast.add(new Actor("Shah Rukh Khan", 58, 90, 7700.50, "1992-06-25"));
		chennaiExpressCast.add(new Actor("Deepika Padukone", 38, 35, 500.75, "2006-11-10")); 
		return chennaiExpressCast;
	}
	
	public List<Actor> bajiraoMastaniCast(){
		List<Actor> bajiraoMastaniCast=new ArrayList<Actor>();
		bajiraoMastaniCast.add(new Actor("Ranveer Singh", 38, 30, 950.40, "2010-12-10"));
		bajiraoMastaniCast.add(new Actor("Deepika Padukone", 38, 35, 500.75, "2006-11-10"));
		bajiraoMastaniCast.add(new Actor("Priyanka Chopra Jonas", 41, 70, 650.80, "2002-01-01")); 
		return bajiraoMastaniCast;
	}
}
