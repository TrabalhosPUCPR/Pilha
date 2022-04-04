public class pilha {
    private String dado[];
    private int tamMax;

    public pilha(int tamMax){
        this.posPilha = -1;
        this.tamMax = tamMax;
        dado = new String[tamMax];
    }

    public static pilha cria_pilha(int tam){ // eu nao vejo o motivo de fazer isso, e so chamar o construtor direto 
        pilha pilha = new pilha(tam);
        return pilha;
    } 

    public String topo(){
        if(!vazio()){
            return this.dado[this.posPilha];
        }else{
            return null;
        }
    } 

    public void add(String dado){ // empilha
        if(!cheio()){
            this.posPilha++;
            this.dado[this.posPilha] = dado;
        }else{
            System.out.println("A pilha esta cheia!");
        }
    }
    
    public String remove(){return this.remove(1);} // padrao sem argumento vai remover so o ultimo
    public String remove(int qntd_de_elem){ // desempilha n elementos de tras pra frente
        if(vazio() || tamanho() < qntd_de_elem){
            System.out.println("A pilha esta vazia ou nao contem essa quantidade de elementos para remover");
            return null;
        }else{
            String[] desempilhado = this.dado;
            while(qntd_de_elem > 0){
                desempilhado[posPilha] = null;
                this.posPilha--;
                qntd_de_elem--;
            }
            this.dado = desempilhado;
            return topo();
        }
    }

    private int posPilha;
    public boolean vazio(){
        if(this.posPilha == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean cheio(){
        if(this.posPilha >= this.tamMax-1){
            return true;
        }else{
            return false;
        }
    }

    public int tamanho(){return posPilha+1;}

    public void mudarTamMax(int tamMax){ // nao foi usado
        String[] novoArray = new String[tamMax];
        for(int i = 0; i < this.dado.length; i++){
            if(i + 1 >= tamMax){
                this.dado = novoArray;
                return;
            }
            novoArray[i] = this.dado[i];
        }
        this.dado = novoArray;
        return;
    }
}
