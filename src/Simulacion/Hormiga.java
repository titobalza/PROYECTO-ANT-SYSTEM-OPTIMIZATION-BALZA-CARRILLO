package Simulacion;
import Grafo.Camino;
import Grafo.GrafoMatriz;
import Grafo.Ciudad;        
import EDD.ListaCaminos;
import EDD.ListaCiudades;
import EDD.NodoCamino;
import EDD.NodoCiudad;
import java.util.Random;
        
/**
 * Clase Hormiga que representa una hormiga en un grafo.
 * Se construyen tantas como el usuario indique en la interfaz respectiva.
 * 
 * @author tito_
 * @version 8 feb 2024
 */
public final class Hormiga {
    
    //Declarar la matriz de adyacencia como un atributo est&aacute;tico de la clase Hormiga.
    //Esto permitir&aacute; que todas las instancias de la clase compartan la misma matriz.
    private static GrafoMatriz matriz;
    private Ciudad ciudadActual;
    private final boolean [] ciudadesVisitadas;
    private double distanciarecorrida = 0;
    private final ListaCiudades trayecto;
    private final ListaCaminos caminos;

    /**
     * Constructor de la clase Hormiga que recibe una Ciudad.
     * @param ciudadActual la ciudad actual
     * @param numCiudades para hacer el arreglo de las visitadas.
     * @param matr el grafo matriz
     */
    public Hormiga(GrafoMatriz matr, String ciudadActual, float numCiudades) {
    Hormiga.matriz = matr;
    this.setCiudadActual(ciudadActual);
    this.ciudadesVisitadas = new boolean[(int) numCiudades];
    this.setDistanciaRecorrida(0);
    this.trayecto=new ListaCiudades();
    this.caminos=new ListaCaminos();
}
    
    
    /**
     * Obtiene la ciudad actual de la hormiga.
     * @return <code>Ciudad</code> la ciudad actual.
     */
    public Ciudad getCiudadActual() {
        return ciudadActual;
    }
    
    /**
     * Establece la ciudad actual de la hormiga.
     * A una pasada como par&aacute;metro.
     * 
     * @param ciudadActual n&uacute;mero de la ciudad actual
     */
    public void setCiudadActual(String ciudadActual) {
        Ciudad [] auxilio = this.getMatriz().getVerts();
        for(Ciudad auxilito:auxilio){
            if(auxilito.getNombreDeCiudad().equals(ciudadActual))
                this.ciudadActual=auxilito;
        }
    }

    /**
     * Obtiene el camino recorrido por la hormiga.
     * @return el camino recorrido
     */
    public boolean[] getCaminoRecorrido() {
        return this.ciudadesVisitadas;
    }

    /**
     * Obtiene la matriz del grafo.
     * @return la matriz del grafo
     */
    public GrafoMatriz getMatriz() {
        return matriz;
    }
    
    /** * Funci&oacute;n de actualizar todos los caminos de un grafo.
     * Dada la f&oacute;rmula de actualizaci&oacute;n
     * t -- (1-p)*t.
     * 
     *
     * @param rho pasada por interfaz.
     */
    public void evap(double rho) {
    NodoCamino actual = caminos.getCabeza();
        while (actual != null) {    
            Camino camino = actual.getValor();
            System.out.println(camino.getFeromonas());
            double nuevaFeromona = camino.getFeromonas() * (1-rho);
            camino.setFeromonas(nuevaFeromona);
            System.out.println(camino.getFeromonas());
            actual = actual.getSiguiente();
        }
    }
    
    /**
     * Obtiene la total distancia recorrida.
     * @return <code>double</code> distancia revorrida.
     */
    public double getDistanciaRecorrida() {
        return this.distanciarecorrida;
    }
    
    /**
     * Establece la total distancia recorrida.
     * 
     * @author nelsoncarrillo
     * @version 13 feb 2024
     * @param numero distancia.
     */
    public void setDistanciaRecorrida(double numero) {
         this.distanciarecorrida+=numero;
    }
    
    /** Devuelve, si existe, la ciudad Adyacente a la que se encuentre la hormiga a la que ir&aacute;.
     * Se logra de manera probabilística a través de la expresi&oacute;n.
     * Se hace privado ya que solo complementa otro de los m&eacute;todos de la hormiga.
     * Si ya visit&oacute; todas las adyacentes, pues ah&iacutel se qued&oacute;.
     * Si qeuda en una calle ciega, ah&iacute; queda ya que no se debe ser 
     * visitada dos veces por una hormiga en una misma iteraci&oacute;n.
     * 
     * @author nelsoncarrillo
     * @version 24 feb 2024
     * @return <code>Camino</code> instancia de objeto del camino.;
     *         <code>null</code> si no es posible desplazarse por los motivos especificados.
     * @param alfa puede ser modificado por usuario entonces se deja como param.
     * @param beta puede ser modificado por usuario entonces se deja como param.
     */
    public Camino calcularProbabilidad( double alfa, double beta) {
        Random random = new Random();
        double[] probabilidades = new double[this.getMatriz().getTodosLosCaminosExistentes().getSize()];
        Camino[] todos = new Camino[this.getMatriz().getTodosLosCaminosExistentes().getSize()];
        double sumatoria = 0.0;
        
        NodoCamino aux = this.getMatriz().getTodosLosCaminosExistentes().getCabeza();
        for (int i = 0; i < this.getMatriz().getTodosLosCaminosExistentes().getSize(); i++) {
            todos[i]=aux.getValor();
            
            if ((aux.getValor().getCiudadOrigen().getNombreDeCiudad().equals(this.ciudadActual.getNombreDeCiudad())||aux.getValor().getCiudadDestino().getNombreDeCiudad().equals(this.ciudadActual.getNombreDeCiudad()))&&(!this.caminos.contains(aux.getValor()))) {
                probabilidades[i] = Math.pow(aux.getValor().getFeromonas(), alfa) * Math.pow((1/aux.getValor().getDistancia()), beta);
                sumatoria += probabilidades[i];
            } else {
                probabilidades[i] = 0.0; // No hay camino disponible
                
            }
            
            aux=aux.getSiguiente();
        }
        
        // Normalizar las probabilidades
        for (int i = 0; i < probabilidades.length; i++) {
            probabilidades[i] /= sumatoria;
        }
        
        // Selecci&oacute;nn de camino basado en probabilidades
        double randomValue = random.nextDouble();
        double probabilidadAcumulada = 0.0;
        for (int i = 0; i < probabilidades.length; i++) {
            probabilidadAcumulada += probabilidades[i];
            if (randomValue <= probabilidadAcumulada) {
                               

                return todos[i]; // Devolver el índice del camino seleccionado
            }
        }
        
        return null; // En caso de que no se haya seleccionado ningún camino
    }
    
    
    /**
     * Establece o ubica a la hormiga en una nueva ciudad.
     * Esto de la mano de la implementaci&oacute;n de los m&eacute;todos 
     * anteriormente documentados, para medir primero probabilidad y luego 
     * el index de la nueva ciudad.
     * 
     * @author nelsoncarrillo
     * @version 12 feb 2024
     * @param CantidadDeHormigas de la simulaci&oacute;n puesta por el usuario.
     * @param alfa puede ser modificado por usuario entonces se deja como param.
     * @param beta puede ser modificado por usuario entonces se deja como param.
     * @return <code>true</code> si se movi&oacute; con &eacute;xito.
     *         <code>false</code> si ya han sido visitadas todas las ciudades anexas y no se mueve.
     * @throws java.lang.Exception en caso que se mueva a un v&eacute;rtice que no existe.
     */
    public boolean irHaciaSiguienteCiudad(int CantidadDeHormigas, double alfa, double beta) throws Exception {
        //SE UTILIZA EL MÉTODO ANTERIOR;
        Camino nextCamino = this.calcularProbabilidad(alfa, beta);
        int m = CantidadDeHormigas;
        var Q = 1;

        if (nextCamino != null) { //Ya que no se habría movido de ciudad la hormiga.


            if (nextCamino.getCiudadDestino().getNombreDeCiudad().equals(this.ciudadActual.getNombreDeCiudad())) {
                this.setCiudadActual(nextCamino.getCiudadOrigen().getNombreDeCiudad());
                this.caminos.insertarCaminoAlFinal(nextCamino);
                this.distanciarecorrida += nextCamino.getDistancia();
            } else {
                this.setCiudadActual(nextCamino.getCiudadDestino().getNombreDeCiudad());
                this.caminos.insertarCaminoAlFinal(nextCamino);
                this.distanciarecorrida += nextCamino.getDistancia();
            }
            double tau = nextCamino.getFeromonas();
            double SumaPorIncremento = tau + (Q / this.distanciarecorrida);

            // Tao <- Tao + Sumatoria de recorridos de las hormigas que han pasado por el camino o arista.
            nextCamino.setFeromonas(SumaPorIncremento);

            return true;
        } else {
            return false;
        }
    }
        
}