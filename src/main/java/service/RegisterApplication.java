package service;

import controller.RestMessageController;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ali on 7.11.2016.
 */
public class RegisterApplication extends Application{
    private Set<Object>singletons=new HashSet<Object>();

    public RegisterApplication(){
        singletons.add(new RestMessageController());
    }

    @Override
    public Set<Object>getSingletons(){
        return singletons;
    }

}
