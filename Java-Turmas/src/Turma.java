public class Turma {
    private String codigo;
    private String nomeCurso;
    private int anoInicio;
    private int anoFim;

    

   public Turma() {
    this.codigo = "";
    this.nomeCurso = "";
    this.anoInicio = 0;
    this.anoFim = 0;
    }

    

   public Turma(String codigo, String nomeCurso, int anoInicio, int anoFim) {
    this.codigo = codigo;
    this.nomeCurso = nomeCurso;
    this.anoInicio = anoInicio;
    this.anoFim = anoFim;


}

    
    

   @Override
    public String toString() {
        return "Turma [codigo=" + codigo + ", nomeCurso=" + nomeCurso + ", anoInicio=" + anoInicio + ", anoFim=" + anoFim
                + "]";
    }



   public String getCodigo() {
    return codigo;
   }
   public void setCodigo(String codigo) {
    this.codigo = codigo;
   }
   public String getNomeCurso() {
    return nomeCurso;
   }
   public void setNomeCurso(String nomeCurso) {
    this.nomeCurso = nomeCurso;
   }
   public int getAnoInicio() {
    return anoInicio;
   }
   public void setAnoInicio(int anoInicio) {
    this.anoInicio = anoInicio;
   }
   public int getAnoFim() {
    return anoFim;
   }
   public void setAnoFim(int anoFim) {
    this.anoFim = anoFim;
   }
        
    public String getInfoTurma() {
        return "Informação da turma: \n " + 
               "Codigo do Curso: " + codigo.toUpperCase();
               "anoInicio: " + anoInicio.toUpperCase();
               "anoFim: " + anoInicio +
               "anoFIm: " + anoFim;
    }

}
    