package ch.bbw.pr.stringlib;

/**
 * Kleine Sammlung von String-Hilfsfunktionen.
 *
 * @author Milo Ruf, 5IA23b
 * @version 1.0.0
 */
public class TextTools {

    /** Dreht eine Zeichenkette um. */
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /** Prueft, ob ein Wort ein Palindrom ist (Gross-/Kleinschreibung egal). */
    public boolean isPalindrome(String input) {
        String s = input.toLowerCase();
        return s.equals(reverse(s));
    }

    /** Gibt den Text in Grossbuchstaben mit Ausrufezeichen zurueck. */
    public String shout(String input) {
        return input.toUpperCase() + "!";
    }
}
