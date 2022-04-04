public class Expressao {
    //                                        0    1    2    3    4    5
    private static String[] deliminatores = {"(", ")", "[", "]", "{", "}"};
    public static boolean expressaoValido(String expressao){
        pilha delimi = new pilha(10);
        for(int i = 0; i < expressao.length(); i++){
            if(igualDeliminator(Character.toString(expressao.charAt(i)))){
                delimi.add(Character.toString(expressao.charAt(i)));
                try{
                    if(!fechouCorreto(delimi)){
                        System.out.println("A expressao esta INVÁLIDA!");
                        return false;
                    }else if(taFechando(Character.toString(expressao.charAt(i)))){
                        delimi.remove(1); // remove as duas ultimas casas, o que fecha e o q abre
                    }
                }catch(Exception e){
                    System.out.println("A expressao esta INVÁLIDA!");
                    return false;
                }
            }
        }
        if(delimi.vazio()){
            System.out.println("A expressao esta VÁLIDA!");
            return true;
        }else{
            System.out.println("A expressao esta INVÁLIDA!");
            return false;
        }
    }

    private static boolean taFechando(String str){
        for(int i = 1; i < deliminatores.length; i = i+2){
            if(str.equals(deliminatores[i])){return true;}
        }
        return false;
    }

    private static boolean fechouCorreto(pilha pilha2){
        switch(pilha2.topo()){
            case ")":
                if(!pilha2.remove().equals("(")){
                    return false;
                }else{
                    return true;
                }
            case "]":
                if(!pilha2.remove().equals("[")){
                    return false;
                }else{
                    return true;
                }
            case "}":
                if(!pilha2.remove().equals("{")){
                    return false;
                }else{
                    return true;
                }
        }
        return true; // retorna verdadeiro se nao estiver fechando
    }

    private static boolean igualDeliminator(String str){
        for(int i = 0; i < deliminatores.length; i++){
            if(str.equals(deliminatores[i])){
                return true;
            }
        }
        return false;
    }

}
