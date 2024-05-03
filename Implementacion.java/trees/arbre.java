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

public void setValor(int valor){
    this.valor = valor;

}

public tree getLeft(){
    return left;

}

public void setLeft(tree left){
    this.left = left;

}

public tree getRight(){
    return right;

}

public void setRight(tree right){
    this.right = right;

}

}