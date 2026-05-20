import tkinter as tk
root = tk.Tk()

root.title("Calculadora")

root.config(width=400, height=400, bg="black")

class Boton:
    def __init__(self,texto,fila,columna):
        self.boton = tk.Button(
            text=texto,
            bg="blue",
            fg="white",
            font=("Arial",14,"bold"),
            width=3,
            height=2
        )
        self.boton.grid(row=fila,column=columna,padx=5,pady=5)



Boton7 = Boton("7",2,1)
Boton8 = Boton("8",2,2)
Boton9 = Boton("9",2,3)
Boton4 = Boton("4",3,1)
Boton5 = Boton("5",3,2)
Boton6 = Boton("6",3,3)
Boton1 = Boton("1",4,1)
Boton2 = Boton("2",4,2)
Boton3 = Boton("3",4,3)

BotonBarra = Boton("/",2,4)
BotonAsterisco = Boton("*",3,4)
BotonResta = Boton("-",4,4)
BotonSuma = Boton("+",5,4)

BotonC = Boton("C",5,1)
Boton0 = Boton("0",5,2)
BotonP = Boton(".",5,3)

BotonResultado = tk.Button(text="Resultado", bg="blue", fg="white", font=("Arial",14,"bold"), width=17,height=1)
BotonResultado.grid(row=1, column=1 ,columnspan=4,padx=5,pady=5,)


















root.mainloop()