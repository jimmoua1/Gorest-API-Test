package demo.notes;

import org.jetbrains.annotations.NotNull;

public class StringMethods {

    public static void main(java.lang.String[] args) {
        /*
         *   METHOD NAME: length()
         *
         *
         *   METHOD DESCRIPTION: Tells us how many characters are in a string.
         *                       Includes spaces and special characters.
         *                       Starts counting at 1, to give us the absolute amount.
         *                           "Hello!"    The String "Hello!" has 6 characters,
         *                            123456     , so it's length() is 6
         *
         *
         *   EXAMPLES:
         *       String myName = "Brendan";
         *       myName.length();  // returns 7
         *
         *       String myLastName = " Leighton";  // late-in
         *       myLastName.length();  // returns 9
         *
         *
         *   METHOD SYNTAX: <string>.length();
         *       1. "string": The name of the String whose character count we want.
         *
         *   https://www.w3schools.com/java/ref_string_length.asp
         */
        header("myName.length()\nmyName = \"Brendan\"");
        java.lang.String myName = "Brendan";
        System.out.println(myName.length());  // returns 7

        header("myLastName.length()\nmyLastName = \" Leighton\"");
        java.lang.String myLastName = " Leighton";  // late-in
        System.out.println(myLastName.length());  // returns 9

        /*
         *   METHOD NAME: charAt()
         *
         *
         *   METHOD DESCRIPTION: Searches a string and gives us the character at a specified position.
         *                       Each position is called an "index".
         *                       The 1st position is index 0.
         *                           "Hello you!"    "H-e-l-l-o- -y-o-u-!"  if we asked for the 0th index
         *                            0123456789      0-1-2-3-4-5-6-7-8-9   then we would get 'H'
         *
         *
         *   EXAMPLES:
         *       String name = "Brendan";
         *       name.charAt(0);  // returns B
         *       name.charAt(2);  // returns e
         *
         *       String lastName = "Leighton";  // late-in
         *       lastName.charAt(1);  // returns e
         *       lastName.charAt(4);  // returns h
         *
         *
         *   METHOD SYNTAX: <string>.charAt(<index>);
         *       1. "string": The String we are searching through
         *       2. "index": A number. The index position we want to get a character from.
         *
         *
         *   https://www.w3schools.com/java/ref_string_charat.asp
         */
        header("name.charAt(<index number>)\nname = \"Brendan\"\nIndexes 0, 2");

        java.lang.String name = "Brendan";
        /* name.charAt(0);
         * name.charAt(2);                   */
        System.out.println(name.charAt(0));  // returns 'B' because we start counting at zero
        System.out.println(name.charAt(2));  // returns 'e'

        header("lastName.charAt()\nlastName = \" Leighton\" lay-tin\nIndexes 1, 4");

        java.lang.String lastName = " Leighton";
        /*  lastName.charAt(1);
         *  lastName.charAt(4);                  */
        System.out.println(lastName.charAt(1));  // returns 'i'
        System.out.println(lastName.charAt(4));  // returns 'a'

        header("<string>.length() vs <string>.charAt(<index number>)");
        charAtFunc(name);
        System.out.println(" ");
        charAtFunc(lastName);

        /*
         *   METHOD NAME: indexOf()
         *
         *
         *   METHOD DESCRIPTION: Searches a string and gives us the index position the specified character(s).
         *                       If we search for a character with multiple occurrences,
         *                       we only get the index of the 1st occurrence.
         *                          "little"  if we search for 't'
         *                           012345   we get back index 2
         *                       If we search for a string of 2+ chars, we get the index of the beginning of
         *                       the string.
         *                          "little"  if we search for "it"
         *                           012345   we get back index 1
         *                       If the search doesn't find a match we get a -1 returned to us
         *                          "little"  if we search for "lite"
         *                           012345   we get back index -1, because "lite" doesn't exist
         *                       Searches are case-sensitive.
         *                          "little"  if we search for "Lit"
         *                           012345   we get back index -1 because it couldn't find an exact match
         *
         *
         *   EXAMPLES:
         *       String strToSearch = "Brendan";
         *       strToSearch.indexOf("n");  // returns 3
         *       strToSearch.indexOf("end");  // returns 2
         *
         *       String strToSearch2 = "Leighton";  // late-in
         *       strToSearch2.indexOf("Light");  // returns -1
         *       strToSearch2.indexOf("Eight");  // returns -1
         *
         *
         *   METHOD SYNTAX: <string>.indexOf(<char or string>);
         *       1. "string": The name of the String variable to search through
         *       2. "char or string": A character or string to look for in "string"
         *
         *   https://www.w3schools.com/java/ref_string_indexof.asp
         */
        header("<string>.indexOf(<search term>);");
        System.out.println("string = \"Brendan\"\nsearch term 1 = \"n\"\nsearch term 2 = \"end\"");
        java.lang.String strToSearch = "Brendan";
        System.out.println(strToSearch.indexOf("n"));  // returns?
        System.out.println(strToSearch.indexOf("end"));  // returns?

        System.out.println("\nstring = \"Leighton\"\nsearch term 1 = \"light\"\nsearch term 2 = \"eight\"");
        java.lang.String strToSearch2 = "Leighton";  // late-in
        System.out.println(strToSearch2.indexOf("light"));  // returns?
        System.out.println(strToSearch2.indexOf("eight"));  // returns?

        /*
         *   METHOD NAME: lastIndexOf()
         *
         *
         *   METHOD DESCRIPTION: Similar to "indexOf()" but gives us the index of the LAST occurrence.
         *                          "little"  if we search for 't'
         *                           012345   we get back index 3
         *                       If we search for a string of 2+ chars, we get the index of the beginning of
         *                       the string.
         *                          "little"  if we search for "it"
         *                           012345   we get back index 1
         *                       If the search doesn't find a match we get a -1 returned to us
         *                          "little"  if we search for "lite"
         *                           012345   we get back index -1, because "lite" doesn't exist
         *                       Searches are case-sensitive.
         *                          "little"  if we search for "Lit"
         *                           012345   we get back index -1 because it couldn't find an exact match
         *
         *
         *   EXAMPLES:
         *       String strToSearch = "Brendan";
         *       strToSearch.lastIndexOf("n");  // returns 6
         *       strToSearch.lastIndexOf("end");  // returns 2
         *
         *       String strToSearch2 = " Leighton ";  // late-in
         *       strToSearch2.lastIndexOf("light");  // returns -1
         *       strToSearch2.lastIndexOf(" ");  // returns 9
         *
         *
         *   METHOD SYNTAX: <string>.lastIndexOf(<char or string>);
         *       1. "string": The name of the String variable to search through
         *       2. "char or string": A character or string to look for in "string"
         *
         *   https://www.w3schools.com/java/ref_string_lastindexof.asp
         */
        header("<string>.lastIndexOf(<search term>);");
        System.out.println("string = \"Brendan\"\nsearch term 1 = \"n\"\nsearch term 2 = \"end\"");
        java.lang.String strToSearch3 = "Brendan";
        System.out.println(strToSearch3.lastIndexOf("n"));  // returns?
        System.out.println(strToSearch3.lastIndexOf("end"));  // returns?

        System.out.println("\nstring = \" Leighton \"\nsearch term 1 = \"light\"\nsearch term 2 = \" \"");
        java.lang.String strToSearch4 = " Leighton ";  // late-in
        System.out.println(strToSearch4.lastIndexOf("light"));  // returns?
        System.out.println(strToSearch4.lastIndexOf(" "));  // returns?

        /*
         *   METHOD NAME: substring()
         *
         *
         *   METHOD DESCRIPTION: Copy some character sequence from a String by passing in 1 or 2 index values.
         *                       The 1st index is where to begin, the 2nd is where to stop.
         *                       * We DON'T get the character at the 2nd index value passed in! *
         *                          "Table"  if we pass index values of 1 and 3
         *                           01234   we get back "ab"
         *                       If we do not pass in a 2nd index value, we get all characters
         *                       from the 1st index until the very end of the string,
         *                       including the last character.
         *                          "Table"  if we pass in just one index value of 1
         *                           01234   we get back "able"
         *                       if (we want this index) {
         *                          return charAt(index)
         *                       } else {
         *                          stop
         *                       }
         *
         *
         *   EXAMPLES:
         *       String strToSearch5 = "Brendan";
         *       strToSearch5.substring(0, 3);  // returns Bre
         *       strToSearch5.substring(4);  // returns dan
         *
         *       String strToSearch6 = "Leighton";  // late-in
         *       strToSearch6.substring(0);  // returns Leighton
         *       strToSearch6.substring(5, 8);  // returns ton
         *
         *
         *   METHOD SYNTAX: <string>.substring(<starting index>, <ending index>);
         *       1. "string": The name of the String variable to pull from
         *       2. "starting index": The first index to start copying from
         *       3. "ending index": Optional. The index where we stop copying, we don't get this char.
         *
         *   https://www.javatpoint.com/java-string-substring
         */
        header("<string>.substring(<starting index>, <ending index>);\nstring = \"Brendan\"");
        java.lang.String strToSearch5 = "Brendan";
        System.out.println("Search Index(s): 0, 3");
        System.out.println(strToSearch5.substring(0, 3));  // returns?
        System.out.println("Search Index(s): 4");
        System.out.println(strToSearch5.substring(4));  // returns?

        header("<string>.substring(<starting index>, <ending index>);\nstring = \"Leighton\"");
        java.lang.String strToSearch6 = "Leighton";  // late-in
        System.out.println("Search Index(s): 0");
        System.out.println(strToSearch6.substring(0));  // returns?
//        System.out.println("Search Index(s): 0, 200");
//        System.out.println(strToSearch6.substring(0, 200));  // returns?
        System.out.println("Search Index(s): 5, 8");
        System.out.println(strToSearch6.substring(5, 8));  // returns?

        /*
         *   METHOD NAME: trim()
         *
         *
         *   METHOD DESCRIPTION: Use this method on a string to remove white-space
         *                       from the beginning and end of a string
         *
         *
         *   EXAMPLES:
         *       String stringWithWhiteSpace = "      Brendan     ";
         *       stringWithWhiteSpace.trim();  // returns "Brendan"
         *
         *       String stringWithNoWhiteSpace = "No trim-able white-space";
         *       stringWithNoWhiteSpace.trim();  // returns "No     trim-able white-space"
         *
         *
         *   METHOD SYNTAX: <string to trim>.trim();
         *       1. "string to trim": The string you don't want having white-space at the beginning
         *                            and end of.
         *
         *   https://www.w3schools.com/java/ref_string_trim.asp
         */

        header("<string>.trim();\nstringWithWhiteSpace = \"      Brendan     \"");
        java.lang.String stringWithWhiteSpace = "      Brendan     ";
        System.out.println("\"" + stringWithWhiteSpace.trim() + "\"");  // returns?

        header("stringWithNoWhiteSpace = \"No trim-able white-space\"");
        java.lang.String stringWithNoWhiteSpace = "No trim-able white-space";
        System.out.println("\"" + stringWithNoWhiteSpace.trim() + "\"");  // returns?

        /*
         *   METHOD NAME: concat()
         *
         *
         *   METHOD DESCRIPTION: Combines 2 strings together. Does not add any spaces between strings.
         *
         *
         *   EXAMPLES:
         *       String name = "Brendan";
         *       String middleName = "Michael";
         *       name.concat(middleName); // returns? "BrendanMichael"
         *
         *       String nameWithSpace = "Brendan ";
         *       nameWithSpace.concat(middleName); // returns? "Brendan Michael"
         *
         *
         *   METHOD SYNTAX: <1st string>.concat(<2nd string>);
         *       1. "1st string": The string that will appear 1st in the newly combined string
         *       2. "2nd string": The string that will come after the 1st string in the new string
         *
         *
         *   https://www.w3schools.com/java/ref_string_concat.asp
         */
        header("name1.concat(middleName1)\nname1 = \"Brendan\"\nmiddleName1 = \"Michael\"");

        java.lang.String name1 = "Brendan";
        java.lang.String middleName1 = "Michael";
        // name1.concat(middleName1);
        System.out.println(name1.concat(middleName1)); // returns "BrendanMichael"

        header("nameWithSpace.concat(middleName1)\nnameWithSpace = \"Brendan \"\nmiddleName1 = \"Michael\"");

        java.lang.String nameWithSpace = "Brendan ";
        // nameWithSpace.concat(middleName1);
        System.out.println(nameWithSpace.concat(middleName1)); // returns "Brendan Michael"

        /*
         *   METHOD NAME: equals()
         *
         *
         *   METHOD DESCRIPTION: Compares 2 strings and tells us if they are the same word
         *                       or sequence of characters.
         *                       Returns a boolean, true/false
         *                       Case sensitive.
         *
         *
         *   EXAMPLES:
         *       String word1 = "Up";
         *       String word2 = "Down";
         *       word1.equals(word2); // returns false
         *
         *       String word3 = "Left";
         *       String word4 = "Left";
         *       word3.equals(word4); // returns true
         *
         *       String word5 = "Right";
         *       String word6 = "right";
         *       word5.equals(word6); // returns false
         *
         *
         *   METHOD SYNTAX: <string>.equals(<string>);
         *       1. "string": String to compare to the other string
         *
         *   https://www.w3schools.com/java/ref_string_equals.asp
         */
        header("word1.equals(word2)\nword1 = \"Up\"\nword2 = \"down\"");
        java.lang.String word1 = "Up";
        java.lang.String word2 = "Down";
        System.out.println(word1.equals(word2)); // returns?

        header("word3.equals(word4)\nword3 = \"Left\"\nword4 = \"Left\"");
        java.lang.String word3 = "Left";
        java.lang.String word4 = "Left";
        System.out.println(word3.equals(word4)); // returns?

        header("word5.equals(word6)\nword5 = \"Right\"\nword6 = \"right\"");
        java.lang.String word5 = "Right";
        java.lang.String word6 = "right";
        System.out.println(word5.equals(word6)); // returns?


        /*
         *   METHOD NAME: compareTo()
         *
         *
         *   METHOD DESCRIPTION: Compares 2 strings and can tell us which String comes first alphabetically.
         *                       Returns a number:
         *                           = 0: The strings are the same.
         *                           > 0: string2 goes first alphabetically.
         *                           < 0: string1 goes first.
         *                              "ABC".compareTo("ABC")   returns: 0
         *                              "Apple".compareTo("Banana")    returns: negative number, string1 goes 1st.
         *                       Number calculated using ASCII/Unicode?, a number system used to define all
         *                          characters on a keyboard. Lowercase and Uppercase have different numbers,...
         *                       Using <string>.toLowerCase() or <string>.toUpperCase() will remedy case issues.
         *
         *                       Get ascii character: System.out.println((int)'<character>');
         *                          1. "character": Char to get ASCII for, char only, no Strings
         *
         *
         *   EXAMPLES:
         *       String strTest = "Test";    Test in ASCII = 84 + 101 + 115 + 116 = 416
         *       String strTest2 = "Test";
         *       strTest.compareTo(strTest2); // returns?
         *
         *       String strBest = "Best";   Best in ASCII = 66 + 101 + 115 + 116 = 398
         *       strTest.compareTo(strBest); // returns 18          Test = 416
         *                                                        - Best = 398
         *                                                               =  18
         *
         *       String strTestLower = "test";
         *       strTest.compareTo(strTestLower); // returns?
         *
         *
         *   METHOD SYNTAX: <string1>.compareTo(<string2>);
         *       1. "string1": String to be compared
         *       2. "string2": String being compared to
         *
         *   https://www.w3schools.com/java/ref_string_compareto.asp
         */
        header("<string1>.compareTo(<string2>)");
        System.out.println("string1 = \"Test\"\nstring2 = \"Test\"");
        java.lang.String strTest = "Test";
        java.lang.String strTest2 = "Test";
        System.out.println(strTest.compareTo(strTest2)); // returns?

        System.out.println("string1 = \"Test\"\nstring2 = \"Best\"");
        java.lang.String strBest = "Best";
        System.out.println(strTest.compareTo(strBest)); // returns?

        System.out.println("string1 = \"Test\"\nstring2 = \"test\"");
        java.lang.String strTestLower = "test";
        System.out.println(strTest.compareTo(strTestLower)); // returns?

        /*
         *   METHOD NAME: contains()
         *
         *
         *   METHOD DESCRIPTION: Tells us if a string variable contains the given string of characters.
         *                       Case-sensitive.
         *                       Returns a boolean, true/false
         *
         *
         *   EXAMPLES:
         *       String strHappiness = "Happiness";
         *       String strJoy = "Joy";
         *       String strPines = "pines";
         *       String strHap = "hap";
         *
         *       strHappiness.contains(strJoy); // returns false
         *       strHappiness.contains(strPines); // returns true
         *       strHappiness.contains(strHap); // returns false
         *
         *
         *   METHOD SYNTAX: <string1>.contains(<string2>);
         *       1. "string1": String to be searched through
         *       2. "string2": String to find in our search
         *
         *   https://www.w3schools.com/java/ref_string_contains.asp
         */
        header("strHappiness.contains(<search word>)");

        java.lang.String strHappiness = "Happiness";

        System.out.println("search word 1 = \"Joy\"");
        java.lang.String strJoy = "Joy";
        // strHappiness.contains(strJoy);
        System.out.println(strHappiness.contains(strJoy)); // returns?

        System.out.println("search word 2 = \"pines\"");
        java.lang.String strPines = "pines";
        // strHappiness.contains(strPines);
        System.out.println(strHappiness.contains(strPines)); // returns?

        System.out.println("search word 3 = \"hap\"");
        java.lang.String strHap = "hap";
        //strHappiness.contains(strHap);
        System.out.println(strHappiness.contains(strHap)); // returns?
    }

    /*
     **   END OF STRING METHODS
     */

    public static void charAtFunc(@NotNull java.lang.String str) {
        System.out.println("The String \"" + str + "\" has a length of " + str.length());
        for (int i = 0; i < str.length(); i++) {
            System.out.println("character at Index " + i + ": \"" + str.charAt(i) + "\"");
        }
    }

    public static void header(java.lang.String title) {
        System.out.println("\n" + title);
    }
}
