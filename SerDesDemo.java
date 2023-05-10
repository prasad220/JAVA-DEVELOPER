package ser_des_inherit2;



import java.io.*;

public class SerDesDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Developer developer = new Developer(5,10);

        System.out.println("Object has been serialized");
        System.out.println(developer.num_of_devs +" "+ developer.num_of_empl);
        FileOutputStream fileOutputStream = new FileOutputStream("ser_des_dev2.ser");
        ObjectOutputStream objectoutputStream = new ObjectOutputStream(fileOutputStream);
        objectoutputStream.writeObject(developer);



        Developer dev = null;

        FileInputStream fileInputStream = new FileInputStream("ser_des_dev2.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        dev = (Developer) objectInputStream.readObject();

        System.out.println("Object has been deserialized");
        System.out.println(dev.num_of_devs +" "+ dev.num_of_empl);
    }
}
