package pe.upc.edu.edia.dtos;

public class ParticipacionDeEstudiantesPorDesafiosDTO {
    private int idUsuario;
    private String NombreDesafio;
    private float Puntaje;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreDesafio() {
        return NombreDesafio;
    }

    public void setNombreDesafio(String nombreDesafio) {
        NombreDesafio = nombreDesafio;
    }

    public float getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(float puntaje) {
        Puntaje = puntaje;
    }
}
