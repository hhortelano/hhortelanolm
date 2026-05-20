import random
import tkinter as tk
from email.policy import default
from tkinter import ttk

root = tk.Tk()

root.title("clases")

root.config(width=400, height=400)


class Coche:
    marca= "Toyota"
    def __init__(self, modelo):
        self.modelo = modelo

a = Coche("Corolla")
print(a.marca)
print(a.modelo)



















root.mainloop()