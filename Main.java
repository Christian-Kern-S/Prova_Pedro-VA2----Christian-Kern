class Main {
  public static void main(String[] args) {
    
    Curso cpu = new Curso();
    
    Aluno aluno1 = new Aluno("Christian",40028922,cpu);
    Aluno aluno2 = new Aluno("Vilalba",998575854,cpu);

    Professor professor1 = new Professor();
    professor1.nome = "Pedro";

    Professor professor2 = new Professor();
    professor2.nome = "Carol";
    
    Professor professor3 = new Professor();
    professor3.nome = "Wendel";
    
    Disciplina disc = new Disciplina();

    disc.nome1 = "Poo";
    disc.nome2 = "Banco de Dados";
    disc.nome3 = "Algoritimos";
    disc.nome4 = "Sitemas Operacionais";
    
    cpu.nome = "Ciencia da Computação";
    
    aluno1.exibirRelatorio();
    aluno2.exibirRelatorio();

    
    disc.exibirRelatorioDisc();
    
  }
}