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
public class sigakaGaji {
    
    private ArrayList<String> gajiId;
    private int gajiKaryawan;
    private int gajiLembur;
    private int gajiTotal;
    private ArrayList<String> gajiBayarPinjaman;
    private ArrayList<String> gajiTgl;
    private ArrayList<String> gajiBlnKe;
    private ArrayList<String> gajiStatus;
    
    public sigakaGaji(){
    gajiId= new ArrayList<>();
    gajiBayarPinjaman= new ArrayList<>();
    gajiTgl= new ArrayList<>();
    gajiBlnKe= new ArrayList<>();
    gajiStatus= new ArrayList<>();
    }
    public sigakaGaji(String value){
        System.out.println(value);
    }
    
     public void setGAJIID(String value){
                this.gajiId.add(value);
            }
            
     public ArrayList<String> getGAJIID(){
                return this.gajiId;
            }
    
    public void setGajiKaryawan(String gol){
    if (gol.equals("Gol.1")){
        gajiKaryawan=3500000;
    } else if (gol.equals("Gol.2")){
        gajiKaryawan=4000000;
    }else {
        gajiKaryawan=4500000;
    }
    }
    
    public int getGajiKaryawan() {
        return this.gajiKaryawan;
    }
    
    public void setGajiLembur(int jamKerja){
       
        if (jamKerja==0){
            gajiLembur=0;
        }else if (jamKerja>=1 && jamKerja<=2){
             gajiLembur=getGajiKaryawan()+300000;
        } else if (jamKerja>=3 && jamKerja<=4){
            gajiLembur=getGajiKaryawan()+400000;
        } else {
            gajiLembur=getGajiKaryawan()+600000;
    }
    }
    
    public int getGajiLembur(){
    return this.gajiLembur;
    }
    
    public int gajiTotal(){
    return getGajiKaryawan()+getGajiLembur();
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
            
    public void setGAJIBLNKE(String value){
                this.gajiBlnKe.add(value);
            }
            
    public ArrayList<String> getGAJIBLNKE(){
                return this.gajiBlnKe;
            }
    public void setGAJISTATUS(String value){
                this.gajiStatus.add(value);
            }
            
    public ArrayList<String> getGAJISTATUS(){
                return this.gajiStatus;
            }
    
}
