package com.refactor.homework;


/**
 * Created by willi on 2017/11/19.
 */
public class StrategyBackstageItem extends StrategyItem {
    @Override
    public int calculateQuality(int sellIn, int quality) {
        quality = sellIn >= 10 ? quality + 1 : (sellIn >= 5 ? quality + 2 : (sellIn >= 0 ? quality + 3 : 0));
        return quality > 50 ? 50 : quality;
    }
}
