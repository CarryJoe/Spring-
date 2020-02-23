package com.atguigu.ioc.life;

public class leecode {
	public static void main(String[] args){
		String ransomNote="a";
		String magazine="b";
		System.out.println(canConstruct(ransomNote,magazine));
	}

    public static boolean canConstruct(String ransomNote, String magazine) {
        int i; 
    	int []total = new int[26];
         for(i=0;i<26;i++){
        	 total[i]=0;
         }
         for(i=0;i<magazine.length();i++){
        	 int loc=(magazine.charAt(i)-'a');
        	 total[loc]+=1;
         }
         boolean result=true;
         for(i=0;i<ransomNote.length();i++)
         {
        	 int loc=(ransomNote.charAt(i)-'a');
        	 total[loc]-=1;
         }
         result=true;
         for(i=0;i<26;i++){
        	 if(total[i]<0){
        		 result=false;
        	 }
         }
         return result;

    }
}


