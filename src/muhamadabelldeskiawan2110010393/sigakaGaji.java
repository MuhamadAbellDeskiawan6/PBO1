/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhamadabelldeskiawan2110010393;

/**
 *
 * @author User
 */
public class sigakaGaji {
    
    private String gajiId;
    private int gajiKaryawan;
    private int gajiLembur;
    private int gajiTotal;
    private String gajiBayarPinjaman;
    private String gajiTgl;
    private String gajiBlnKe;
    private String gajiStatus;
    
    public sigakaGaji(){}
    public sigakaGaji(String value){
        System.out.println(value);
    }
    
     public void setGAJIID(String gajiId){
                this.gajiId=gajiId;
            }
            
            public String getGAJIID(){
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
    
    public void setGAJIBAYARPINJAMAN(String gajiBayarPinjaman){
                this.gajiBayarPinjaman=gajiBayarPinjaman;
            }
            
            public String getGAJIBAYARPINJAMAN(){
                return this.gajiBayarPinjaman;
            }
            
    public void setGAJITGL(String gajiTgl){
                this.gajiTgl=gajiTgl;
            }
            
            public String getGAJITGL(){
                return this.gajiTgl;
            }
            
    public void setGAJIBLNKE(String gajiBlnKe){
                this.gajiBlnKe=gajiBlnKe;
            }
            
            public String getGAJIBLNKE(){
                return this.gajiBlnKe;
            }
    public void setGAJISTATUS(String gajiStatus){
                this.gajiStatus=gajiStatus;
            }
            
            public String getGAJISTATUS(){
                return this.gajiStatus;
            }
    
}
