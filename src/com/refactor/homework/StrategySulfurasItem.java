package com.refactor.homework;

/**
 * Created by willi on 2017/11/19.
 */
public class StrategySulfurasItem extends StrategyItem {
    @Override
    public int calculateQuality(int sellIn, int quality) {
        return quality < 50 ? quality++ : quality;
    }
}
