package com.denie.axp;

/**
 * Created on 12/5/2017.
 */

public class SetNotesVisibility {
    static boolean isNotesVisible = true;

    public static boolean isNotesVisible() {
        return isNotesVisible;
    }

    public static void setNotesVisible(boolean notesVisible) {
        isNotesVisible = notesVisible;
    }
}
