package com.kallaylevente;


import static java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ListOfThings {
  List<String> foodList;
  List<String> drinkList;
  List<String> trickList;
  List<String> historyList;
  List<String> lastFiveActions;

  public ListOfThings() {
    this.foodList = new ArrayList<>();
    this.drinkList = new ArrayList<>();
    this.trickList = new ArrayList<>();
    this.historyList = new ArrayList<>();
    this.lastFiveActions = new ArrayList<>();
    foodList.add("potato");
    foodList.add("carrott");
    foodList.add("tomato");
    drinkList.add("water");
    drinkList.add("sprite");
    drinkList.add("coffee");
    trickList.add("Java programming");
    trickList.add("Use spring");
    trickList.add("Walk the dog");
  }

  public void addFoodToList(String newFood) {
    foodList.add(newFood);
  }

  public void addDrinkToList(String newDrink) {
    drinkList.add(newDrink);
  }

  public void addTrickToList(String newTrick) {
    trickList.add(newTrick);
  }

  public void addToHistoryList(String history) {
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy. MMMM. dd. HH:mm:ss");
    String text = date.format(formatter);
    history = text + "  " + history;
    historyList.add(history);

  }

  public List<String> getFoodList() {
    return foodList;
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public List<String> getHistoryList() {
    return historyList;
  }

   public void latestFiveActions() {
    lastFiveActions.clear();
    if (historyList.size() < 6) {
      for (int i = 0; i < historyList.size() ; i++) {
        lastFiveActions.add(historyList.get(i));
      }
    } else
      for (int i = 0; i < 5 ; i++) {
        lastFiveActions.add(historyList.get(historyList.size() - 1 - i));
      }
    }

  public List<String> getLastFiveActions() {
    return lastFiveActions;
  }
}

