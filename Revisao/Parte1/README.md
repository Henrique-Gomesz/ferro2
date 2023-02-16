# Parte 1

Escreva uma classe que represente um país. Um país é representado através dos atributos: código ISO 3166-1 (ex.: BRA), nome (ex.:Brasil), população (ex.: 193.946.886) e a sua dimensão em Km2 (ex.:8.515.767,049). Além disso, cada país mantém uma lista de outros países com os quais ele faz fronteira (vizinho). Escreva a classe em Java e forneça os seus membros a seguir:

a) Construtor que inicialize o código ISO, o nome, a população e a dimensão do país;
b) Métodos de acesso (getter/setter) para as propriedades código ISO, nome, população e dimensão do país;
c) Um método que recebe um país como parâmetro e o adiciona na coleção de vizinhos (adicVizinho(Pais p)).
d) Um método que permita verificar se dois objetos representam o mesmo país (igualdade semântica). Dois países são iguais se tiverem o mesmo código ISO;
e) Um método que receba outro objeto do tipo país como parâmetro e informe se este é limítrofe do país que recebeu o parâmetro;
f) Um método que retorna a densidade populacional do país;
g) Um método que receba um país como parâmetro e retorne a lista de vizinhos comuns aos dois países.
 



Escreva em Java uma classe Continente. Um continente possui um nome e é composto por um conjunto de países (que são objetos descritos acima). Forneça os membros de classe a seguir:
 

a) Construtor que inicialize o nome do continente;
b) Um método que permita adicionar países aos continentes;
c) Um método que retorne a dimensão total do continente;
d) Um método que retorne a população total do continente;
e) Um método que retorne a densidade populacional do continente;
f) Um método que retorne o país com maior população no continente;
g) Um método que retorne o país com menor população no continente;
h) Um método que retorne o país de maior dimensão territorial no continente;
i) Um método que retorne o país de menor dimensão territorial no continente;
j) Um método que retorne a razão territorial do maior pais em relação ao menor país.