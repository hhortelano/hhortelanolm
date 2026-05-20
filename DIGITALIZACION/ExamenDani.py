import random
import tkinter as tk
from email.policy import default
from tkinter import ttk

root = tk.Tk()

root.title("Conversos de temperatura")

root.config(width=400, height=400, )



def convertir():

    TemperaturaF.set(TemperaturaC.get() + 273.15)

    TemperaturaK.set(TemperaturaC.get() * 1.8 + 32)


label1=tk.Label(text="Temperatura en ºC")
label1.place(x=10,y=10)

TemperaturaC=tk.IntVar()
Entrada1=tk.Entry(textvariable=TemperaturaC)
Entrada1.place(x=140,y=10)

boton1=tk.Button(text="Convertir", command=convertir)
boton1.place(x=10,y=40)

label2=tk.Label(text="Temperatura en F:")
label2.place(x=10,y=75)

TemperaturaF=tk.DoubleVar()
Entrada1=tk.Entry(textvariable=TemperaturaF)
Entrada1.place(x=10,y=110)

label3=tk.Label(text="Temperatura en K:")
label3.place(x=10,y=150)

TemperaturaK=tk.DoubleVar()
Entrada1=tk.Entry(textvariable=TemperaturaK)
Entrada1.place(x=10,y=185)

root.mainloop()