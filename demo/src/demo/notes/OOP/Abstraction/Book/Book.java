package demo.notes.OOP.Abstraction.Book;

import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    public String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book{
    public void setTitle(String s){
        // return s written like this
        title = s;
    }
}


