package pacma;

public class pacma{

    private int newPosX;
    private int newPosY;
    private int puntuacion;
    private int vidas;

    public pacma(int newPosX, int newPosY){

        this.newPosX;
        this.newPosY;
        this.puntuacion = 2;
        this.vidas = 3;

    }
    public int getnewPosX(){
        return newPosX;
    }

    public void setnewPosX(int newPosX){
        this.newPosX = newPosX;
    }

    public int getnewPosY(){
        return newPosY;
    }

    public void setnewPosY(int newPosY){
        this.newPosY = newPosY;
    }

    public int puntuacion(){
        return puntuacion;


    }

    public void puntuacion(int puntuacion){
        this.puntuacion = puntuacion;
    }

    public void move(int newPosX, int newPosY){
        this.newPosX = newPosX;
        this.newPosY = newPosY;


}
    public void pickupBola(){

        puntuacion = 10;

    
}
    public void pickupBolaEspecial(){
 
}

    public void pickupFruita(){

        puntuacion = 40;
    
}

    public void loseLife(int vidas){

        vidas--;
    
}

    public void detectColisionFantasma(fantasma){
        return newPosX = fantasma.getnewPosX();
        return newPosY = fantasma.getnewPosY(); 
}
}


class Main {
    public static final void main(String[] args) {
        pacma pacma = new pacma(0, 0);
        pacma fantasma = new pacma(1, 1);

        System.out.println(pacma.getnewPosX() + pacma.getnewPosY());
        System.out.println(fantasma.getnewPosX() + fantasma.getnewPosY);
    }
}


public class fantasma{

    private int newPosX;
    private int newPosY;



    public fantasma(int newPosX, int newPosY){

        this.newPosX = newPosX;
        this.newPosX = newPosY;
}

    public int getnewPosX(){
        return newPosX;
}

    public void setnewPosX(int newPosX){
        this.newPosX = newPosX;
}



    public int getnewPosY(){
        return newPosY;
}

    public void setnewPosY(int newPosY){
        this.newPosY = newPosY;
}


    public void move(int newPosX, int newPosY){
        this.newPosX = newPosX;
        this.newPosY = newPosY;

}
}