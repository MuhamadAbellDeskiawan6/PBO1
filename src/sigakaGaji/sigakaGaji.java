/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigakaGaji;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class sigakaGaji {
    
    private ArrayList<Integer> gajiId;
    private ArrayList<String> gajiKaryawan;
    private ArrayList<String> gajiLembur;
    private ArrayList<String> gajiTotal;
    private ArrayList<String> gajiBayarPinjaman;
    private ArrayList<String> gajiTgl;
    private ArrayList<Integer> gajiBlnKe;
    private ArrayList<String> gajiStatus;
    
    public sigakaGaji(){
    gajiId= new ArrayList<>();
    gajiKaryawan= new ArrayList<>();
    gajiLembur= new ArrayList<>();
    gajiTotal= new ArrayList<>();
    gajiBayarPinjaman= new ArrayList<>();
    gajiTgl= new ArrayList<>();
    gajiBlnKe= new ArrayList<>();
    gajiStatus= new ArrayList<>();
    }
    public sigakaGaji(String value){
        System.out.println(value);
    }
    
     public void setGAJIID(int value){
                this.gajiId.add(value);
            }
            
     public ArrayList<Integer> getGAJIID(){
                return this.gajiId;
            }
    
     public void setGAJIKARYAWAN(String value){
                this.gajiKaryawan.add(value);
            }

     public ArrayList<String> getGAJIKARYAWAN() {
            return this.gajiKaryawan;
        }
    
    public void setGAJILEMBUR(String value){
        this.gajiLembur.add(value);
    }
    
    public ArrayList<String> getGAJILEMBUR(){
    return this.gajiLembur;
    }
    
    public void setGAJITOTAL(String value){
        this.gajiTotal.add(value);
    }
    
    public ArrayList<String> getGAJITOTAL(){
    return this.gajiTotal;
    }
    
    public void setGAJIBAYARPINJAMAN(String value){
                this.gajiBayarPinjaman.add(value);
            }
            
    public ArrayList<String> getGAJIBAYARPINJAMAN(){
                return this.gajiBayarPinjaman;
            }
            
    public void setGAJITGL(String value){
                this.gajiTgl.add(value);
            }
            
    public ArrayList<String> getGAJITGL(){
                return this.gajiTgl;
            }
            
    public void setGAJIBLNKE(int value){
                this.gajiBlnKe.add(value);
            }
            
    public ArrayList<Integer> getGAJIBLNKE(){
                return this.gajiBlnKe;
            }
    public void setGAJISTATUS(String value){
                this.gajiStatus.add(value);
            }
            
    public ArrayList<String> getGAJISTATUS(){
                return this.gajiStatus;
            }
    public void TambahGaji(int gajiId, String gajiKaryawan, String gajiLembur, String gajiTotal, String gajiBayarPinjaman, String gajiTgl, int gajiBlnKe, String gajiStatus){
        
        setGAJIID(gajiId);
        setGAJIKARYAWAN(gajiKaryawan);
        setGAJILEMBUR(gajiLembur);
        setGAJITOTAL(gajiTotal);
        setGAJIBAYARPINJAMAN(gajiBayarPinjaman);
        setGAJITGL(gajiTgl);
        setGAJIBLNKE(gajiBlnKe);
        setGAJISTATUS(gajiStatus);
    }
}
