package ngo2024;

import oru.inf.InfDB;
import oru.inf.InfException;


public class NGO2024 {
    
    private static InfDB idb;
    
    public static void main(String[] args) {
        
        try{
            idb = new InfDB("ngo_2024","3306","dbAdmin2024","dbAdmin2024PW");
            new Inloggning(idb).setvisible(true);
            System.out.println("funkar");
            
        } catch (InfException ex){
            System.out.println(ex.getMessage());
        }
    }

}

