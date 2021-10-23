package com.slokam.funimpl;

import java.util.function.Function;

public class FunctionImpl implements Function<Integer, String>{

	@Override
	public String apply(Integer t) {
		return t+"";
	}

	public static void main(String[] args) {
		Function f = new FunctionImpl();
		String v = (String)f.apply(20);
		
		//System.out.println(v);
		Function<String,String> fun = a -> a;
		System.out.println(fun.apply("SLOKAM"));
	}
}
