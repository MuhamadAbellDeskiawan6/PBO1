/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhamadabelldeskiawan2110010393;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class sigakaJabatan {
    private ArrayList<String> jabatanId;
    private ArrayList<String> jabatanNama; 
    private ArrayList<String> jabatanGaji;   
    
    public sigakaJabatan(){
    jabatanId= new ArrayList<>();
    jabatanNama= new ArrayList<>();
    jabatanGaji= new ArrayList<>();
    }
    
    public void setJABATANID(String value){
      this.jabatanId.add(value);
   }
      public ArrayList<String> getJABATANID(){
         return this.jabatanId;
    }
      
    public void setJABATANNAMA(String value){
          this.jabatanNama.add(value);
       }
          public ArrayList<String> getJABATANNAMA(){
             return this.jabatanNama;
        }
    public void setJABATANGAJI(String value){
          this.jabatanGaji.add(value);
       }
          public ArrayList<String> getJABATANGAJI(){
             return this.jabatanGaji;
        }
}
