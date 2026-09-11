public class Evento{

  String NomeInscrito;
  int vagas;
  boolean isInscrito;
  int numInscricao;
  int vagasInscritas;

   public Evento(String NomeInscrito, int vagas, boolean isInscrito, int numInscricao, int vagasInscritas){
     this.NomeInscrito = NomeInscrito;
     this.vagas = vagas;
     this.isInscrito = isInscrito;
     this.numInscricao = numInscricao;
     this.vagasInscritas = vagasInscritas;
}

//GETTERS
public String getNomeInscrito(){
   return NomeInscrito;
}

public int getvagas(){
   return vagas;
}

public boolean getisInscrito(){
   return isInscrito;
}

public int getnumInscricao(){
   return numInscricao;
}

public int getvagasInscritas(){
   return vagasInscritas;
}

//SET
public void setNomeInscrito(String NomeInscrito){
   this.NomeInscrito = NomeInscrito;
}

public void setvagas(int vagas){
   this.vagas = vagas;
}

public void setisInscrito(boolean isInscrito){
   this.isInscrito = isInscrito;
}

public void setnumInscricao(int numInscricao){
   this.numInscricao = numInscricao;
}

public void setvagasInscritas(int vagasInscritas){
   this.vagasInscritas = vagasInscritas;
}

public void ApresentarInscrito(){

   if(isInscrito){
   System.out.println("Nome: " + NomeInscrito + "; está inscrito, e é a inscrição número: " + numInscricao + ".");
   }
   else{
  System.out.println("Nome: " + NomeInscrito + "; não está inscrito.");
   }
}


  
  
}
