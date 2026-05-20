import tkinter
import turtle

from tkinter import *

canvas = Canvas(width=640, height=480, bg="white")
canvas.pack(expand=YES, fill=BOTH)

cosa = 100
cosa2 = 420
for i in range(18):
    if i % 2 == 0:
        canvas.create_oval(cosa, cosa, cosa2, cosa2, fill="red")
    else:
        canvas.create_oval(cosa, cosa, cosa2, cosa2, fill="white")
    cosa += 10
    cosa2 -= 10
mainloop()

