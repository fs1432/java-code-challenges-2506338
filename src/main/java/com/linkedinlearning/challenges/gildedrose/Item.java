package com.linkedinlearning.challenges.gildedrose;

public class Item {

  public String name;

  public int sellIn; // Haltbarkein

  public int quality; // Wert

  public Item(String name, int sellIn, int quality) {
    this.name = name;
    this.sellIn = sellIn;
    this.quality = quality;
  }

  @Override
  public String toString() {
    return this.name + ", " + this.sellIn + ", " + this.quality;
  }
}