package ser_des_inherit2;



import java.io.Serializable;

public class Developer extends Employee implements Serializable {
    int num_of_devs;
//    Developer(int a,int b) {
//        super(a);
//        this.num_of_devs = b;
 //   }


    Developer(int num_of_devs,int num_of_empl){
        super(num_of_empl);
        this.num_of_devs = num_of_devs;
    }

}
