import tkinter as tk
from tkinter import *
from tkinter import ttk
import turtle

root = tk.Tk()

root.title("Practica 0")
root.geometry("600x400")
root.iconbitmap("alemania.ico")
root.config(bg="lightblue")

# Crear una barra de menú

barraMenu = tk.Menu()

menuArchivo = tk.Menu(barraMenu, tearoff=False)
barraMenu.add_cascade(menu=menuArchivo, label="Archivo")

menuAyuda = tk.Menu(barraMenu, tearoff=False)
barraMenu.add_cascade(menu=menuAyuda, label="Ayuda")

root.config(menu=barraMenu)

# Crear un frame container para el formulario

frameFormulario = ttk.Frame(root, padding=5)
frameFormulario.grid(column=0, row=0, sticky="nsew")
frameFormulario.config()

ttk.Label(frameFormulario, text="Regístrate porfavor").grid(column=0, row=0, columnspan=2)

ttk.Label(frameFormulario, text="Nombre:").grid(column=0, row=1, sticky=W)
ttk.Entry(frameFormulario, width=20).grid(column=1, row=1, sticky=W)

ttk.Label(frameFormulario, text="Apellido:").grid(column=0, row=2, sticky=W)
ttk.Entry(frameFormulario, width=20).grid(column=1, row=2, sticky=W)

ttk.Label(frameFormulario, text="Email:").grid(column=0, row=3, sticky=W)
ttk.Entry(frameFormulario, width=20).grid(column=1, row=3, sticky=W)

ttk.Label(frameFormulario, text="Contraseña:").grid(column=0, row=4, sticky=W)
ttk.Entry(frameFormulario, width=20, show="*").grid(column=1, row=4, sticky=W)

ttk.Button(frameFormulario, text="Registrarse").grid(column=1, row=5, sticky=W)

# Frame para mostrar la información del usuario



root.mainloop()
