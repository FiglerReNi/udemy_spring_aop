package hu.tmx.aop.exampleOne.service;

import hu.tmx.aop.exampleOne.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    private Dao2 dao2;

    @Autowired
    public void setDao2(Dao2 dao2) {
        this.dao2 = dao2;
    }

    public String calculateSomething(){
        return dao2.retrieveSomething();
    }
}
