package com.capgeminiday6.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class FruitTest {

			  String[] fruits;
				@Test
				void test() {
					
					HashMap<String,ArrayList<String>> favouritefruit = new HashMap<>();
					
					fruits= new String[] {"Orange","apple","Guava"};
					favouritefruit.put("Navya", new ArrayList<String>(Arrays.asList(fruits)));
					fruits= new String[] {"Muskmealon","Custerdapple","Watermealon"};
					favouritefruit.put("Akhi", new ArrayList<String>(Arrays.asList(fruits)));
					
					for (Entry<String, ArrayList<String>> entry : favouritefruit.entrySet()) {
						System.out.println("Key= "+entry.getKey()+ ",value = "+entry.getValue());
						
					}
				}
	}


