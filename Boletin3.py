'''
Created on 29 nov 2022

@author: jesus
'''
'Ejercicio 1'

def caracteresEnCadena(c, l):
    contador=0
    for i in (c):
        if i ==l:
            contador+=1
    return contador      
         
cadena= input("Dime una cadena:").upper() 
letra= input("Dime una letra:").upper()           
            
print(caracteresEnCadena(cadena, letra))

'Ejercicio 2'

def lowCaseInString(cadenita):
    contador=0
    for i in (cadenita):
        x=i.upper()
        
        if i==x:
            hola=10
        else:
            contador+=1
    return contador        
                
                
cadena=input("Dime una frase:")    
print(lowCaseInString(cadena))


'Ejercicio 3'  

def upperCaseInString(cadenita):
    contador=0
    for i in (cadenita):
        x=i.upper()
        if i==" ":
            hola=12
            
        elif i==x:
            contador+=1
        else:
            hola=12
            
    return contador        
                
                
cadena=input("Dime una frase:")    
print(upperCaseInString(cadena)) 


'Ejercicio 4'  

def numberInString(cadenita):
    contador=0
    for i in (cadenita):
        if i=="0" or i=="1" or i=="2" or i=="3" or i=="4" or i=="5" or i=="6" or i=="7" or i=="8" or i=="9":
            contador+=1
            
    return contador 
            
    
cadena=input("Dime una frase:")
print(numberInString(cadena))



'Ejercicio 5'  
def quitarEspacio(cadenita):
    return cadena.replace(" ","")

def invertir(palabra):
    return palabra[::-1]

def palindromo(cadenita):
    cadenita=quitarEspacio(cadenita).upper()
    contador_posicion=0
    contador1=0
    contador2=0
    invertida=invertir(cadenita)
    invertida=quitarEspacio(invertida).upper()
    for i in(cadenita):
        if i!=" ":
            contador1+=1
            while invertida[contador_posicion]==i and contador1>contador2:
                contador2+=1
            contador_posicion+=1
        
    if contador1==contador2:
        verificador=True
    else:
        verificador=False   
    return verificador 

cadena= input("Dime un palindromo:")
print(palindromo(cadena))



'Ejercicio 6'  
  
def palabraEscondida(palabrita, escon):
    validador=False
    contadorPosicion=0    
    for i in(palabrita):
        while contadorPosicion<len(escon) and escon[contadorPosicion]==i:
                contadorPosicion+=1   
    if len(escon)==contadorPosicion:
        validador=True        
    else: 
        validador=False   
        
    return validador           
   
palabra=input("Dime una palabra:")
escondida=input("Dime la palabra escondida dentro de la palabra:")

print(palabraEscondida(palabra, escondida)) 




'Ejercicio 7'  


  
def tres_cadena(frase, palabra, sustituto):
    validador=False
    posicion=0
    for i in(frase):
        if posicion==len(palabra):
            validador=True
        elif posicion<len(palabra) and palabra[posicion]==i:
            posicion+=1
        else:
            posicion=0
    if validador==True:
        posicion=0
        posicionFrase=0
        for i in(frase):
            
            if posicion==len(palabra):
                validador=True
            elif posicion<len(palabra) and palabra[posicion]==i:
                posicion+=1
                
            else:
                posicion=0
                   
            posicionFrase+=1
             
frase=input("Dime una frase:")
palabra=input("Dime una palabra:")
sustituta=input("Dime una palabra para sustituir:")                  
            
print(tres_cadena(frase, palabra, sustituta)) 



'Ejercicio 8'  

          
def vocales (cadenita):
    contadorA=0
    contadorE=0
    contadorI=0
    contadorO=0
    contadorU=0
    for i in (cadenita):
        if i=="A":
            contadorA=1
        elif i=="E":
            contadorE=1     
        elif i=="I":
            contadorI=1
        elif i=="O":
            contadorO=1
        elif i=="U":
            contadorU=1  
            
    contadorTotal=contadorA+contadorE+contadorI+contadorO+contadorU                                      
    return contadorTotal

cadena=input("Dime una cadena de texto:").upper()

print(vocales(cadena))



'Ejercicio 9'  

          
def ordenaCaracteres(cadenita):
    consonantes=""
    vocales=""
    
    for i in (cadenita):
        if i==" ":
            pass
            
            
        elif i=="A" or i=="E" or i=="I" or i=="O" or i=="U":
            vocales+=i
        else:
            consonantes+=i
    consonantes=consonantes+vocales         
    return consonantes 

cadena=input("Dime una cadena:").upper()           
print(ordenaCaracteres(cadena))



'Ejercicio 10'  

          
def cuentaPalabras(cadenita):
    contador=0
    x="r"
    if cadenita[0]!=" ":
        contador=1
    for i in (cadenita):
            
        if x==" " and i!=" ":
            contador+=1
            
        x=i    
    return contador

cadena="buenas tardes a                todos      " 
print(cuentaPalabras(cadena))