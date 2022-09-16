/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu.de.opciones;
import java.util.*;

public class MenuDeOpciones {
public static void ejercicio1(){
    System.out.println("Ejercicio 1 ");   
System.out.println("Que figura entre 1 = triangulo, 2 = circulo o 3 = cuadrado quiere el area?");
Scanner figura = new Scanner(System.in);
int areacuad, areatri; 
double areacir;
int alturatri, basetri, lado;
double radio;
int forma; 
forma = figura.nextInt(); 
    switch (forma) {
        case 1:
            System.out.println("Ahora porfavor introdusca la altura del triangulo sin decimales");
            Scanner alturatria = new Scanner(System.in);
            alturatri = alturatria.nextInt();
            System.out.println("Ahora porfavor introduce la base del triangulo sin decimales");
            Scanner basetria = new Scanner(System.in);
            basetri = basetria.nextInt();
            areatri = (basetri*alturatri) /2;
            System.out.println("Tu area del triangulo es: "+areatri);
            break;
        case 2:
            Scanner radio2 = new Scanner(System.in);
            System.out.println("Introdusca el radio del circulo, sin decimales: ");
            radio = radio2.nextInt();
            areacir = radio*radio * (3.14);
            System.out.println("Tu area del circulo es: "+areacir);
            break;
        case 3:
            Scanner lados = new Scanner (System.in);
            System.out.println("Introdusca el valor del lado del cuadrado sin decimales");
            lado = lados.nextInt();
            areacuad=lado*lado;
            System.out.println("el area del cuadrado es de: "+areacuad);
            break;
        default:
            break;
    }
   
} 
public static void ejercicio2(){
    System.out.println("Ejercicio 2 ");   
Scanner nums = new Scanner(System.in);
int  num1;
    System.out.println("introdusca el numero a evaluar: ");
num1 = nums.nextInt();
   
}
public static void primos(){
Scanner nums = new Scanner(System.in);
int  num1;
    System.out.println("introdusca el numero a evaluar otra vez: ");
num1 = nums.nextInt();
if (num1 % 2 == 0){
    System.out.println(num1+" es un numero par.");

        }
else {
    System.out.println(num1+" no se par");
}
            
    }
   
public static void ejercicio3(){
Scanner numero = new Scanner (System.in);
    System.out.println("Ingrese el numero a evaluar");
int n1 = numero.nextInt();
    System.out.println("El factorial de: "+n1+" es: "+factorial(n1));

}
public static double factorial (int n){
    double aux = 1;
    for (int i=2;i<=n;i++){
        aux = aux * i;
    }
    return aux;
}
public static void ejercicio4(){
    System.out.println("Ejercicio 4 ");   
Scanner leer = new Scanner (System.in);
int decimal, modulo, aux;
String binario ="";
    System.out.println("Inserte el numero a evaluar: ");
decimal = leer.nextInt();
aux = decimal;
while (decimal > 0){
    modulo = (decimal % 2);
    binario = modulo + binario;
    decimal = decimal/2;
}
    System.out.println("el numero "+aux+" base 10 es = "+binario+" en base 2");
   
}

public static void ejercicio5(){
    System.out.println("Ejercicio 5 ");   
  Scanner cerra = new Scanner(System.in);  
  System.out.println("Buenos dias usuario, porfavor cierre las puertas colocando el numero 1");
int cierro;
cierro = cerra.nextInt();
 if (cierro == 1){
       Scanner piso = new Scanner(System.in);
     System.out.println("Bueno ahora que se cerro la puerta, escriba el numero del piso al que desea ir: ");
      int numpiso;
  numpiso = piso.nextInt();
     System.out.println("Dirigiendonos al piso: "+numpiso);
     System.out.println("llegamos al piso: "+numpiso+" porfavor escriba el numero 2 para abrir las puertas");
 Scanner abri = new Scanner(System.in);  
  System.out.println("coloque el numero 2 para abrir las puertas");
int abrir;
abrir = abri.nextInt();    
if (abrir == 2 ){
    System.out.println("Que tenga un buen dia usuario");
}
else{
    System.out.println("las puertas no se abrieron ");
}
Scanner cerra2 = new Scanner(System.in);  
  System.out.println("porfavor cierre las puertas colocando el numero 3");
int cierro2;
cierro2 = cerra2.nextInt();
if (cierro2 == 3){
    System.out.println("Que tenga un buen dia ");
}
else {
    System.out.println("La puerta no esta cerrada ");
}
 }
 
 else{
     System.out.println("porfavor ingrese el numero 1 para abrir las puertas");
 }
   
}    
public static void ejercicio6(){
    System.out.println("Ejercicio 6 ");   
  String name, producton;
  int precio, cantidad, producto, total;
  double totaldesc;
   Scanner nombre = new Scanner(System.in);  
  System.out.println("Buenos dias usuario, ingrese su nombre");   
name = nombre.nextLine();
Scanner prod = new Scanner(System.in);  
  System.out.println("Clasifique su producto, 1-frutas, 2-Verduras, 3-abarrotes, 4-otros");   
producto = prod.nextInt();
Scanner product = new Scanner(System.in);  
  System.out.println("Como se llama el producto?");   
producton = product.nextLine();
Scanner prec = new Scanner(System.in);  
  System.out.println("Ingrese el precio");   
precio = prec.nextInt();
Scanner can = new Scanner(System.in);  
  System.out.println("Ingrese la cantidad");   
cantidad = can.nextInt();
if (producto == 1){
    totaldesc = precio * cantidad * 0.20;
    System.out.println("Su total a pagar es: "+totaldesc);
}
else if(producto == 2){
    totaldesc = precio * cantidad * 0.20;
    System.out.println("Su total a pagar es: "+totaldesc);
}
else if (producto == 3){
    totaldesc = precio * cantidad * 0.20;
    System.out.println("Su total a pagar es: "+totaldesc);
}
else {
    total = precio * cantidad;
    System.out.println("Su total a pagar es: "+total);
}
   
}    
public static void ejercicio7(){
    System.out.println("Ejercicio 7 ");   
   
   
   
}    
public static void ejercicio8(){
    System.out.println("Ejercicio 8 ");   
   
   
   
}    
public static void ejercicio9(){
    System.out.println("Ejercicio 9 ");   
   
   
   
}    
public static void ejercicio10(){
    System.out.println("Ejercicio 10 ");   
   
   
   
}    
    public static void main(String[] args) {
    Scanner mario = new Scanner(System.in);
    boolean salir = false;
    int opcion;
    while (!salir){
  
        System.out.println("1, opcion 1");
        System.out.println("2, opcion 2");
        System.out.println("3, opcion 3");
        System.out.println("4, opcion 4");
        System.out.println("5, opcion 5");
        System.out.println("6, opcion 6");
        System.out.println("7, opcion 7");
        System.out.println("8, opcion 8");
        System.out.println("9, opcion 9");
        System.out.println("10, opcion 10");
        System.out.println("11, salir");
try {
        System.out.println("introduce un numero");  
        opcion = mario.nextInt();
switch (opcion){
    case 1:
        System.out.println("""
                           Opcion 1 = Crea una aplicaci\u00f3n que nos calcule el \u00e1rea de un c\u00edrculo, cuadrado o
                           triangulo. Pediremos que figura queremos calcular su \u00e1rea y seg\u00fan lo
                           introducido pedir\u00e1 los valores necesarios para calcular el \u00e1rea. Crea un
                           m\u00e9todo por cada figura para calcular cada \u00e1rea, este devolver\u00e1 un n\u00famero
                           real. Muestra el resultado por pantalla.""");
    ejercicio1();    
        break;
     case 2:
         System.out.println("""
                            Opcion 2 = Crea una aplicaci\u00f3n que nos pida un n\u00famero por teclado y con un m\u00e9todo
                            se lo pasamos por par\u00e1metro para que nos indique si es o no un n\u00famero
                            primo, debe devolver true si es primo sino false.""");  
        ejercicio2();
        primos();
         break;
     case 3:
         System.out.println("""
                            Opcion 3 = Crea una aplicaci\u00f3n que nos calcule el factorial de un n\u00famero pedido por
                            teclado, lo realizara mediante un m\u00e9todo al que le pasamos el n\u00famero
                            como par\u00e1metro.""");
    ejercicio3();   
         break;
     case 4:
         System.out.println("""
                            Opcion 4 = Crea una aplicaci\u00f3n que nos convierta un n\u00famero en base decimal a
                            binario. Esto lo realizara un m\u00e9todo al que le pasaremos el numero como
                            par\u00e1metro, devolver\u00e1 un String con el numero convertido a binario.""");
       ejercicio4();
         break;
     case 5:
         System.out.println("""
                            Opcion 5 = Elabore un m\u00e9todo que simule el proceso de subir a un piso en un
                            ascensor, donde el numero de piso es ingresado por teclado.""");
       ejercicio5();
         break;
     case 6:
         System.out.println("""
                            Opcion 6 = En un supermercado se hace un 20% de descuento a los clientes cuya
                            compra supere los 1000 en las \u00e1reas de frutas, verduras y abarrotes. \u00bf
                            Cual sera el total que pagara una persona por su compra ?, se debe
                            
                            mostrar el nombre del cliente , producto, precio , cantidad , descuento y
                            total a pagar.""");
       ejercicio6();
         break;
     case 7:
         System.out.println("""
                            Opcion 7 = Realice un programa que ordene de mayor a menor el siguiente vector
                            V={6, 10, 5, 4, 2, 0, 11, 7, 39, 3, 1, 8, 94, 022, 95}.""");
               ejercicio7();

         break;
     case 8:
         System.out.println("""
                            Opcion 8 = Dise\u00f1e un m\u00e9todo que al ingresar por teclado un numero, si es par mostrar
                            el doble, si es impar mostrar el triple.""");
               ejercicio8();

         break;
     case 9:
         System.out.println("""
                            Opcion 9 = Pida al usuario que introduzca un n\u00famero entre 1 y 1.000. Pinte por pantalla
                            todos los divisores exactos del n\u00famero introducido.""");
               ejercicio9();

         break;
     case 10:
         System.out.println("""
                            Opcion 10 = Desarrolla un programa que pida al usuario que introduzca dos n\u00fameros
                            enteros: la base y el exponente. La base debe estar entre 1 y 10. El
                            exponente entre 1 y 4. El programa debe chequear que ambos valores
                            est\u00e1n dentro de los rangos indicados. En caso de no estarlos, volver a pedir
                            que se introduzcan ambos. Al final el programa presentara en pantalla el
                            resultado de la base elevada al exponente.""");
               ejercicio10();

         break;
     case 11:
    salir = true;    
        break;
        default:
        System.out.println("Las opciones son entre 1 y 11");
    
}
} catch(InputMismatchException e){
    System.out.println("Debes introducir un numero");
    mario.next();
}
    }
        System.out.println("Fin del menu");
    }
    
}
