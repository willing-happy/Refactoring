package com.refactor.homework;

public class Item {
    public String name;
	public int sellIn; 
    public int quality; 
    
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
	}

	public void updateQuality() {
		String name = getName();
        if("Aged Brie".equals(name)){
            this.sellIn --;
            if(this.sellIn < 0 && this.quality < 49){
                this.quality += 2;
            }else if(this.quality < 50){
                this.quality ++;
            }
		}else if("Sulfuras, Hand of Ragnaros".equals(name)){
            if(this.quality < 50){
                this.quality++;
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
		    this.sellIn --;
		    if(this.sellIn < 0){
		        this.quality = 0;
		        return;
            }
        	if(this.quality < 50){
        		this.quality ++;
        		if(this.sellIn < 10 && this.quality < 50){
        			this.quality ++;
        			if(this.sellIn < 5 && this.quality < 50){
        				this.quality++;
					}
				}
			}
		}else{
		    this.sellIn --;
		    if(this.sellIn < 0 && this.quality > 1){
		        this.quality -=2;
            }else if(this.quality > 0){
		        this.quality --;
            }
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
