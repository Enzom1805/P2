package prac1;
import java.time.LocalDate;

public class Persona{
   
        String nombre ;
        int edad ;
        LocalDate fechaNacimiento;
        int dni;
        String sexo;
        double peso;
        double altura;

        public Persona(int DNI){
            nombre = "N, N";
            dni = DNI;
            edad = 25;
            fechaNacimiento = LocalDate.of(2000,8,20);
            sexo = "Femenino";
            peso = 1.0;
            altura = 1.0;
        }
        public Persona(int dni, String nombre){
            this.nombre = nombre;
            this.dni = dni;
            edad = 25;
            fechaNacimiento = LocalDate.of(2000,8,20);
            sexo = "Femenino";
            peso = 1.0;
            altura = 1.0;
        }
        public Persona(int dni, String nombre, LocalDate fechaNacimiento){
            this.nombre = nombre;
            this.dni = dni;
            edad = 25;
            this.fechaNacimiento = fechaNacimiento;
            sexo = "Femenino";
            peso = 1.0;
            altura = 1.0;
        }
        public void setNombre(String nom){
            nombre = nom; 
        }
        public void setEdad(int eda){
            edad = eda; 
        }
        public void setFechaN(LocalDate fec){
            fechaNacimiento = fec; 
        }
        public void setSexo(String sex){
            sexo = sex; 
        }
        public void setPeso(double pes){
            peso = pes;
        }
        public void setAltura(double alt){
            altura = alt; 
        }
        public double getIMC(){
            double imc = peso/(altura * altura);
            System.out.println("Indice de masa corporal: " + imc);
            return imc;
        }
        public boolean enForma(){
            double imc = getIMC();
            if(imc > 18.5 && imc < 25){
                System.out.println("Esta en forma");
                return true;
            }else{
                System.out.println("No esta en forma");
                return false;
            }
        }
        public boolean mayorDeEdad(){
            if(edad >= 18){
                System.out.println("Es mayor de edad");
                return true;
            }else{
                System.out.println("No es mayor de edad");
                return false;
            }
        }
        public boolean puedeVotar(){
            if(edad >= 16){
                System.out.println("Tiene edad para votar");
                return true;
            }else{
                System.out.println("No tiene edad para votar");
                return false;
            }
        }
        public boolean esSuCumpleaños(){
            LocalDate hoy = LocalDate.now();
            if(hoy.getDayOfMonth() == fechaNacimiento.getDayOfMonth() && hoy.getMonth() == fechaNacimiento.getMonth()){
                System.out.println("Hoy es su Cumpleaños, Feliz cumpleaños!");
                return true;
            }else{
                return false;
            }
        }
        public boolean esCoherente(){
            LocalDate hoy = LocalDate.now();
            int edadC = hoy.getYear() - fechaNacimiento.getYear();
            if(edadC == edad){
                System.out.println("La edad es coherente");
                return true;
            }else{
                System.out.println("La edad no es coherente");
                return false;
            }
        }
        public String getNombre(){
            return nombre;
        }
        public int getEdad(){
            return edad;
        }
        public LocalDate getFechaNac(){
            return fechaNacimiento;
        }
        public int getDni(){
            return dni;
        }
        public String getSexo(){
            return sexo;
        }
        public double getPeso(){
            return peso;
        }
        public double getAltura(){
            return altura;
        }
    }