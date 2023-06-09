/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigakaKaryawan;
import java.util.ArrayList;
import sigakaGaji.sigakaGaji;

/**
 *
 * @author User
 */
public class sigakaKaryawan  {
    private ArrayList<Integer> idKaryawan; 
    private ArrayList<String> jabatan;
    private ArrayList<String> nama;
    private ArrayList<String> tmptLahir; 
    private ArrayList<String> tglLahir;
    private ArrayList<String> alamat; 
    private ArrayList<String> tglGabung; 
    private ArrayList<String> nomorHp; 
    private ArrayList<String> rekening;
            
            public sigakaKaryawan() {
            idKaryawan= new ArrayList<>();
            jabatan= new ArrayList<>();
            nama= new ArrayList<>();
            tmptLahir= new ArrayList<>();
            tglLahir= new ArrayList<>();
            alamat= new ArrayList<>();
            tglGabung= new ArrayList<>();
            nomorHp= new ArrayList<>();
            rekening= new ArrayList<>();
            }
            
            public void setIDKARYAWAN(int value){
                this.idKaryawan.add(value);
            }
            
            public ArrayList<Integer> getIDKARYAWAN(){
                return this.idKaryawan;
            }
            
            public void setJABATAN(String value){
                this.jabatan.add(value);
            }
            
            public ArrayList<String> getJABATAN(){
                return this.jabatan;
            }
            
            public void setNAMA(String value){
                this.nama.add(value);
            }
            
            public ArrayList<String> getNAMA(){
              return this.nama;
            }
            
            public void setTMPTLAHIR(String value){
                this.tmptLahir.add(value);
            }
            
            public ArrayList<String> getTMPTLAHIR() {
               return this.tmptLahir;
            }
            
            public void setTGLLAHIR(String value) {
                this.tglLahir.add(value);
            }
            
            public ArrayList<String> getTGLLAHIR(){
                return this.tglLahir;
            }
            
            public void setALAMAT(String value) {
                this.alamat.add(value);
            } 
            
            public ArrayList<String> getALAMAT(){
                return this.alamat;
            }
            
            public void setTGLGABUNG(String value) {
                this.tglGabung.add(value);
            }
            
             public ArrayList<String> getTGLGABUNG(){
                return this.tglGabung;
            }
            
            public void setNOMORHP(String value) {
                this.nomorHp.add(value);
            }
            
             public ArrayList<String> getNOMORHP(){
                return this.nomorHp;
            }
            
            public void setREKENING(String value) {
                this.rekening.add(value);
            }
            
             public ArrayList<String> getREKENING(){
                return this.rekening;
            }
             
            public void tambahKaryawan(int idKaryawan, String jabatan, String nama, String tmptLahir, String tglLahir, String alamat, String tglGabung, String nomorHp, String rekening){
        
                setIDKARYAWAN(idKaryawan);
                setJABATAN(jabatan);
                setNAMA(nama);
                setTMPTLAHIR(tmptLahir);
                setTGLLAHIR(tglLahir);
                setALAMAT(alamat);
                setTGLGABUNG(tglGabung);
                setNOMORHP(nomorHp);
                setREKENING(rekening);
            }
}
