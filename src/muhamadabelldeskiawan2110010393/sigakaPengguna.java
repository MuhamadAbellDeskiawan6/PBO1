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
public class sigakaPengguna {
    private ArrayList<String> penggunaId;
    private ArrayList<String> penggunaUsername; 
    private ArrayList<String> penggunaPassword; 
    private ArrayList<String> penggunaNama; 
    private ArrayList<String> penggunaFoto; 
    private ArrayList<String> penggunaHakAkses ;
            
            public sigakaPengguna() {
            penggunaId= new ArrayList<>();
            penggunaUsername= new ArrayList<>();
            penggunaPassword= new ArrayList<>();
            penggunaNama= new ArrayList<>();
            penggunaFoto= new ArrayList<>();
            penggunaHakAkses= new ArrayList<>();
            }
            
            public void setPENGGUNAID(String value){
                this.penggunaId.add(value);
            }
            
            public ArrayList<String> getPENGGUNAID(){
                return this.penggunaId;
            }
            
            public void setPENGGUNAUSERNAME(String value){
                this.penggunaUsername.add(value);
            }
            
            public ArrayList<String> getPENGGUNAUSEERNAME(){
                return this.penggunaUsername;
            }
            
            public void setPENGGUNAPASSWORD(String value){
                this.penggunaPassword.add(value);
            }
            
            public ArrayList<String> getPENGGUNAPASSWORD(){
                return this.penggunaPassword;
            }
          
            public void setPENGGUNANAMA(String value){
                this.penggunaNama.add(value);
            }
            
            public ArrayList<String> getPENGGUNANAMA(){
                return this.penggunaNama;
            }
            
            public void setPENGGUNAFOTO(String value){
                this.penggunaFoto.add(value);
            }
            
            public ArrayList<String> getPENGGUNAFOTO(){
                return this.penggunaFoto;
            }
            
            public void setPENGGUNAHAKAKSES(String value){
                this.penggunaHakAkses.add(value);
            }
            
            public ArrayList<String> getPENGGUNAHAKAKSES(){
                return this.penggunaHakAkses;
            }
}
