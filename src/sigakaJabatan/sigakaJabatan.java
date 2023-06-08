/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigakaJabatan;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class sigakaJabatan {
    private ArrayList<Integer> jabatanId;
    private ArrayList<String> jabatanNama; 
    private ArrayList<String> jabatanGaji;   
    
    public sigakaJabatan(){
    jabatanId= new ArrayList<>();
    jabatanNama= new ArrayList<>();
    jabatanGaji= new ArrayList<>();
    }
    
    public void setJABATANID(int value){
      this.jabatanId.add(value);
   }
      public ArrayList<Integer> getJABATANID(){
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
    public void TambahJabatan(int jabatanId, String jabatanNama, String jabatanGaji){
    
        setJABATANID(jabatanId);
        setJABATANNAMA(jabatanNama);
        setJABATANGAJI(jabatanGaji);
    }
}
