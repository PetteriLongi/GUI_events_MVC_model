# Dictionary App

This JavaFX dictionary app follows an MVC structure. The word library is stored
in `model.Dictionary` as a case-insensitive map of words to meanings. Sample
words are added when `DictionaryController` is created.

Enter a word in the application and choose **Search** to look it up. Leading
and trailing spaces are ignored, and unknown or empty entries produce a
helpful message.

## Run

From the project directory, run:

```text
mvn javafx:run
```

To add or update entries, edit the sample `dictionary.addWord(...)` calls in
`src/main/java/controller/DictionaryController.java`.

## Supported words

- apple
- banana
- cat
- dog
- Dungeons and dragons
- Pathfinder
