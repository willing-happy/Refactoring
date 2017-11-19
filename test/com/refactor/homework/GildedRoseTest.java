package com.refactor.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void quality_degraded_by_1_before_sell_by_date_pass_for_normal_item() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(19, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void quality_degraded_twice_when_sell_by_date_pass_for_normal_item() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("+5 Dexterity Vest", 0, 20);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(18, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void quality_cannot_be_smaller_than_0_for_normal_item() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("+5 Dexterity Vest", 0, 1);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(0, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void quality_increase_by_1_before_sell_by_date_for_Aged_Brie() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Aged Brie", 1, 1);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(2, item.getQuality());
        assertEquals(0, item.getSellIn());
    }

    @Test
    public void quality_increase_by_2_when_sell_by_date_pass_for_Aged_Brie() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Aged Brie", 0, 1);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(3, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void quality_cannot_be_greater_than_50_for_Aged_Brie() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Aged Brie", 0, 50);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void quality_is_always_80_for_Sulfuras() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(80, item.getQuality());
        assertEquals(0, item.getSellIn());
    }

    @Test
    public void quality_increase_by_1_when_sell_in_greater_than_10_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 10);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(11, item.getQuality());
        assertEquals(10, item.getSellIn());
    }

    @Test
    public void quality_cannot_be_greater_than_50_when_sell_in_greater_than_10_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 50);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(10, item.getSellIn());
    }

    @Test
    public void quality_increase_by_2_when_sell_in_greater_than_5_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(12, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void quality_cannot_be_greater_than_50_when_sell_in_greater_than_5_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(9, item.getSellIn());
    }

    @Test
    public void quality_increase_by_3_when_sell_in_greater_than_0_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 10);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(13, item.getQuality());
        assertEquals(0, item.getSellIn());
    }

    @Test
    public void quality_cannot_be_greater_than_50_when_sell_in_greater_than_0_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 1, 48);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(50, item.getQuality());
        assertEquals(0, item.getSellIn());
    }
    @Test
    public void quality_is_0_when_sell_by_date_pass_for_backstage_passes() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(0, item.getQuality());
        assertEquals(-1, item.getSellIn());
    }

    @Test
    public void quality_degraded_twice_for_conjured_item() throws Exception {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Conjured Mana Cake", 1, 10);
        items.add(item);
        GildedRose.setItems(items);

        GildedRose.updateQuality();

        assertEquals(9, item.getQuality());
        assertEquals(0, item.getSellIn());
    }
}