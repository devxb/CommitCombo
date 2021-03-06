package com.commitcombo.service.commonUtil;

public class ViewOperator{
	
	public static String getContributionFontSize(long contributionCount){
        if(contributionCount > 999) return "1.3625em";
		return "1.688em";
	}
	
	public static String getTrophyColor(long contributionCount){
        if(contributionCount < 15) return "#C2CEE0";
        if(contributionCount < 45) return "#FFBC50";
        if(contributionCount < 210) return "#05EBB9";
        if(contributionCount < 700) return "#7BBEFF";
        if(contributionCount <= 987654321) return "#F34D89";
        return "#FFFFFF"; // 오류 (흰색 -> 표시안함 검은색)
    }
	
	public static String getNextTrophyColor(long contributionCount){
        if(contributionCount < 15) return "#FFBC50";
        if(contributionCount < 45) return "#05EBB9";
        if(contributionCount < 210) return "#7BBEFF";
        if(contributionCount < 700) return "#F34D89";
        if(contributionCount <= 987654321) return "#F34D89";
        return "#FFFFFF"; // 오류 (흰색 -> 표시안함 검은색)
    }
	
	public static String getCurrentRank(long contributionCount){
        if(contributionCount < 15) return "Silver";
        if(contributionCount < 45) return "Gold";
        if(contributionCount < 210) return "Platinum";
        if(contributionCount < 700) return "Diamond";
        if(contributionCount <= 987654321) return "Ruby";
        return "#FFFFFF"; // 오류 (흰색 -> 표시안함 검은색)
    }
	
	public static String getNextRank(long contributionCount){
		if(contributionCount < 15) return "Gold";
        if(contributionCount < 45) return "Platinum";
        if(contributionCount < 210) return "Diamond";
        if(contributionCount < 700) return "Ruby";
        if(contributionCount <= 987654321) return "";
        return "Error"; // 오류 (흰색 -> 표시안함 검은색)
	}
	
	public static Double getCurrentRankBar(long contributionCount){
		double total = 240.0;
		if(contributionCount < 15) return total * (contributionCount/15);
        if(contributionCount < 45) return total * (contributionCount/45);
        if(contributionCount < 210) return total * (contributionCount/210);
        if(contributionCount < 700) return total * (contributionCount/700);
        if(contributionCount <= 987654321) return 240.0;
		return 240.0;
	}
	
	public static double getFontSize(String userName){
        //if(userName.length() >= 10) return 0.6800;
        if(userName.length() > 7) return 0.8125;
        return 0.9375; // default : 16px
    }

    private static double transEmToPx(double em){
        return (16*em)-3;
    }

    public static double getDragLength(String userName){
        int[] Alph = {11, 9, 10, 10, 9, 8, 11, 10, 3, 8, 10, 8, 11, 10, 11, 10, 11, 9, 9, 10, 10, 9, 14, 9, 10, 9};
        int[] alph = {8, 9, 8, 9, 8, 7, 9, 9, 3, 3, 9, 4, 13, 9, 9, 9, 9, 7, 8, 6, 9, 10, 13, 8, 9, 7};
        int[] numb = {8, 7, 9, 8, 9, 9, 9, 8, 8, 9};
        double ans = 0;
        double em = getFontSize(userName);
        for(int i = 0; i < userName.length(); i++){
            if((int)userName.charAt(i) >= (int)'a' && (int)userName.charAt(i) <= (int)'z') ans += alph[(int)userName.charAt(i)-(int)'a']*em;
            else if((int)userName.charAt(i) >= (int)'0' && (int)userName.charAt(i) <= (int)'9') ans += numb[(int)userName.charAt(i)-(int)'0']*em;
            else if((int)userName.charAt(i) >= (int)'A' && (int)userName.charAt(i) <= 'Z') ans += Alph[(int)userName.charAt(i)-(int)'A']*em;
            else ans += 10*em;
            ans += 1; // jump 1px;
        }
        ans = ans-79;
        if(ans <= 0) return 0;
        return -1*ans;
    }
	
}