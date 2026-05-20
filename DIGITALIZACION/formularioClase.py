import tkinter as tk
root = tk.Tk()

root.title("Formulario ")

root.config(width=400, height=400)

class Texto:
    def __init__(self,texto,fila,columna):
        self.texto = tk.Label(
            text=texto,
            font=("Arial", 10),
            fg="blue"
        )
        self.texto.grid(row=fila, column=columna, padx=5, pady=5)

class Entry:
    def __init__(self, fila, columna):
        self.entry = tk.Entry(
        width=10,
        font=("Arial", 14),
        sti
        )
        self.entry.grid(row=fila, column=columna, padx=5, pady=5)

Label1 = Texto("Nombre",1,1)
Label2 = Texto("Apellidos",2,1)
Label3 = Texto("Direccion",3,1)
Label4 = Texto("CP",4,1)
Label5 = Texto("Localidad",5,1)
Label6 = Texto("Provincia",6,1)
Label7 = Texto("Pais",7,1)
Label8 = Texto("Edad",8,1)
Label9 = Texto("Profesion",9,1)

Entry1 = Entry(1,2)
Entry2 = Entry(2,2)
Entry3 = Entry(3,2)
Entry4 = Entry(4,2)
Entry5 = Entry(5,2)
Entry6 = Entry(6,2)
Entry7 = Entry(7,2)
Entry8 = Entry(8,2)
Entry9 = Entry(9,2)



















root.mainloop()