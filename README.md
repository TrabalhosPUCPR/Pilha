### Um sistema de pilha no java e sistema que verifica se o uso de deliminatores “()”, “{}” e “[]” está válido.

<br>
Questão proposta:

As seguintes operações devem ser implementadas:

a) topo();  // retorna o elemento no topo da pilha

b) vazia();  // retorna 1 se a pilha está vazia e 0 caso contrário

c) cheia();  // retorna 1 se a pilha está cheia e 0 caso contrário

d) empilha(inteiro: elemento)  // coloca o elemento na pilha

e) desempilha();  // retira e retorna o elemento do topo da pilha

f) cria_pilha(n) // cria e retorna uma pilha capaz de armazenar até n elementos

Implementação de validação de delimitadores de expressão aritmética.
a) Modifique a estrutura de Pilha da questão anterior para armazenar caracteres se necessário;

b) Crie uma classe chamada Expressao e nela implemente um método que recebe uma string como 
entrada e verifica se os delimitadores “()”, “{}” e “[]” são utilizados corretamente utilizando 
a Pilha do item “a”. A função deve retornar 1 se a expressão é válida e 0 caso contrário. 
Exemplo: “(1+5)*(56+12)” => válida, “(1+5)*)56+12)” => inválida, “(1+5)*[56+12)” => inválida, (((1+2) - 3 )* 6) => válida. 
Não é necessário considerar prioridade entre os delimitadores.
