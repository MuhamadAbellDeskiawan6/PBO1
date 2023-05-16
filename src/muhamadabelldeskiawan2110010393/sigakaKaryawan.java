/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhamadabelldeskiawan2110010393;

/**
 *
 * @author User
 */
public class sigakaKaryawan extends sigakaGaji {
    private String idKaryawan, jabatan, nama, tmptLahir, tglLahir, alamat, tglGabung, nomorHp, rekening;
            
            public sigakaKaryawan() {}
            
            public void setIDKARYAWAN(String idKaryawan){
                this.idKaryawan=idKaryawan;
            }
            
            public String getIDKARYAWAN(){
                return this.idKaryawan;
            }
            
            public void setJABATAN(String jabatan){
                this.jabatan=jabatan;
            }
            
            public String getJABATAN(){
                return this.jabatan;
            }
            
            public void setNAMA(String nama){
                this.nama=nama;
            }
            
            public String getNAMA(){
              return this.nama;
            }
            
            public void setTMPTLAHIR(String tmptLahir){
                this.tmptLahir=tmptLahir;
            }
            
            public String getTMPTLAHIR() {
               return this.tmptLahir;
            }
            
            public void setTGLLAHIR(String tglLahir) {
                this.tglLahir=tglLahir;
            }
            
            public String getTGLLAHIR(){
                return this.tglLahir;
            }
            
            public void setALAMAT(String alamat) {
                this.alamat=alamat;
            } 
            
            public String getALAMAT(){
                return this.alamat;
            }
            
            public void setTGLGABUNG(String tglGabung) {
                this.tglGabung=tglGabung;
            }
            
             public String getTGLGABUNG(){
                return this.tglGabung;
            }
            
            public void setNOMORHP(String nomorHP) {
                this.nomorHp=nomorHP;
            }
            
             public String getNOMORHP(){
                return this.nomorHp;
            }
            
            public void setREKENING(String rekening) {
                this.rekening=rekening;
            }
            
             public String getREKENING(){
                return this.rekening;
            }
           
}
