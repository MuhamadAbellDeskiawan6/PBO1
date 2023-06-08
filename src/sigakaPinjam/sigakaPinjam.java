/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigakaPinjam;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class sigakaPinjam {
    private ArrayList<Integer> pinjamId; 
    private ArrayList<String> pinjamKaryawan; 
    private ArrayList<String> pinjamJumlah; 
    private ArrayList<String> pinjamBayar;
            
            public sigakaPinjam() {
            pinjamId = new ArrayList<>();
            pinjamKaryawan = new ArrayList<>();
            pinjamJumlah = new ArrayList<>();
            pinjamBayar = new ArrayList<>();
            }
            
            public void setPINJAMID(int value){
                this.pinjamId.add(value);
            }
            
            public ArrayList<Integer> getPINJAMID(){
                return this.pinjamId;
            }
            
            public void setPINJAMKARYAWAN(String value){
                this.pinjamKaryawan.add(value);
            }
            
            public ArrayList<String> getPINJAMKARYAWAN(){
                return this.pinjamKaryawan;
            }
            
            public void setPINJAMJUMLAH(String value){
                this.pinjamJumlah.add(value);
            }
            
            public ArrayList<String> getPINJAMJUMLAH(){
                return this.pinjamJumlah;
            }
          
            public void setPINJAMBAYAR(String value){
                this.pinjamBayar.add(value);
            }
            
            public ArrayList<String> getPINJAMBAYAR(){
                return this.pinjamBayar;
            }
            
            public void TambahPinjam(int pinjamID, String pinjamKaryawan, String pinjamJumlah, String pinjamBayar){
            
                setPINJAMID(pinjamID);
                setPINJAMKARYAWAN(pinjamKaryawan);
                setPINJAMJUMLAH(pinjamJumlah);
                setPINJAMBAYAR(pinjamBayar);
            }
            
}
