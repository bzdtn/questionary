package analyzer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Viktor Bezditnyi
 */
public class StatAnalyzer {

    private List<Sample> samples = new LinkedList<>();
    private Map<String, Integer> maleBrowserStat = new HashMap<>();
    private Map<String, Integer> femaleBrowserStat = new HashMap<>();

    public void add(Sample s){
        samples.add(s);
        String browser = s.getBrowser();
        if ("male".equals(s.getSex())){
            maleBrowserStat.put(browser, maleBrowserStat.getOrDefault(browser, 0) + 1);
        } else {
            femaleBrowserStat.put(browser, femaleBrowserStat.getOrDefault(browser, 0) + 1);
        }
    }

    public String showMaleStat(){
        return maleBrowserStat.toString();
    }

    public String showFemaleStat(){
        return femaleBrowserStat.toString();
    }

    public int countMale(){
        int res = 0;
        for (Sample s: samples){
            if ("male".equals(s.getSex())){
                res++;
            }
        }
        return res;
    }

    public int countFemale(){
        int res = 0;
        for (Sample s: samples){
            if ("female".equals(s.getSex())){
                res++;
            }
        }
        return res;
    }

}

