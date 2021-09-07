package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			//create object mapper
			ObjectMapper mapper = new ObjectMapper(); //from jackson project
			
			//read JSON file and map/convert to java POJO: data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			//print first and last name
			System.out.println("First name= "+theStudent.getFirstName());
			System.out.println("Last name= "+theStudent.getLastName());
			
			Student theStudent1 = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			//print first and last name
			System.out.println("First name (full json)= "+theStudent1.getFirstName());
			System.out.println("Last name (full json)= "+theStudent1.getLastName());
			
			Address tempAddress = theStudent1.getAddress();
			
			//print location data
			System.out.println("Street= "+ tempAddress.getStreet() );
			System.out.println("City= "+ tempAddress.getCity() );
			
			//print langs
			for(String tempLang : theStudent1.getLanguages()) {
				System.out.println(tempLang);
			}
			
		
		
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
