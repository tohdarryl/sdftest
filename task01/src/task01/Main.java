package task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        if (args[0].endsWith(".csv") && args[1].endsWith((".txt"))) {
            System.out.printf("Merging files: %s and %s\n", args[0], args[1]);
        } else {
            System.out.println("Please enter .csv and .txt files to merge");
        }

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader bfr = new BufferedReader(fr);
            

            String line;

            Map<String, ArrayList<String>> detMap = new HashMap<>();
            List<String> termsList = new ArrayList<>();
            //Integer k = 0;
            String[] terms;
            String key = bfr.readLine();
            String[] keySplit = key.split(",");

            for (int i = 0; i < keySplit.length; i++) {
                detMap.put(keySplit[i], new ArrayList<>());
            }

            while (null != (line = bfr.readLine())) {
                // if (k==0){
                // k++;
                // continue;
                // }
                terms = line.split(",");
                termsList = new ArrayList<>(Arrays.asList(terms));
                // System.out.println(termsList.get(0));

                for (int i = 0; i < keySplit.length; i++) {
                    detMap.get(keySplit[i]).add(termsList.get(i));
                }

            
            }
            Set<String> uniqueKeys = detMap.keySet();

            // for (String Key : uniqueKeys)
            //     System.out.println(Key + detMap.get(Key));


            FileReader fr2 = new FileReader(args[1]);
            BufferedReader bfr2 = new BufferedReader(fr2);
            // FileWriter fw2 = new FileWriter(args[1]);
            // BufferedWriter bfw2 = new BufferedWriter(fw2);
            
    

            while(null != (line = bfr2.readLine())){
                //System.out.println(line);

                for (String Key : uniqueKeys){
                    if(line.contains(Key)){
                        for (int i = 0; i < detMap.size(); i++)
                        line = line.replaceAll(String.format("<<%s>>", Key), detMap.get(Key).get(i));
                        System.out.println(line);
                   
                    } 
                    
                
            }
        }   
            

            bfr.close();
            bfr2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

   

}
