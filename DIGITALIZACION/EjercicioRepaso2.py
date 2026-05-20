import random
import tkinter as tk
from tkinter import ttk

root = tk.Tk()

root.title("Hola")

root.config(width=400, height=400,bg="white")

def validar():
    if numero.get() == n1:
        resultado.set("ganado")
    else:
        resultado.set("perdido")


n1=random.randint(1,10)

label1=tk.Label(textvariable=validar,text="Dime un numero del 1 al 10")
label1.place(x=10,y=10)

numero=tk.IntVar()
Entrada=tk.Entry(textvariable=numero)
Entrada.place(x=10,y=45)

resultado=tk.StringVar()
label2=tk.Label(textvariable=resultado)
label2.place(x=10,y=60)

boton1=tk.Button(root,text="Comprobar", command=validar)
boton1.place(x=10,y=80)

















root.mainloop()