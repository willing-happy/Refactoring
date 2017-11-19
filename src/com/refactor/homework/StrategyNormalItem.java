package com.refactor.homework;

/**
 * Created by willi on 2017/11/19.
 */
public class StrategyNormalItem extends StrategyItem {
    @Override
    public int calculateQuality(int sellIn, int quality) {
        quality = sellIn < 0 ? quality - 2 : quality - 1;
        return  quality < 0 ? 0 : quality;
    }
}
