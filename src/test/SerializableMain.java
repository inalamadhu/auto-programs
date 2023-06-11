package test;

import java.io.*;

public class SerializableMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    /*    SerializableTest obj = new SerializableTest(2,"sampletest");


        FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.dir")+"/src/qa/data.txt"));
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(obj);
        os.flush();
        os.close();*/

        FileInputStream fis = new FileInputStream(new File(System.getProperty("user.dir")+"/src/qa/data.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerializableTest o = (SerializableTest) ois.readObject();
        System.out.println(o.i+"......."+o.s);


    }
}
