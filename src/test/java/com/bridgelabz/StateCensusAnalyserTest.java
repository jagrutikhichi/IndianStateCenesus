package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StateCensusAnalyserTest {
	
	public static final String csvPath = "C:\\Users\\Jagruti Khichi\\Eclipse-workspase\\IndianStatesCensusAnalyser\\Data\\censusFile.csv";

	@Test
	public void givenCensusCsvFile_ReturnCorrectRecords( ) {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int recordsNo = stateCensusAnalyser.LoadIndiaCensusData(csvPath);
		assertEquals(640, recordsNo);
	}
}
