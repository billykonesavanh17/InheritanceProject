package ctec.model;

public abstract class Book implements CoolThing, Comparable

{

//Three Data Members

private String bookName;

private String mainCharacter;

private int yearWritten;



public String getBookName()

{

return bookName;

}



public void setBookName(String bookName)

{

this.bookName = bookName;

}



public int getYearWritten()

{

return yearWritten;

}



public void setYearWritten(int yearWritten)

{

this.yearWritten = yearWritten;

}


public String getMainCharacter()

{

return mainCharacter;

}



public void setMainCharacter(String mainCharacter)

{

this.mainCharacter = mainCharacter;

}



}


