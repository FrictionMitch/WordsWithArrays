import edu.duke.FileResource;

import java.util.ArrayList;

public class WordFrequencies {
    private ArrayList<String>myWords;
    private ArrayList<Integer>myFreqs;

    public WordFrequencies() {
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }

    public void findUnique() {
        myWords.clear();
        myFreqs.clear();
        FileResource resource = new FileResource();
        for(String word : resource.words()) {
            word = word.toLowerCase();
            int index = myWords.indexOf(word);
            if(index == -1) {
                myWords.add(word);
                myFreqs.add(1);
            }
            else {
                int value = myFreqs.get(index);
                myFreqs.set(index, value++);
            }
        }
    }

    public void tester() {
        findUnique();
        for(String word : myWords) {
//            System.out.println(word + "\t" + myFreqs.get())
            System.out.println(word);
        }
    }

//    public void findUnique() {
//        FileResource resource = new FileResource();
//
//        for(String s : resource.words()){
//            s = s.toLowerCase();
//            int index = myWords.indexOf(s);
//            if(index == -1) {
//                myWords.add(s);
//                myFreqs.add(1);
//            }
//            else {
//                int value = myFreqs.get(index);
//                myFreqs.set(index, value + 1);
//            }
//        }
//    }
}
