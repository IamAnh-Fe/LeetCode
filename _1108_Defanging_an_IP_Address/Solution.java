package _1108_Defanging_an_IP_Address;

import java.util.Arrays;

public class Solution {
    public static String BruteForce(String address) {
        StringBuilder sb = new StringBuilder();
        for(int i= 0; i < address.length(); i++ ){
            if(address.charAt(i) == '.'){
                sb.append("[").append(address.charAt(i)).append("]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }


    public static void main(String[] args) {
       String address = "1.1.1.1";
         System.out.println(defangIPaddr(address));
        System.out.println(BruteForce(address));

    }
}
