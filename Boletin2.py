'''
Created on 22 nov 2022

@author: jesus
'''
'Ejercicio 1'
def computoFactorial(eseNumero):
    resultado=1
    i=0
    if eseNumero>0:
        for i in range(0, eseNumero):
            resultado+=resultado*i
        return resultado
    else:
        return 
    
numero=int(input("Dime un numero entero:"))

print(computoFactorial(numero))

'Ejercicio 2'
      
        
def Bisiesto(anyo):
    if anyo%4==0 and anyo%100==0 and anyo%400==0:
        return True
    elif anyo%4==0 and anyo%100==0:
        return False 
    elif anyo%4==0:
        return True
    else:
        return False
    
    
numero=int(input("Dime un anyo:"))  

print(Bisiesto(numero)) 

'Ejercicio 3'
      
        
def bisiesto(anyo):
    if anyo%4==0 and anyo%100==0 and anyo%400==0:
        return True
    elif anyo%4==0 and anyo%100==0:
        return False 
    elif anyo%4==0:
        return True
    else:
        return False
    
def computarDias(mesesito, anyyo):
    if mesesito>12 or mesesito<1:
        return -1
    elif mesesito==1 or mesesito==3 or mesesito==5 or mesesito==7 or mesesito==8 or mesesito==10 or mesesito==12:
        return "31 dias del anyo", anyyo
    elif bisiesto(anyyo)==True and mesesito==2:
        return "29 dias del anyo", anyyo
    else:
        return "30 dias del anyo", anyyo
    
    
anyo= int(input("Dime el anyo artista:"))  
mes= int(input("Dime el mes artista:")) 

print(computarDias(mes, anyo))



'Ejercicio 4'
def getDay (day, month, year):
    listaDia=["lunes", "martes","miercoles", "jueves", "viernes","sabado","domingo"]
    a = (14 - month) // 12
    y = year-a
    m = month + 12 * a-2
    d = (day + y + y//4 - y//100 + y//400 + (31*m)//12)%7
    
    return listaDia[d-1]

day=int(input("Dime un dia:"))
while day<1 or day>31:
    day=int(input("Error, Dime un dia:"))
    
month=int(input("Dime un mes:"))
while month<1 or month>12:
    month=int(input("Error, Dime un mes:"))
    
year=int(input("Dime un anyo:"))
while year<1:
    year=int(input("Dime un anyo:"))
     

print(getDay(day,month,year)) 



'Ejercicio 5'
      
 
def powerIt(n1, n2):
    return n1**n2  
    
    
numero1=int(input("Dime el numero1:"))
while numero1<0:
    numero1=int(input("Error, Dime el numero1:"))
eleccion=input("Dime si quieres el exponente(Y/N):").upper()
while eleccion!="Y" and eleccion!="N":
    eleccion=input("Error, Dime si quieres el exponente(Y/N):").upper()
    
if eleccion=="Y":
    numero2=int(input("Dime el numero2:"))
    print(powerIt(numero1, numero2))
elif eleccion=="N":
    numero2=0
    print(numero1,"Se ha elevado a 0")
    
    
'Ejercicio 6'
      
   
def getNumberOfDigits(n):
    validador=False
    for i in (n):
        if i=="g" or i=="h" or i=="i" or i=="j" or i=="k" or i=="l" or i=="m" or i=="n" or i=="o" or i=="p" or i=="q" or i=="r" or i=="s"or i=="t" or i=="u" or i=="v" or i=="w" or i=="x" or i=="y" or i=="z":
            validador=True
            return
        elif (i=="a" or i=="b" or i=="c" or i=="d" or i=="e" or i=="f") and n[0]=="-":
            return
    if validador==False and n[0]=="-":
        contador = len(str(n))
        contador= contador-1
        return contador    
    elif validador==False:
            contador = len(str(n))
            return contador  
    
                
        
        
            
    
numero=input("Dime un numero:")

print(getNumberOfDigits(numero))    

'Ejercicio 7'


def esPrimo(n):
    if 0>n or n==1:
        return
    elif n==2:
        return True
    else:
        for i in range(2, n):
            if n%i==0:
                return False
            else:
                return True

numero=int(input("Dime un numero:"))    
print(esPrimo(numero))


'Ejercicio 8'

from math import sqrt
def ecuacion2(n1,n2,n3):
    x1=0
    x2=0
    if ((n2**2)-4*n1*n3)<0:
        return 
    else:
        x1 = (-n2+sqrt(n2**2-(4*n1*n3)))/(2*n1)
        x2 = (-n2-sqrt(n2**2-(4*n1*n3)))/(2*n1)
        return x1, x2
        
                
numero1=int(input("Dime el n1:"))
numero2=int(input("Dime el n2:"))
numero3=int(input("Dime el n3:"))

print(ecuacion2(numero1, numero2, numero3))  



'Ejercicio 9'
def esPrimo(n):
    if 0>n or n==1:
        return
    elif n==2:
        return True
    else:
        for i in range(2, n):
            if n%i==0:
                return False
            else:
                return True


def getPrimeDivisors(n):
    lista=[]
    if n<0:
        for i in range(0,n):
            if n%i==0 and esPrimo(i)==True:
                lista.append(i)
        return lista  
    
numero=int(input("Dime un numero:"))



'Ejercicio 10'
      
        
def nAmigos(n1, n2):
    validador=False
    suma1=0
    suma2=0
    if n1>0:
        for i in range(1,n1):
            if n1%i==0:
                suma1+=i
    if n2>0:
        for i in range(1,n2):
            if n2%i==0:
                suma2+=i            
    if suma1==suma2:
        validador=True
    return validador                
                    
numero1=int(input("Dime un numero:"))  
numero2=int(input("Dime un numero:")) 

print(nAmigos(numero1, numero2))     
                    