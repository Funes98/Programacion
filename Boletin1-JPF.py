'''
Created on 4 nov 2022

@author: jesus
'''
'Ejercicio1'
from random import randint
numero=0
eleccion="a"

def numeroAleatorio(numero):
    numero = randint(0, 1000)
    return numero

    
    
lista=[]
for i in range(0 , 100):
    lista.append(numeroAleatorio(numero))
 
       
def numeroMayor():
    mayor=0
    for i in range(len(lista)):
        if lista[i]>mayor:
            mayor=lista[i]
    print(mayor)
    
    
def numeroMenor():
    menor=1000
    for i in range(len(lista)):
        if lista[i]<menor:
            menor=lista[i]
    print(menor)
         
def sumar():
    numero=0
    for i in range(len(lista)):
        numero+=lista[i]

    print(numero)         

def media():
    numero=0
    for i in range(len(lista)):
        numero+=lista[i]

    print(numero/100)

def sustituir(): 
    posicion=int(input("Dime la posicion que quieres sustituir:"))
    while posicion>100:
        posicion=int(input("Dime la posicion que quieres sustituir:"))
    numeroAnadido=int(input("Dime que numero quieres anadir:"))
    lista[posicion] = numeroAnadido
    print(lista)
                  
       
def todosLosNumeros():
    print(lista)
       
while numero>=0:
    print("a. Conocer el mayor")
    print("b. Conocer el menor ")
    print("c. Obtener la suma de todos los numeros ")
    print("d. Obtener la media")
    print("e. Sustituir el valor de un elemento por otro numero inotroducido por teclado")
    print("f. Mostrar todos los numeros") 
    eleccion=input("Dime que opccion eliges:")
     
    
    if eleccion =="a":
        numeroMayor()
    elif eleccion == "b":
        numeroMenor()    
    elif eleccion == "c":
        sumar()
    elif eleccion == "d":
        media()
    elif eleccion == "e":
        sustituir()
    elif eleccion == "f":
        todosLosNumeros()           
    
    
'Ejercicio 2'            
lista = [1,2,3,4,5,6,7,8,9,10]
 
def mueve(lista,posicion):
    derecha = lista[-posicion:]
    izquierda = lista[:-posicion]
    return derecha+izquierda
 
print(mueve(lista,1))
      
'Ejercicio 3'

dia=1
mes=1
anyo=1000


    
        

while dia>0:
    dia = int(input("Dime un dia:"))
    while dia>31:
        dia = int(input("Dime un dia:"))
    mes = input("Dime un mes:")
    while mes!="enero" and mes!="febrero" and mes!="marzo" and mes!="abril" and mes!="mayo" and mes!="junio" and mes!="julio" and mes!="agosto" and mes!="septiembre" and mes!="octubre" and mes!="noviembre" and mes!="diciembre":
        mes = input("Dime un mes:")
    anyo = int(input("Dime el anyo:"))
    while anyo<1900 or anyo>2100:
        anyo = int(input("Dime el anyo:"))
        
    
    
    def fecha(dia, mes, anyo):
        resultado ="La fecha en formato largo es de", dia,"de",mes,"de",anyo
        return resultado
    print(fecha(dia,mes,anyo))
    
    
'Ejercicio 4'
def numeroMayor():
    mayor=0
    numero=0
    while numero<len(lista):
        if lista[numero]>mayor:
            mayor=lista[numero]
            
        numero+=1
        
    return mayor    
    
def numeroPar():
    numero=0
    
    while numero<len(lista):
        if lista[numero]%2==0:
            print(lista[numero])
        numero+=1
        
        
    return numero    
          
           
   
numero=45
lista=[]
while numero>0:
    numero = int(input("Dime un numero:"))
    if numero>0:
        lista.append(numero)         
        
print("El numero mayor es", numeroMayor(),"y los numeros pares son", numeroPar())   



'Ejercicio 5'
 
lista = ["Hola", "que", "tal", "estas"]
lista1 = ["Buenos", "dias", "tu"]  
lista2 = ["vete", "fuera", "de", "aqui", "mentecato"]
    
def reverse(lista1):
    lista1.reverse()
    return lista1

    
print(reverse(lista))
print(reverse(lista1))
print(reverse(lista2))




'Ejercicio 6'
 

lista=[0,1,2,3,4,5,6,7,8,9]   
lista1=[4,5,3,5,3,9,6,1] 
lista2=[1,2]
lista3=[3,4,1]
def estaOrdenada(lista):
    listaVerdadera=lista
    if listaVerdadera==sorted(lista):
        resultado="true"
    elif listaVerdadera!=sorted(lista):
        resultado="false"
    
    return resultado    
   
            
print(estaOrdenada(lista3))

'Ejercicio 7'

def encajan(f1, f2):
    f1pt1=int(f1[1])
    f1pt2=int(f1[3])
    f2pt1=int(f2[1])
    f2pt2=int(f2[3])
    
    if (f1pt1==f2pt1 or f1pt1==f2pt2 or f1pt2==f2pt1 or f1pt2==f2pt2):
        resultado="Encajan"
    else:
        resultado="No encajan"    
    return resultado
ficha1="[3,2]"       
ficha2="[2,5]"    
    
print(encajan(ficha1, ficha2)) 




'Ejercicio 8'

numero=4
lista=[]   
while numero>=0:
    numero= int(input("dime un numero:"))
    if numero>=0:
        lista.append(numero)     
        
        
def sumar(listaza):
    listaza=[3,4,5,6]
    contador=0
    for i in range(len(listaza)):
        if listaza[i]>=0:
            contador+=lista[i]
            
    return contador
def media(listaza):
    listaza=[]
    contador=0
    divisor=0
    for i in range(len(listaza)):
        divisor+=1
        if listaza[i]>=0:
            contador+=listaza[i]
            

    resultado=contador/divisor
    return resultado    
     
     
def factorial(listaza):
    listaza=[3,4,5,6]
    resultado=0
    for i in range(len(listaza)):
        factorial=1
        resta=listaza[i]
        while factorial>1:
            factorial*=resta
            factorial=-1
            print(resta)   
        
            
print("A.Todos los numeros son primos ") 
print("B. El sumatorio") 
print("C. El promedio de los valores")      
print("D.Una lista con el factorial de cada uno de los numeros")                      
        
eleccion= input("Dime que eliges:")     
        
if (eleccion=="A"):
    print("Nada") 
elif (eleccion=="B"):
    print(sumar(lista))        
elif (eleccion=="C"):
    print(media(lista))        
elif (eleccion=="D"):
    print(factorial(lista))  
    
'Ejercicio 9'

        
lista=[1,2,3,4,5,6,8,10,11,12,13,14]        
        
k= 7       
      
def menor(listita, m):
    
    listaFinal=[] 
    for i in range(len(listita)):
        if listita[i]<m:
            listaFinal.append(listita[i])
    return listaFinal
def mayor(listita, m):
    
    listaFinal=[] 
    for i in range(len(listita)):
        if listita[i]>m:
            listaFinal.append(listita[i])
    return listaFinal
def multiplo (listita, m):
    listaFinal=[] 
    for i in range(len(listita)):
        if listita[i]%m==0:
            listaFinal.append(listita[i])
    return listaFinal
    
    

eleccion= input("Dime que eliges(A,B,C)")

if eleccion=="A":
    print(menor(lista, k))
    
elif eleccion=="B":
    print(mayor(lista, k))
elif eleccion=="C":
    print(multiplo(lista, k)) 
else:
    print("Error manito :(")     
    
    
    
    
'Ejercicio 10'
validador=True
numero= input("Dime el numero en binario o decimal:")
letra=numero[-1]
while letra!="B" and letra!="D":
    numero= input("Dime el numero en binario o decimal:")
    letra=numero[-1]
numero=int(numero[:-1])
if letra=="B":
    for i in range(len(str(numero))):
        if numero[i]!="1" and numero[i]!="0":
            validador=False

while validador ==False:
    numero= input("Dime el numero en binario o decimal:")
    letra=numero[-1]
    while letra!="B" and letra!="D":
        numero= input("Dime el numero en binario o decimal:")
        letra=numero[-1]     
        numero=int(numero[:-1])   
    numero=int(numero[:-1])
    if letra=="B":
        for i in range(len(str(numero))):
            if numero[i]!="1" and numero[i]!="0":
                validador=False
    

def conversor(numerito, piruleta):
    numeroDecimal=0
    numeroBinario=0
    if piruleta=="D":
        numeroBinario = str(numerito % 2) + numeroBinario
        numerito = numerito // 2
    return (str)numerito + numeroBinario
        
print(conversor(numero, letra))




'Ejercicio 11'

lista1=[1,2,3,4,6,50]
lista2=[3,4,5,6,23]

def intersect(lista1, lista2):
    listaFinal=[]
    for i in (lista1):
        for x in (lista2):
            if i==x:
                listaFinal.append(i)
        
    return listaFinal

print(intersect(lista1, lista2))


'Ejercicio 12'

lista1=[1,2,3,4,6,50]
lista2=[3,4,5,6,23]

def unionListas(lista1, lista2):
    listarepe=lista1
    listaFinal=[]
    for i in lista2:
        listarepe.append(i)
           
    for i in listarepe:
        if i not in listaFinal:
            listaFinal.append(i)    
          
            
    return listaFinal       
print(unionListas(lista1, lista2)) 



'Ejercicio 13'
def empiezaLetra(lista, letra):
    listaFinal=[]
    for i in range(len(lista)):
        if lista[i][0]==letra:
            listaFinal.append(lista[i])
      
    return listaFinal     


lista=["pepe", "pepa", "pepote", "juan","francisco", "cristiano"]
letra= input("Dime una letra:")[0]  




'Ejercicio 14'

lista=["pepe", "pepa", "pepote", "juan","francisco", "cristiano","hermenegildooooo","raulationcrackkx"]



def cadenaLarga(lista):
    contadorG=0
    contadorI=0
    
    for i in range(len(lista)):
        cadenaGrande="x"
        if len(lista[i])>len(cadenaGrande):
            cadenaGrande=lista[i]
        elif len(lista[i])==len(cadenaGrande):
            cadenaIgual=lista[i]
            cadenaGrande2=cadenaGrande
            cadenaIgual2=lista[i]
            for i in range(cadenaGrande):
                contadorG=0
                for x in range(cadenaGrande2):
                    if i==x:
                        contadorG+=1
                        
            for i in range(cadenaIgual):
                contadorI=0
                for x in range(cadenaIgual2):
                    if i==x:
                        contadorI+=1        
                
            if contadorG>contadorI:
                cadenaGrande=cadenaGrande
            elif contadorG<contadorI:
                cadenaGrande=cadenaIgual          
       
    return cadenaGrande       


print(cadenaLarga(lista))    