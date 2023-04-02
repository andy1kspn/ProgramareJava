package org.spinu;

public interface Human {

    String getName();

    void setName(String name);

    Integer getYear();

    String getLocation();

    void setLocation(String location);

    void go();
   default void eat(){

   }

   int x = 5;




}
