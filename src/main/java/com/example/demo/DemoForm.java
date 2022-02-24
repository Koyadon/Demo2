package com.example.demo;
 
import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
 
/**
 * Formオブジェクトのクラス
 */
public class DemoForm {
	/** のり弁当 */
	@Getter
	@Setter
	private String nori;
	
	/** からあげ弁当 */
	@Getter
	@Setter
	private String kara;
	
	//** 幕ノ内弁当 */
	@Getter
	@Setter
	private String maku;
 
    /** 名前 */
    @Getter
    @Setter
    private String name;
 
    /** 生年月日_年 */
    @Getter
    @Setter
    private String birthYear;
 
    /** 生年月日_月 */
    @Getter
    @Setter
    private String birthMonth;
 
    /** 生年月日_日 */
    @Getter
    @Setter
    private String birthDay;
    
    /** 生年月日_日 */
    @Getter
    @Setter
    private String hour;
    
    /** 生年月日_日 */
    @Getter
    @Setter
    private String minutes;
 
    /** レジ袋 */
    @Getter
    @Setter
    private String rezi;
    
    /** メールアドレス */
    @Getter
    @Setter
    private String email;
 
    /** 確認チェック */
    @Getter
    @Setter
    private String checked;
    
    /** のり弁当注文数のMapオブジェクト */
    public Map<String,String> getNoriItems(){
        Map<String, String> noriMap = new LinkedHashMap<String, String>();
        for(int i = 0; i <= 5; i++){
            noriMap.put(String.valueOf(i), String.valueOf(i));
        }
        return noriMap;
    }
    
    /** からあげ弁当注文数のMapオブジェクト */
    public Map<String,String> getKaraItems(){
        Map<String, String> karaMap = new LinkedHashMap<String, String>();
        for(int i = 0; i <= 5; i++){
            karaMap.put(String.valueOf(i), String.valueOf(i));
        }
        return karaMap;
    }
    
    /** 幕ノ内弁当注文数のMapオブジェクト */
    public Map<String,String> getMakuItems(){
        Map<String, String> makuMap = new LinkedHashMap<String, String>();
        for(int i = 0; i <= 5; i++){
            makuMap.put(String.valueOf(i), String.valueOf(i));
        }
        return makuMap;
    }
    
    /** 生年月日_月のMapオブジェクト */
    public Map<String,String> getMonthItems(){
        Map<String, String> monthMap = new LinkedHashMap<String, String>();
        for(int i = 1; i <= 12; i++){
            monthMap.put(String.valueOf(i), String.valueOf(i));
        }
        return monthMap;
    }
 
    /** 生年月日_日のMapオブジェクト */
    public Map<String,String> getDayItems(){
        Map<String, String> dayMap = new LinkedHashMap<String, String>();
        for(int i = 1; i <= 31; i++){
            dayMap.put(String.valueOf(i), String.valueOf(i));
        }
        return dayMap;
    }
    
    /** 生年月日_日のMapオブジェクト */
    public Map<String,String> getHourItems(){
        Map<String, String> hourMap = new LinkedHashMap<String, String>();
        for(int i = 0; i <= 23; i++){
            hourMap.put(String.valueOf(i), String.valueOf(i));
        }
        return hourMap;
    }
    
    /** 生年月日_日のMapオブジェクト */
    public Map<String,String> getMinutesItems(){
        Map<String, String> minutesMap = new LinkedHashMap<String, String>();
        for(int i = 0; i <= 59; i++){
            minutesMap.put(String.valueOf(i), String.valueOf(i));
        }
        return minutesMap;
    }
 
    /** 性別のMapオブジェクト */
    public Map<String,String> getReziItems(){
        Map<String, String> reziMap = new LinkedHashMap<String, String>();
        reziMap.put("1", "あり");
        reziMap.put("2", "なし");
        return reziMap;
    }
 
}