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
public class sigakaAbsen {
    private ArrayList<String> absenId; 
    private ArrayList<String> absenKaryawan;
    private ArrayList<String> absenHari; 
    private ArrayList<String> absenStatus;
            
            public sigakaAbsen() {
            absenId= new ArrayList<>();
            absenKaryawan= new ArrayList<>();
            absenHari= new ArrayList<>();
            absenStatus= new ArrayList<>();
            }
            
            public void setABSENID(String value){
                this.absenId.add(value);
            }
            
            public ArrayList<String> getABSENID(){
                return this.absenId;
            }
            
            public void setABSENKARYWAN(String value){
                this.absenKaryawan.add(value);
            }
            
            public ArrayList<String> getABSENKARYAWAN(){
                return this.absenKaryawan;
            }
            
            public void setABSENHARI(String value){
                this.absenHari.add(value);
            }
            
            public ArrayList<String> getABSENHARI(){
                return this.absenHari;
            }
}
