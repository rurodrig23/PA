package introduccion;

public class cercle {
    private double pi = 3.14;
    private double radi = 10;


   public cercle(double pi , double radi) {
    this.pi = pi;
    this.radi = radi;

   }
   public float getpi(double pi){
    return pi;

   }
   public double getradi(double radi){
    return radi;

   }

   public void setPi(double pi) {
    this.pi = pi;
    }

    public void setRadi(double radi) {
    this.radi = radi;
    }

   public class Main {
    public static void main(String[] args) {
        double pi = 3.14;
        double radi = 10.0;

        cercle cercle = new cercle(pi, radi);

    }
}
}


