package com.automationpractice.Seleniumautomation.transform;

import cucumber.api.Transformer;

public class TransformData extends Transformer<String> {

	@Override
	public String transform(String args) {
		return args + " Transform";
	}

}
