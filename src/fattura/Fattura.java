package fattura;

public class Fattura {
    public class DocumentoFiscale {
        protected Data data;
        protected Ora ora;
        private Azienda azienda;
        private Prodotto[] carrello;
        private int[] numProdotti;

        DocumentoFiscale (Data data, Ora ora, Azienda azienda, Prodotto[] carrello, int[] numProdotti){
            this.data = data;
            this.ora = ora;
            this. azienda = azienda;
            this.carrello = carrello;
            this.numProdotti = numProdotti;
        }

        public Data getData() {
            return data;
        }

        public Ora getOra() {
            return ora;
        }

        public Azienda getAzienda() {
            return azienda;
        }

        public Prodotto[] getCarrello() {
            return carrello;
        }

        public int[] getNumProdotti() {
            return numProdotti;
        }

        @Override
        public String toString() {
            String strRet = "";
            for (int i = 0; i< carrello.length; i++){
                strRet += carrello[i] + "\n" + numProdotti + "\n";
            }
            return strRet;
        }
    }

}
