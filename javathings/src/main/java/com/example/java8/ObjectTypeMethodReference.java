package com.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ObjectTypeMethodReference {
	public static void main(String... args) {
		List<Shipments> sl = new ArrayList<Shipments>();

		//using anonymous class
		calculateOnShipements(sl, new Function<Shipments,Double>() {
			@Override
			public Double apply(Shipments s) {
				return s.calculateWeight();
			}});
		
		//using Lambda expression
		calculateOnShipements(sl, (s) -> s.calculateWeight());
		
		//using method Reference
		calculateOnShipements(sl,Shipments::calculateWeight);
	}
	
    public static List<Double> calculateOnShipements(List<Shipments> sl,Function<Shipments,Double> f){
        List<Double> results = new ArrayList<>();
        for(Shipments s : sl) {
            results.add(f.apply(s));
          }
        
        return results;
    }
}

class Shipments{
	public double calculateWeight() {
		double weight = 0;
		//does something here
		return weight;
	}
}
