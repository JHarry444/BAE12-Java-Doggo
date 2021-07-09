package com.qa.doggo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCompetition {

	private Competition doggo = new Competition();

	@Test
	public void testContains() {
		assertEquals(true, doggo.findPlaces(11).contains("12th"));
	}

	@Test
	public void testDoesntContain() {
		assertEquals(false, doggo.findPlaces(12).contains("12th"));
	}

	@Test
	public void testLength() {
		assertEquals(true, doggo.findPlaces(12).size() == 99);
	}

}
