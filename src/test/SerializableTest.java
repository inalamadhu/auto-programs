package test;

import java.io.Serializable;

public class SerializableTest implements Serializable {

    public int i = 0;
    public String s = "";

    public SerializableTest(int i, String s){
        this.i = i;
        this.s = s;
    }

}
