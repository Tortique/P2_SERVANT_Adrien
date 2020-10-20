package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProcessOut {
    /**
     * Properties
     */
    private ISymptomReader reader;
    private FileWriter writer;
    /**
     * Constructor
     *
     * @param reader refer to object instance of ReadSymptomDataFromFile
     * @param writer refer to object instance of output file
     */
    public ProcessOut(ISymptomReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    /**
     * Transform the list to a HashSet to keep just one copy of each symptoms
     * Transform it to list for sort alphabetically
     *
     * @for each element of the list : write in output file his name and his occurrences
     */
    public void ProcessOut() throws IOException {
        Set<String> symptoms = new HashSet<>(reader.GetSymptoms());
        List<String> uniques = new ArrayList<>(symptoms);
        Collections.sort(uniques);
        for (String elem : uniques) {
            writer.write(elem + " " + Collections.frequency(reader.GetSymptoms(), elem) + "\n");
        }
    }

}
