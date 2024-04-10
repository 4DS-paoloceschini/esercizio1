package fattura;

public class Fattura extends DocumentoFiscale {
        protected Data data;
        protected Ora ora;
        private Azienda azienda;
        private Prodotto[] carrello;
        private int[] numProdotti;

        Fattura(Data data, Ora ora, Azienda azienda, Prodotto[] carrello, int[] numProdotti) {
            super(data, ora, azienda, carrello, numProdotti);
        }


    }

