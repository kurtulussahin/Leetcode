class Solution {
    public String intToRoman(int num) {

        String result;
        String[] ones = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] hdrs = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thds = new String[]{"","M","MM","MMM"};

        result = thds[num/1000] + hdrs[(num%1000)/100] + tens[(num%100)/10] + ones[num%10];

        return result;
        
    }
}