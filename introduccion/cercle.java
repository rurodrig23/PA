package introduccion;

class Cercle {
    private double radi = 12;
    private double pi = 3.14;

    public double area(){
        double area_calculada = this.pi * (this.radi * this.radi);
        return area_calculada;
    }

    public double perimetre(){
        double perimetro_calculado = 2 * this.pi * this.radi;
        return perimetro_calculado;
    }
}

class Main {
    public static final void main (String[] args) {
        Cercle c = new Cercle();
        System.out.println(c.area());
        System.out.println(c.perimetre());
    }
}