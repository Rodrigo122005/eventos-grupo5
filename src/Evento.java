public class Evento{

  String NomeEvento;
  int vagas;
  boolean isInscrito;
  int numInscricao;
  int vagasInscritas;

   public Evento(String NomeEvento, int vagas, boolean isInscrito, int numInscricao, int vagasInscritas){
     this.NomeInscrito = NomeInscrito;
     this.vagas = vagas;
     this.isInscrito = isInscrito;
     this.numInscricao = numInscricao;
     this.vagasInscritas = vagasInscritas;
}

//GETTERS
public String getNomeEvento(){
   return NomeEvento;
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
public void setNomeEvento(String NomeEvento){
   this.NomeEvento = NomeEvento;
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
