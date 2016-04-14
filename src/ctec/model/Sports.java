package ctec.model;



public abstract class Sports implements CoolThing, Comparable

{

//Three data members

private String teamName;

private String place;

private long pointsScored;

/**

* @return the place

*/

public String getPlace()

{

return place;

}

/**

* @param place the place to set

*/

public void setPlace(String place)

{

this.place = place;

}

/**

* @return the teamName

*/

public String getTeamName()

{

return teamName;

}

/**

* @return the pointsScored

*/

public long getPointsScored()

{

return pointsScored;

}

/**

* @param teamName the teamName to set

*/

public void setTeamName(String teamName)

{

this.teamName = teamName;

}

/**

* @param pointsScored the pointsScored to set

*/

public void setPointsScored(long pointsScored)

{

this.pointsScored = pointsScored;

}

}
