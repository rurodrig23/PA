package trees;

class tree{

    int valor;
    tree left;
    tree right;

    public tree(int valor){
        this.valor = valor;
        left = null;
        right = null;

    }

public int getValor(){
    return valor;

}

public void setValor(){
    this.valor = valor;

}
}