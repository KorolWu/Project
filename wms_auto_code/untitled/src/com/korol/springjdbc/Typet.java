package com.korol.springjdbc;

import java.util.ArrayList;
import java.util.List;

public class Typet<V> {
    private V param;
    public Typet(V arg)
    {
        this.param = arg;
    }
    public  V getparam()
    {
        return this.param;
    }
    public <T> T functionT(T arg,T arg2,Object result)
    {
        System.out.println(arg);
        System.out.println(arg2);
        if(arg instanceof Integer )
        {
            result = (Integer)arg + (Integer)arg2;
            System.out.println(result);
            return arg;
        }
        else if (arg instanceof String)
        {
            result = (String)arg + (String)arg2;
            System.out.println(result);
            return arg;
        }
        return arg;
    }
    public String  function2(V arg1,V arg2)
    {
        if (arg1 instanceof String && arg2 instanceof String)
        {
            return (String)arg1 + (String)arg2;
        }
        List list = new ArrayList();
        return null;

    }

}
