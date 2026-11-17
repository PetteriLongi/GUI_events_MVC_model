package controller;

import model.Dictionary;

public class DictionaryController {
    private Dictionary dictionary;

    public DictionaryController() {
        dictionary = new Dictionary();

        // Add some sample words to the dictionary
        dictionary.addWord("apple", "A fruit that is typically red, green, or yellow");
        dictionary.addWord("banana", "A long, curved fruit with a yellow skin");
        dictionary.addWord("cat", "A small domesticated carnivorous mammal");
        dictionary.addWord("dog", "A domesticated carnivorous mammal that typically has a long snout");
        dictionary.addWord("Dungeons and dragons", "A fantasy tabletop role-playing game");
        dictionary.addWord("Pathfinder", "A better fantasy tabletop role-playing game");
    }

    public String searchWord(String word) {
        if (word == null || word.trim().isEmpty()) {
            return "Please enter a valid word.";
        }
        try {
            return dictionary.searchWord(word.trim());
        } catch (IllegalArgumentException e) {
            return "Word not found.";
        }
    }
}
