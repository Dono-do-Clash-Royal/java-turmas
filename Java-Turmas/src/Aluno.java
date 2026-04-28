import java.util.Calendar;
public class Aluno {

    public int currentYear = Calendar.getInstance().get(Calendar.YEAR);
    private String codigo;
    private String nomeProprio;
    private String nomeApelido;
    private int anoNascimento;
    private Turma turma;

    public Aluno() {
        this.codigo = "";
        this.nomeProprio = "";
        this.nomeApelido = "";
        this.anoNascimento = 0;
        this.turma = new Turma();
    }

    public Aluno(String codigo, String nomeProprio, String nomeApelido, int anoNascimento, Turma turma) {
        this.codigo = codigo;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
        this.anoNascimento = anoNascimento;
        this.turma = turma;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomeApelido() {
        return nomeApelido;
    }

    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void getNomeCompleto() {
        System.out.println("Nome do Aluno: " + this.nomeProprio + " " + this.nomeApelido);
    }

    public void getIdade() { 
        System.out.println((currentYear - this.anoNascimento));
    }
}
