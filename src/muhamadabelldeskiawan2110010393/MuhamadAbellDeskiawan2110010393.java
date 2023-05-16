/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhamadabelldeskiawan2110010393;

/**
 *
 * @author User
 */
public class MuhamadAbellDeskiawan2110010393 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sigakaKaryawan obj = new sigakaKaryawan();
        obj.setIDKARYAWAN("1");
        obj.setJABATAN("HRD");
        obj.setNAMA("Abell");
        obj.setTMPTLAHIR("BANJARMASIN");
        obj.setTGLLAHIR("06-12-2003");
        obj.setALAMAT("JL.KELAYAN A GG SIDODADI");
        obj.setTGLGABUNG("12-06-2022");
        obj.setNOMORHP("0895703228001");
        obj.setREKENING("7015005558");
        obj.setGajiKaryawan("Gol.1");
        obj.setGajiLembur(6);
    
        System.out.println("\n ID KARYAWAN :"+obj.getIDKARYAWAN() +"\n JABATAN :"+obj.getJABATAN()+ "\n NAMA :"+obj.getNAMA()+"\n TEMPAT LAHIR :"+obj.getTMPTLAHIR()+ "\n TANGGAL LAHIR :"+obj.getTGLLAHIR()+ "\n ALAMAT :"+obj.getALAMAT()+"\n TANGGAL GABUNG :"+obj.getTGLGABUNG() + "\n NOMOR HP :"+obj.getNOMORHP() +"\n REKENING :"+obj.getREKENING());
        System.out.println("Gaji Karyawan :"+obj.getGajiKaryawan());
        System.out.println("Gaji Lembur :"+obj.getGajiLembur()+"\n Gaji Total :"+obj.gajiTotal());
    }
    
}
