package hu.tmx.aop.exampleOne.dao;

import hu.tmx.aop.exampleOne.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
