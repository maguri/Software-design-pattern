package bank_OMG;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by R522 on 18/09/2015.
 */
public class Customer {

    private String id;
    private String name;
    private String adress;
    private String phoneNumber;

    public Customer(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        /* Integer vector[] = new Integer[10];
        int i =0;*/
        Random r = new Random();
        /*
        while(i<vector.length){
            vector[i] = r.nextInt();
            System.out.println(i+"-->"+vector[i]);
            i++;
        }
        */

        this.id = Integer.toString(r.nextInt()); //How do that r.nextInt() becomes a positive Integer ?

        //System.out.println(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
