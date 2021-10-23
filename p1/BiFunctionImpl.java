package com.slokam.funimpl;

import java.util.function.BiFunction;

public class BiFunctionImpl implements BiFunction<Integer, Integer, Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		return t + u;
	}

	public static void main(String[] args) {
		BiFunction bif = new BiFunctionImpl();
		System.out.println(bif.apply(10, 20));
		BiFunction<Integer, Integer, String> bif2 = (a, b) -> {
			return a+b.toString();
		};
		System.out.println(bif2.apply(10, 40));

	}
}
