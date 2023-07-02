package juegoPreguntasYRespuestas;

public class PreguntasRespuestas {
    private String pregunta;
    private String respuesta;
    private String pista1;
    private String pista2;

    public PreguntasRespuestas() {
    }

    public PreguntasRespuestas(String pregunta, String respuesta, String pista1, String pista2) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.pista1 = pista1;
        this.pista2 = pista2;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPista1() {
        return pista1;
    }

    public void setPista1(String pista1) {
        this.pista1 = pista1;
    }

    public String getPista2() {
        return pista2;
    }

    public void setPista2(String pista2) {
        this.pista2 = pista2;
    }



}
