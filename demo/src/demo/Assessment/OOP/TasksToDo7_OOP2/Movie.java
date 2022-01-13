// 2) The class Movie is started below. An instance of class Movie represents a film. This class
//      has the following three class variables:
//        ● title, which is a String representing the title of the movie
//        ● studio, which is a String representing the studio that made the movie
//        ● rating, which is a String representing the rating of the movie (i.e. PG­13, R, etc)
//
// public class Movie {
//    private String title;
//    private String studio;
//    private String rating;
//   your code goes here
// }
//
// a) Write a constructor for the class Movie, which takes a String representing the title of the
//        movie, a String representing the studio, and a String representing the rating as its
//        arguments, and sets the respective class variables to these values.
// b) Write a second constructor for the class Movie, which takes a String representing the title
//        of the movie and a String representing the studio as its arguments, and sets the respective
//        class variables to these values, while the class variable rating is set to "PG".
// c) Write a method getPG, which takes an array of base type Movie as its argument, and
//        returns a new array of only those movies in the input array with a rating of "PG". You may
//        assume the input array is full of Movie instances. The returned array need not be full.
// d) Write a piece of code that creates an instance of the class Movie with the title “Casino
//        Royale”, the studio “Eon Productions”, and the rating “PG­13”.

package demo.Assessment.OOP.TasksToDo7_OOP2;

 public class Movie {
    private String title;
    private String studio;
    private String rating;

    //your code goes here
    public Movie(String a, String b, String c){
        title = a;
        studio = b;
        rating = c;
    }

    public Movie(String T, String S){
        title = T;
        studio = S;
        rating = "PG";
    }

    public static Object getPG(Movie[] base){
        String total = "";
        for(int i = 0; i < base.length; i++){
            if(total == "PG"){
                total = total + base[i].title;
            } else {
                String[] cool = {};
                return cool;
            }
        }
        return total;
    }
//     public static Movie[] getPG(Movie[] mov) {
//         Movie[] pgMov = new Movie[mov.length];
//         int newArrayIndex = 0;
//         for (int i = 0; i < mov.length; i++) {
//             if (mov[i].rating.equals(“PG”)) {
//                 pgMov[newArrayIndex] = mov[i];
//                 newArrayIndex++;
//             }
//         }
//         return pgMov;
//     }

    public String toString(){
        String movie = "Casino Royale, Eon Productions, PG\u00AD13";
        return movie;
    }

     public static void main(String[] args) {
         Movie m = new Movie("Casino Royale", "Eon Productions", "PG\u00AD13");
         System.out.println(m.toString());
     }
 }