package com.refactor.homework;

public class Item {
    public String name;
	public int sellIn; 
    public int quality; 
    
    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	public void updateQuality() {
		String name = getName();
        if("Aged Brie".equals(name) || "Sulfuras, Hand of Ragnaros".equals(name)){
			if(this.quality < 50){
				this.quality++;
			}
		}else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
        	if(this.quality < 50){
        		this.quality ++;
        		if(this.sellIn < 11 && this.quality < 50){
        			this.quality ++;
        			if(this.sellIn < 6 && this.quality < 50){
        				this.quality++;
					}
				}
			}
		}else{
			if (this.quality > 0)
			{
				this.quality--;
			}
		}


		updateSellIn();

		if (getSellIn() < 0)
        {
        	if("Aged Brie".equals(name)){
				if (this.quality < 50)
				{
					this.quality ++;
				}
			}else if("Backstage passes to a TAFKAL80ETC concert".equals(name)){
				this.quality = 0;
			}else if(!"Sulfuras, Hand of Ragnaros".equals(name)){
				if (this.quality > 0){
					this.quality --;
				}
			}
        }
    }

	private void updateSellIn() {
		if (!"Sulfuras, Hand of Ragnaros".equals(this.name))
        {
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
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
}
