class Curso{

  String nome;
  Disciplina disciplina = new Disciplina();
  Disciplina disciplina2;
  Disciplina disciplina3;

 

  boolean estaAprovado(){
    if(disciplina.retornarNotaFinal() < 60){
    return false;
      }
    return true;
  }

  
}