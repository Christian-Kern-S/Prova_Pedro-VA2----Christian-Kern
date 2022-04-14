class Disciplina{

  String nome1;
  String nome2;
  String nome3;
  String nome4;
  float notaFinal;
  float resultado;

  

  Professor professor1 = new Professor();
  Professor professor2 = new Professor();
  Professor professor3 = new Professor();

  
  void exibirRelatorioDisc(){
    String relatorioDisc = "Disciplina 1:" + nome1 +"\nDisciplina 2:" + nome2  + "\nDisciplina 3:" + nome3 + "\nDisciplina 4:" + nome4 + "\nProfessor:" + professor1.nome + "\nNota Final:" + retornarNotaFinal();

    System.out.println(relatorioDisc);
  }

  float retornarNotaFinal(){

    resultado = resultado + 65;
    
    return resultado;
    
  }
  
}