import java.util.*;

public class ManejoPersona{
   private static ArrayList<Persona> arrPersona = new ArrayList<Persona>(); 
   private Persona objPersona;
   
   public ManejoPersona(){
   }
   
   public void agregar(String nom, String apeP, String apeM, String tel, String dir, String dia, String mes, String year){
      objPersona = new Persona();
      objPersona.setNombre(nom);
      objPersona.setApellidoP(apeP);
      objPersona.setApellidoM(apeM);
      objPersona.setTelefono(tel);
      objPersona.setDirE(dir);
      objPersona.setDiaC(dia);
      objPersona.setMesC(mes);
      objPersona.setYearC(year);
      arrPersona.add(objPersona);
   }
   
   public ArrayList datos(){
      return arrPersona;
   }
   
   public Persona buscar(String nom, String apeP, String tel){
      Persona p = null;
      for(int i = 0; i < arrPersona.size(); i++){
         objPersona = arrPersona.get(i);
         if(objPersona.getNombre().equals(nom) && objPersona.getApellidoP().equals(apeP) && objPersona.getTelefono().equals(tel))
            p = objPersona;
      }
      return p;
   }
   
   public void eliminar(){
   }
}