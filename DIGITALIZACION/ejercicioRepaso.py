import random
import tkinter as tk
from tkinter import ttk

import nom

root = tk.Tk()

root.title("Hola")

root.config(width=400, height=400,bg="white")

def validar ():
    if n.get() == n1:
        text.set("Ganadoo!")
    else:
        text.set("Perdido!!")

n1=random.randint(1,10)

label1=tk.Label(text="Dime un numero entre 1 y 10")
label1.place(x=45,y=5)

n=tk.IntVar()
Entrada=tk.Entry(textvariable=n)
Entrada.place(x=45,y=40)

boton=tk.Button(text="Comprobar", command=validar)
boton.place(x=45,y=80)

text = tk.StringVar()
label2=tk.Label(textvariable=text)
label2.place(x=45,y=120)

root.mainloop()