
# PARADIGMAS - ARTHUR BOGACKI VERISSIMO

Criar e executar um programa com hierarquia de classes Point, ColorPoint e Point3D, conforme: https://java-programming.mooc.fi/part-9/1-inheritance

----
Objetivo desta atividade consiste em criar três classes em Java (Point, PointColor e Point3D) e trabalhar com heranças.

Primeiramente temos a classe Point:

```java
public class Point{
    private final int x;
    private final int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int manhattamDistanceFromOrigin(){
        return Math.abs(x) + Math.abs(y);
    }
    protected String location(){
        return x + ", " + y;
    }

    @Override
    public String toString(){
        return "(" + this.location() + ")" + this.manhattamDistanceFromOrigin();
    }
}
```

O código cria uma classe chamada Point que contém dois pontos X e Y espressando coordenadas no plano.

A classe contém o Método Construtor **Point** responsável por atribuir os valores x e y para o objeto; 

O método **manhattamDistanceFromOrigin** que retorna a distancia Manhattan dos pontos x e y a partir da origem (0, 0); 

O método **location** que retorna uma string com os pontos x e y; 

O método **toString** que retorna uma string contendo os pontos x e y e a sua *manhattamDistanceFromOrigin*;

----

Segundamente temos a classe **ColorPoint**, uma classe *extends* que é uma subclasse de *Point*

```java
public class ColorPoint extends Point{
    private final String color;

    public ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }

    @Override
    public String toString(){
        return super.toString() + " color: " + color;
    }
}
```

O código cria uma classe **ColorPoint** filha da classe *Point* e atribui ao objeto uma string Color contendo uma cor para os pontos x e y;

------

Por fim, temos a classe **Point3D** também filha da classe *Point* que é responsável por criar um terceiro ponto **z** gerando uma coordenada no espaço tridimensional;

```java
public class Point3D extends Point{
    private final int z;

    public Point3D(int x, int y, int z){
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location(){
        return super.location() + ", " + z;
    }
    @Override
    public int manhattamDistanceFromOrigin(){
        return super.manhattamDistanceFromOrigin() + Math.abs(z);
    }
    @Override
    public String toString(){
        return "(" + this.location() + ")" + this.manhattamDistanceFromOrigin();
    }
}
```

Geramos um novo ponto *z* para o objeto e alteramos as strings para agora trabalhar com três pontos;

TESTANDO
----
Para fins de teste vamos adicionar o seguinte código a classe **Main**:
```java
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4,8));
        points.add(new ColorPoint(1,1, "green"));
        points.add(new ColorPoint(2,5,"Red"));
        points.add(new Point(0,0));
        points.add(new Point3D(2,5,1));
        points.add(new Point3D(3, 1, 3));

        for(Point p : points){
            System.out.println(p);
        }
    }
}
```
Neste trecho de código estamos importando ArrayList para que possibilite usar a classe ArrayList para trabalhar com arrays

Criamos diversos objetos Point, Point3D e ColorPoint e um loop for para percorrer a lista de Points

Obtemos como saída:
```
(4, 8)12
(1, 1)2 color: green
(2, 5)7 color: Red
(0, 0)0
(2, 6, 7)15
(3, 1, 3)7
```
Complementos
------

- Uso de **@Override**
 Por boa prática quando vamos substituir métodos da classe Mãe utilizamos o **@Override**, isso faz com que o compilador verifique se realmente existe um método com aquele nome na classe Mãe, prevenindo erros de digitação;

 - **Math.abs()**
  Retorna o valor absoluto, ou seja, ignorando o sinal;
    
    Exemplo: System.out.println(Math.abs(-5));
    Saída: 5;


Para Compilar:
-----
```java
javac Main.java
java Main
```
END
------