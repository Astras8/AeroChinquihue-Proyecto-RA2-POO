public class Main{
    public static void main(String[] args) {

        // Arreglo para almacenar los datos de los destinos dados en el enunciado.
        Destino[] PoblamientoDatosDestinos = new Destino[13];

        // Destinos
        PoblamientoDatosDestinos[0] = new Destino("Cochamó", 20000, 5000);
        PoblamientoDatosDestinos[1] = new Destino("Puelo Bajo", 20000, 5000);
        PoblamientoDatosDestinos[2] = new Destino("Contao", 20000, 5000);
        PoblamientoDatosDestinos[3] = new Destino("Rio Negro", 25000, 6000);
        PoblamientoDatosDestinos[4] = new Destino("Pupelde", 25000, 6000);
        PoblamientoDatosDestinos[5] = new Destino("Chepu", 30000, 8000);
        PoblamientoDatosDestinos[6] = new Destino("Ayacara", 30000, 8000);
        PoblamientoDatosDestinos[7] = new Destino("Pillán", 40000, 12000);
        PoblamientoDatosDestinos[8] = new Destino("Reñihue", 40000, 12000);
        PoblamientoDatosDestinos[9] = new Destino("Isla Quenac", 40000, 12000);
        PoblamientoDatosDestinos[10] = new Destino("Palqui", 40000, 12000);
        PoblamientoDatosDestinos[11] = new Destino("Chaitén", 50000, 15000);
        PoblamientoDatosDestinos[12] = new Destino("Santa Bárbara", 50000, 15000);

        // Arreglo para almacenar los tipos de aviones dados en el enunciado.
        Avion[] PoblamientoDatosAviones = new Avion[3];

        // Modelos de aviones
        PoblamientoDatosAviones[0] = new Cessna310("CESSNA310", 6, 910, "C310-1");
        PoblamientoDatosAviones[1] = new Cessna208("CESSNA208 CARAVAN", 9, 1315, "C208C-1");
        PoblamientoDatosAviones[2] = new Let410("LET410UVP-E20", 19, 1800, "LET420-1");
    }
}