package com.example.hp.criminalintent;

/**
 * Created by HP on 6/25/2017.
 */

public class CrimeDbSchema {
    public static final class CrimeTable {
        public static final String NAME = "CRIMES";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
            public static final String SUSPECT = "suspect";
        }

    }
}
