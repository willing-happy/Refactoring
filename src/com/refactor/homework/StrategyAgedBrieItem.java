package com.refactor.homework;

/**
 * Created by willi on 2017/11/19.
 */
public class StrategyAgedBrieItem extends StrategyItem {
    @Override
    public int calculateQuality(int sellIn, int quality) {
        quality = sellIn >= 0 ? quality + 1 : quality + 2;
        return quality > 50 ? 50 : quality;
    }
}
