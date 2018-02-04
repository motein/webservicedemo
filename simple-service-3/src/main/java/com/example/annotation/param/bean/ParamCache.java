package com.example.annotation.param.bean;

import com.example.domain.Yijing;

import java.util.ArrayList;

public class ParamCache {
    public final static ArrayList<Yijing> LIST;

    static {
        LIST = new ArrayList<Yijing>();
        ParamCache.LIST.add(new Yijing("1", "Ǭ", "qi��n"));
        ParamCache.LIST.add(new Yijing("2", "��", "k��n"));
        ParamCache.LIST.add(new Yijing("3", "��", "zh��n"));
        ParamCache.LIST.add(new Yijing("4", "��", "m��ng"));
        ParamCache.LIST.add(new Yijing("5", "��", "x��"));

        ParamCache.LIST.add(new Yijing("6", "��", "s��ng"));
        ParamCache.LIST.add(new Yijing("7", "ʦ", "sh��"));
        ParamCache.LIST.add(new Yijing("8", "��", "b��"));
        ParamCache.LIST.add(new Yijing("9", "С��", "xiao x��"));
        ParamCache.LIST.add(new Yijing("10", "��", "l��"));

        ParamCache.LIST.add(new Yijing("11", "̩", "t��i"));
        ParamCache.LIST.add(new Yijing("12", "��", "p��"));
        ParamCache.LIST.add(new Yijing("13", "ͬ��", "t��ng r��n"));
        ParamCache.LIST.add(new Yijing("14", "����", "d�� y��u"));

        ParamCache.LIST.add(new Yijing("15", "ǫ", "qi��n"));
        ParamCache.LIST.add(new Yijing("16", "ԥ", "y��"));
        ParamCache.LIST.add(new Yijing("17", "��", "su��"));
        ParamCache.LIST.add(new Yijing("18", "��", "g��"));
        ParamCache.LIST.add(new Yijing("19", "��", "l��n"));

        ParamCache.LIST.add(new Yijing("20", "��", "gu��n"));
        ParamCache.LIST.add(new Yijing("21", "���", "sh�� h��"));
        ParamCache.LIST.add(new Yijing("22", "��", "b��"));
        ParamCache.LIST.add(new Yijing("23", "��", "b��"));
        ParamCache.LIST.add(new Yijing("24", "��", "f��"));

        ParamCache.LIST.add(new Yijing("25", "����", "w�� w��ng"));
        ParamCache.LIST.add(new Yijing("26", "����", "d�� x��"));
        ParamCache.LIST.add(new Yijing("27", "��", "y��"));
        ParamCache.LIST.add(new Yijing("28", "���", "d�� gu��"));

        ParamCache.LIST.add(new Yijing("29", "��", "k��n"));
        ParamCache.LIST.add(new Yijing("30", "��", "l��"));
        ParamCache.LIST.add(new Yijing("31", "��", "xi��n"));
        ParamCache.LIST.add(new Yijing("32", "��", "h��ng"));
        ParamCache.LIST.add(new Yijing("33", "��", "d��n"));

        ParamCache.LIST.add(new Yijing("34", "��׳", "d�� zhu��ng"));
        ParamCache.LIST.add(new Yijing("35", "��", "j��n"));
        ParamCache.LIST.add(new Yijing("36", "����", "m��ng y��"));
        ParamCache.LIST.add(new Yijing("37", "����", "ji�� ren"));

        ParamCache.LIST.add(new Yijing("38", "�", "ku��"));
        ParamCache.LIST.add(new Yijing("39", "�", "ji��n"));
        ParamCache.LIST.add(new Yijing("40", "��", "xi��"));
        ParamCache.LIST.add(new Yijing("41", "��", "s��n"));
        ParamCache.LIST.add(new Yijing("42", "��", "y��"));

        ParamCache.LIST.add(new Yijing("43", "��", "gu��i"));
        ParamCache.LIST.add(new Yijing("44", "��", "g��u"));
        ParamCache.LIST.add(new Yijing("45", "��", "cu��"));
        ParamCache.LIST.add(new Yijing("46", "��", "sh��ng"));
        ParamCache.LIST.add(new Yijing("47", "��", "k��n"));

        ParamCache.LIST.add(new Yijing("48", "��", "j��ng"));
        ParamCache.LIST.add(new Yijing("49", "��", "g��"));
        ParamCache.LIST.add(new Yijing("50", "��", "d��ng"));
        ParamCache.LIST.add(new Yijing("51", "��", "zh��n"));
        ParamCache.LIST.add(new Yijing("52", "��", "g��n"));

        ParamCache.LIST.add(new Yijing("53", "��", "ji��n"));
        ParamCache.LIST.add(new Yijing("54", "����", "gu�� m��i"));
        ParamCache.LIST.add(new Yijing("55", "��", "f��ng"));
        ParamCache.LIST.add(new Yijing("56", "��", "l��"));

        ParamCache.LIST.add(new Yijing("57", "��", "x��n"));
        ParamCache.LIST.add(new Yijing("58", "��", "du��"));
        ParamCache.LIST.add(new Yijing("59", "��", "hu��n"));
        ParamCache.LIST.add(new Yijing("60", "��", "ji��"));
        ParamCache.LIST.add(new Yijing("61", "����", "zh��ng f��"));

        ParamCache.LIST.add(new Yijing("62", "С��", "xi��o gu��"));
        ParamCache.LIST.add(new Yijing("63", "�ȼ�", "j�� j��"));
        ParamCache.LIST.add(new Yijing("64", "δ��", "w��i j��"));
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Yijing> copy() {
        return (ArrayList<Yijing>) ParamCache.LIST.clone();
    }

    public static Yijing find(final String seqId) {
        for (final Yijing yijing : ParamCache.LIST) {
            if (seqId.equals(yijing.getSequence())) {
                return yijing;
            }
        }
        return null;
    }
}
