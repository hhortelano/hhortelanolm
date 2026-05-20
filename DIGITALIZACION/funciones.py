import tkinter as tk
from tkinter import ttk



root = tk.Tk()

root.title("Hola")

root.config(width=400, height=400,bg="white")


sexo = tk.BooleanVar(value=True)
estudios = tk.BooleanVar(value=True)


frame1 = tk.Frame(bg="red",width=180,height=180)
frame1.place(x=0,y=0)
label1=tk.Label(frame1,text="Nivel de estudios")
label1.place(x=45,y=5)
radiobutton1=ttk.Radiobutton(frame1,text="Estudios basicos",value=1, variable=estudios)
radiobutton1.place(x=10,y=40)
radiobutton2=ttk.Radiobutton(frame1,text="Estudios medios",value=2, variable=estudios)
radiobutton2.place(x=10,y=90)
radiobutton3=ttk.Radiobutton(frame1,text="Estudios avanzados",value=3, variable=estudios)
radiobutton3.place(x=10,y=140)

frame2 = tk.Frame(bg="yellow",width=180,height=180)
frame2.place(x=220,y=0)
label2=tk.Label(frame2,text="Sexo")
label2.place(x=70,y=5)
radiobutton1=ttk.Radiobutton(frame2,text="Hombre",value=1, variable=sexo)
radiobutton1.place(x=10,y=50)
radiobutton1=ttk.Radiobutton(frame2,text="Mujer",value=2, variable=sexo)
radiobutton1.place(x=10,y=100)

frame3 = tk.Frame(bg="green",width=180,height=180)
frame3.place(x=0,y=220)
label2=tk.Label(frame3,text="Aficiones")
label2.place(x=55,y=5)
checkbutton1=tk.Checkbutton(frame3,text="Cine")
checkbutton1.place(x=5,y=40)
checkbutton2=tk.Checkbutton(frame3,text="Viajes")
checkbutton2.place(x=5,y=90)
checkbutton3=tk.Checkbutton(frame3,text="Deporte")
checkbutton3.place(x=5,y=140)

frame4 = tk.Frame(bg="blue",width=180,height=180)
frame4.place(x=220,y=220)
label2=tk.Label(frame4,text="Dias disponibles")
label2.place(x=45,y=5)
checkbutton1=tk.Checkbutton(frame4,text="Lunes")
checkbutton1.place(x=5,y=40)
checkbutton1=tk.Checkbutton(frame4,text="Miercoles")
checkbutton1.place(x=5,y=90)
checkbutton1=tk.Checkbutton(frame4,text="Viernes")
checkbutton1.place(x=5,y=140)






root.mainloop()