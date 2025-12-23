package com.tka.dec22.Map;

import java.util.HashMap;
import java.util.List;

import com.tka.dec22.list.ActorList;
import com.tka.dev23.actorInfo.Actor;

public class Map {
	
	public static void main(String[] args) {

	ActorList a1=new ActorList();
	List<Actor> bajiraoMastaniCast=a1.bajiraoMastaniCast();
	List<Actor> chennaiExpressCast=a1.chennaiExpressCast();
	List<Actor> padmavatCast=a1.padmavatCast();
	List<Actor> pathanCast=a1.pathanCast();
	List<Actor> threeidiotsCast=a1.threeidiotsCast();
	
	HashMap<String, List<Actor>> hm=new HashMap<String, List<Actor>>();
		hm.put("Three Idiots",	threeidiotsCast);
		hm.put("BajiRao Mastani", bajiraoMastaniCast);
		hm.put("Padmavat", padmavatCast);
		hm.put("Chennai Express", chennaiExpressCast);
		hm.put("Pathaan", pathanCast);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Total Number of Movies: "+hm.size());
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("All Movies: "+hm.keySet());
		
		System.out.println("------------------------------------------------------");
		
		for(String movie:hm.keySet()) {
			System.out.println("Movie: "+movie);
			
			List<Actor> actors=hm.get(movie);
			for(Actor a:actors) {
				System.out.println(a.getName());
			}
			System.out.println("--------------------");
		}
		
		System.out.println("------------------------------------------------------");
		
		
}
}
