package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StateCensusAnalyserTest {
	
	private static final String csvPath ="C:\\Users\\Jagruti Khichi\\Eclipse-workspase\\IndianStatesCensusAnalyser\\Data\\IndiaStateCensusData.csv";
	private static final String csvWrongPath = "C:\\Users\\Jagruti Khichi\\Eclipse-workspase\\IndianStatesCensusAnalyser\\IndiaStateCensusData.csv";
	
	@Test
	public void givenCensusCsvFile_returnCorrectRecords() throws IOException, CensusAnalyserException {
		StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
		int recordsNumb = stateCensusAnalyser.LoadIndiaCensusData(csvPath);
		assertEquals(29,recordsNumb);	
	}
	
	@Test
	public void given_IndiaCensusData_CsvFile_ShouldThrowException() throws IOException {
		try {
			StateCensusAnalyser censusAnalyZer = new StateCensusAnalyser();
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyZer.LoadIndiaCensusData(csvWrongPath);
		} catch(CensusAnalyserException e) {
		    assertEquals(CensusAnalyserException.ExceptionType.Csv_File_Problem, e.type);
		}
	}
}
