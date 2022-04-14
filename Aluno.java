class Aluno{

String nome;
int matricula;
Curso curso;


  
Aluno(String n, int matriculaAluno, Curso meucurso){
    System.out.println("Construtor do player");
    nome = n;
    matricula = matriculaAluno;
    curso = meucurso;
  }


  void exibirRelatorio(){
    String relatorioAluno = "Nome:" + nome + "\nCurso:" + curso.nome + "\nResultado:" + curso.estaAprovado();

  System.out.println(relatorioAluno);

  System.out.println("------------------------------------");
  }

}