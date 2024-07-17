package ru.qa.stepdefs;

import io.cucumber.java.ru.Тогда;

public class TreeStepDefs {
    @Тогда("^h(?:)(\\d+)((([^\"]+)))$")
    public void treeRow(int nodeLevel, String nodeName) {
        System.out.printf("Шаг %s - %s", nodeLevel, nodeName);
        System.out.println();
    }
}