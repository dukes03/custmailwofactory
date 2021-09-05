/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author Duke
 */
public class CustomerFactory  {
    public static Customer createCustomer(String type) {
        switch(type) {
            case "1":
                return new RegularCustomer();
              
            case "2":
                return new MountainCustomer();
                
            case "3":
                return new DelinquentCustomer();
                
        }
        return null;
    }
}
