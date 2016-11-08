package kata3;

import java.util.HashMap;

public class Kata3 {

    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap();
        Histogram<String> histogram = new Histogram(map);
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");   
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histograma",histogram);
        HistogramDisplay.execute();
    }
    
}
