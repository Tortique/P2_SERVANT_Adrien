package com.hemebiotech.analytics;

import java.io.FileWriter;

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {
        /**
         * Construct a list with input file symptoms.txt
         */
        ISymptomReader reader = new ReadSymptomDataFromFile("Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\symptoms.txt");
        /**
         * Construct an output file for result
         */
        FileWriter writer = new FileWriter("result.out");
        /**
         * Clean and sort the list
         * Write in output file, symptoms with their occurrence.
         */
        ProcessOut result = new ProcessOut(reader, writer);
        result.ProcessOut();

    }
}
