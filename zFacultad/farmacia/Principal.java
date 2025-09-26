public class Principal {

    public static void main(String[] args) {
        // Agregamos una "politica de aceptacion" a la farmacia que determina que medicamentos acepta para vender
        // No estaba en el enunciado
        Farmacia tandil = new Farmacia(
            new CondicionOr(
                new CondicionPorPrecioMenor(100),
                new CondicionOr(
                    new CondicionPorLab("Raffo"), 
                    new CondicionPorLab("Bayer"))));

        Medicamento aspirina = new MedicamentoMilagroso("Aspirina", "Bayer", 10);
        aspirina.addSintoma("Antifebril");

        Medicamento diclo = new Medicamento("Diclofenac", "Raffo", 13);
        diclo.addSintoma("Desinflamatorio");
        diclo.addSintoma("Calmante");

        Medicamento cafiaspirina = new Medicamento("Cafiaspirina", "Elea", 18);
        cafiaspirina.addSintoma("Calmante");

        tandil.addMedicamento(aspirina);
        tandil.addMedicamento(diclo);
        tandil.addMedicamento(cafiaspirina);

        CondicionPorNombre condPorNombre = new CondicionPorNombre("ina");
        System.out.println(tandil.buscarMedicamentos(condPorNombre));

        CondicionPorPrecioMenor condPorPrecio = new CondicionPorPrecioMenor(14);
        System.out.println(tandil.buscarMedicamentos(condPorPrecio));

        System.out.println(tandil.buscarMedicamentos(new CondicionPorLab("raffo")));

        System.out.println(tandil.buscarMedicamentos(
                new CondicionNot(new CondicionAnd(condPorNombre, condPorPrecio))));

    }

}
