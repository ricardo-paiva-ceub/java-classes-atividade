public class SalaAula {
    private Professor professor;
    private ArrayList<Estudante> estudanteArrayList;
    private String nomeSalaAula;

    public SalaAula(Professor professor, ArrayList<Estudante> estudanteArrayList, String nomeSalaAula) {
        this.professor = professor;
        this.estudanteArrayList = estudanteArrayList;
        this.nomeSalaAula = nomeSalaAula;
    }

    public SalaAula(Professor professor, ArrayList<Estudante> estudanteArrayList) {
        this.professor = professor;
        this.estudanteArrayList = estudanteArrayList;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Estudante> getEstudanteArrayList() {
        return estudanteArrayList;
    }

    public void setEstudanteArrayList(ArrayList<Estudante> estudanteArrayList) {
        this.estudanteArrayList = estudanteArrayList;
    }

    public String getNomeSalaAula() {
        return nomeSalaAula;
    }

    public void setNomeSalaAula(String nomeSalaAula) {
        this.nomeSalaAula = nomeSalaAula;
    }
}