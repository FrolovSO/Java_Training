package training8;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1 ");
        CapitalLetter capitalLetter = new CapitalLetter();
        capitalLetter.showToUp();

        System.out.println("Task2 ");
        PunctuationMarks punctuationMarks = new PunctuationMarks();
        punctuationMarks.showCountPunkt();

        System.out.println("Task3 ");
        SummAll summAll = new SummAll();
        summAll.showSummAll();

        System.out.println("Task4 ");
        ReplaceSymbol replaceSymbol = new ReplaceSymbol();
        replaceSymbol.showReplaceSymbol();

        System.out.println("Task5 ");
        RemoveSelected removeSelected = new RemoveSelected();
        removeSelected.showRemoveSelected();

        System.out.println("Task6 ");
        DuplicateWord duplicateWord = new DuplicateWord();
        System.out.println("Total count = " + duplicateWord.showDuplicateWord("the"));

        System.out.println("Task7 ");
        VowelsCounter vowelsCounter = new VowelsCounter();
        vowelsCounter.showVowelsCounter();

        System.out.println("Task8 ");
        InterrogativeSentences interrogativeSentences = new InterrogativeSentences();
        interrogativeSentences.showInterrogativeSentences();


    }
}
