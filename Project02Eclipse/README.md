Sample project for OpenClassroom's fundamentals of Java

Heme Biotech - Analytics

Read a file with symptom strings in it, one per line. Write an output file "results.out", with symptoms and their occurrences.

List of classes: 

-AnalyticsCounter : Main class, Constructs/Cleans/Sorts and writes in output file the list.
-ISymptomReader : Interface that returns a list, if no data is avaible, returns an empty List.
-ReadSymptomDataFromFile : Implements ISymptomReader, allows to create a list from a file with a filepath in parameter.
-ProcessOut : Sorts the list and writes it in output file with symptoms's frequency.

Known issues : 
-Reads everything in the input file (ex: apple).
-It doesn't pay attention about spelling mistake.

