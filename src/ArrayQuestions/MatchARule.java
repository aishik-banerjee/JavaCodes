/*
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
The ith item is said to match the rule if one of the following is true:
ruleKey == "type" and ruleValue == typei.
ruleKey == "color" and ruleValue == colori.
ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.

Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
 */

package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class MatchARule {

    public static void main(String[] args) {
         List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));
        Integer matchCount = countMatches(items,"color", "silver");
        System.out.println("Number of matching items: " + matchCount);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = 0;
        int matchCount = 0;

        if(ruleKey.equals("color"))
            index = 1;
        else if(ruleKey.equals("name"))
            index = 2;

        for(List<String> item : items){
            if(item.get(index).equals(ruleValue))
            matchCount = matchCount + 1;
        }
        
        return matchCount;
    }
    
}
