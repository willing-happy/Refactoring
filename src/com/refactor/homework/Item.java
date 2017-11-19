package com.refactor.homework;

public class Item {
    private String name;
    private int sellIn;
    private int quality;
    private StrategyItem strategyItem;

    
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        if("Aged Brie".equals(name)){
            this.strategyItem = new StrategyAgedBrieItem();
        }else if("Sulfuras, Hand of Ragnaros".equals(name)){
            this.strategyItem = new StrategySulfurasItem();
        }else if("Backstage passes to a TAFKAL80ETC concert".equals(name)){
            this.strategyItem = new StrategyBackstageItem();
        }else{
            this.strategyItem = new StrategyNormalItem();
        }
	}

	public void updateQuality() {
        updateSealIn();
        this.quality = this.strategyItem.calculateQuality(this.sellIn, this.quality);
    }

    private void updateSealIn(){
        if(!"Sulfuras, Hand of Ragnaros".equals(name)){
            this.sellIn --;
        }
    }

	/* Generated getter and setter code */
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSellIn() {
		return sellIn;
	}
	public int getQuality() {
		return quality;
	}
}
