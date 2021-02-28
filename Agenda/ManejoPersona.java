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
   
   public void mostrar(){
      System.out.println("... Personas en la Agenda ...");
      Iterator<Persona> itrPersona = arrPersona.iterator();
      while(itrPersona.hasNext()){
	      Persona persona = itrPersona.next();
	      System.out.println(persona.getNombre() + "  "
			+ persona.getApellidoP() + "  "
			+ persona.getTelefono() + "  "
			+ persona.getDirE());
      }
   }
   
   public void buscar(){
   }
   
   public void eliminar(){
   }
}