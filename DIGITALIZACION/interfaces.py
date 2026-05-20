import tkinter as tk
from tkinter import ttk



root = tk.Tk()

root.title("Hola")

root.config(width=300, height=300,bg="#447766")

label = tk.Label(root, text="Formulario Datos",bg="#447766", fg="black")
label.place(x=100,y=10,width=100,height=40)



label1 = tk.Label(root, text="Nombre:",bg="#447766", fg="black")
label1.place(x=5,y=70,width=100,height=20)

texto1 = tk.Text()
texto1.place(x=120,y=70,width=160,height=20)



label2 = tk.Label(root, text="Apellidos:",bg="#447766", fg="black")
label2.place(x=5,y=110,width=100,height=20)

texto2 = tk.Text()
texto2.place(x=120,y=110,width=160,height=20)



label3 = tk.Label(root, text="Edad:",bg="#447766", fg="black")
label3.place(x=5,y=150,width=100,height=20)

texto3 = tk.Text()
texto3.place(x=120,y=150,width=160,height=20)



label4 = tk.Label(root, text="Telefono:",bg="#447766", fg="black")
label4.place(x=5,y=190,width=100,height=20)

texto4 = tk.Text()
texto4.place(x=120,y=190,width=160,height=20)




root.mainloop()
