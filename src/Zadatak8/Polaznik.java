
    package Zadatak8;

    public class Polaznik implements Comparable<Polaznik> {
        private String ime;
        private String prezime;
        private String email;

        public Polaznik(String ime, String prezime, String email) {
            this.ime = ime;
            this.prezime = prezime;
            this.email = email;
        }

        public String getIme() {
            return ime;
        }

        public String getPrezime() {
            return prezime;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Ime: " + ime + ", Prezime: " + prezime + ", E-mail: " + email;
        }


        @Override
        public int hashCode() {
            return email.hashCode();
        }

        @Override
        public int compareTo(Polaznik o) {
            return this.getPrezime().compareTo(o.getPrezime());
        }
    }

